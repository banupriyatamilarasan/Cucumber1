package com.omrBranch.stepdefinition;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;


import com.omrBranch.BaseClassNew;
import com.omrBranch.pagemanager.pageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC1_LoginStep extends BaseClassNew {
	pageObjectManager pom = new pageObjectManager();

	@Given("User is on the OMR Branch hotel page")
	public void user_is_on_the_omr_branch_hotel_page() throws FileNotFoundException, IOException {
		browserLaunch(getPropertyFileValue("browser"));
		enterApplnUrl(getPropertyFileValue("url"));
		maximizeWindow();
		implicitWait();
	}

	@When("User login {string} and {string}")
	public void user_login_and(String emeilId, String passWord) {
		pom.getLogin().login(emeilId, passWord);
	}

	@Then("User should verify success message after login {string}")
	public void user_should_verify_success_message_after_login(String acttextLoginMsg) {
	 String loginSuccessMsg = pom.getSearchHotelPage().getTextLoginSuccessMsg();
	Assert.assertEquals(loginSuccessMsg, acttextLoginMsg, "verify sucess message");
	}

	@When("User login {string} and {string} with enter key")
	public void user_login_and_with_enter_key(String emeilId, String passWord) throws AWTException {
		pom.getLogin().loginWithEnter(emeilId, passWord);

	}

	@Then("User should verify error message after login {string}")
	public void user_should_verify_error_message_after_login(String expLoginErrorMessage) {
		String loginErrorMsg = pom.getLogin().getLoginErrorMsg();
		Assert.assertEquals(expLoginErrorMessage, expLoginErrorMessage, "vreify after error message");

		boolean contains = loginErrorMsg.contains(expLoginErrorMessage);
	 //Assert.assertTrue(contains, "Verify after login msg contains");
		org.junit.Assert.assertTrue("verifying success msg", contains);
	}

}

package com.omrBranch.stepdefinition;



import org.junit.Assert;

//import org.testng.Assert;

import com.omrBranch.BaseClassNew;
import com.omrBranch.pagemanager.pageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC3_SelectHotelStep extends BaseClassNew {
	pageObjectManager pom=new pageObjectManager();
	@When("User save the last hotel name and hotel price")
	public void userSaveTheLastHotelNameAndHotelPrice() {
	pom.getSelectHotel().selectLastHotelName();
	pom.getSelectHotel().selectLastHotelPrice();
	}
	@When("User select the last hotel and accept the alert")
	public void userSelectTheLastHotelAndAcceptTheAlert() {
		pom.getSelectHotel().continueButton();
		pom.getSelectHotel().acceptAlert();
	}
	@Then("User should verify after select success message {string}")
	public void userShouldVerifyAfterSelectSuccessMessage(String exphotel1) {
		//String acthotel = pom.getBookHotel().bookHotel();
		String actbookHotel = pom.getBookHotel().bookHotel();
		Assert.assertEquals(actbookHotel,exphotel1, "verify message successfly");
	}



	@When("User save the second from last hotel name and hotel price")
	public void userSaveTheSecondFromLastHotelNameAndHotelPrice() {
		pom.getSelectHotel().selectSecondFromLastHotelName();
		pom.getSelectHotel().selectSecondFromLastHotelPrice();
	}
	@When("User select the second from last hotel and accept the alert")
	public void userSelectTheSecondFromLastHotelAndAcceptTheAlert() {
		pom.getSelectHotel().selectSecondFromLastHotelPrice();
		pom.getSelectHotel().continueBtn();
		pom.getSelectHotel().acceptAlert();
	}


	@When("User save the first hotel name and hotel price")
	public void userSaveTheFirstHotelNameAndHotelPrice() {
	pom.getSelectHotel().selectFirstHotelName();
	pom.getSelectHotel().selectFirstHotelPrice();
	}
	@When("User select the first hotel and accept the alert")
	public void userSelectTheFirstHotelAndAcceptTheAlert() {
		pom.getSelectHotel().selectFirstHotelName();
		pom.getSelectHotel().continueB();
		pom.getSelectHotel().acceptAlert();	
	}



}

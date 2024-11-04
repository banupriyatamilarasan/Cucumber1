package com.omrBranch.pages;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrBranch.BaseClassNew;

public class Login extends BaseClassNew {
	public Login() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "errorMessage")
	private WebElement textLoginErrorMsg;
	@FindBy(id = "email")
	private WebElement txtEmailId;
	@FindBy(id = "pass")
	private WebElement txtPassword;
	@FindBy(xpath = "//button[@value='login']")
	private WebElement btnLogin;

	public WebElement getTextLoginErrorMsg() {
		return textLoginErrorMsg;
	}

	// public WebElement getBtnLogin() {
	// return btnLogin;
	// }
	public WebElement getTxtEmailId() {
		return txtEmailId;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLoginPage() {
		return btnLogin;
	}

	public void login(String emeilId, String passWord) {
		elementSendKeys(txtEmailId, emeilId);
		elementSendKeys(txtPassword, passWord);
		elementClick(btnLogin);
	}

	public void loginWithEnter(String emeilId, String passWord) throws AWTException {
		elementSendKeys(txtEmailId, emeilId);
		elementSendKeys(txtPassword, passWord);
		pressEnter();
	}

	public String getLoginErrorMsg() {
		String getText = elementGetText(textLoginErrorMsg);
		return getText;
	}

}

package com.omrBranch.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.omrBranch.BaseClassNew;
import com.omrBranch.pagemanager.pageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC4_BookHotelStep extends BaseClassNew{
	pageObjectManager pom=new pageObjectManager();
	@When("User add Guest Details {string},{string},{string},{string} and {string}")
	public void userAddGuestDetailsAnd(String salutation1, String firstName , String lastName, String mobileNo, String email1) {
		pom.getBookHotel().addGuestDetails(salutation1, firstName, lastName, mobileNo, email1);
		
	    }
	@When("User add GST Details {string},{string} and {string}")
	public void userAddGSTDetailsAnd(String enterregistrationNo, String enterCompanyName, String enterCompanyAddress) {
    pom.getBookHotel().addGstDetails(enterregistrationNo, enterCompanyName, enterCompanyAddress);
    pom.getBookHotel().clickNext();
}
	@When("User add Special Request {string}")
	public void userAddSpecialRequest(String Request) {
	pom.getBookHotel().	addRequest(Request);
	   }
	@When("User enter payment details, procced with Card Type {string}")
	public void userEnterPaymentDetailsProccedWithCardType(String paymentType, io.cucumber.datatable.DataTable dataTable) {
	 pom.getBookHotel(). getPayment();
      List<Map<String, String>> asMaps = dataTable.asMaps();
       Map<String, String> map = asMaps.get(0);
       String string2 = map.get("cardtype");
       selectOptionByText(pom.getBookHotel().getCardtype(),string2);
       String string3 = map.get("cardno");
       elementSendKeys(pom.getBookHotel().getCardno(), string3);
       String string4 = map.get("cardName");
       elementSendKeys(pom.getBookHotel().getCardName(), string4);
        String string5 = map.get("month");
        selectOptionByText(pom.getBookHotel().getMonth(), string5);
        String string6 = map.get("year");
        selectOptionByText(pom.getBookHotel().getYear(), string6);
        String string7 = map.get("cvv");
        elementSendKeys(pom.getBookHotel().getCvv(), string7);
        elementClick(pom.getBookHotel().getSubmit());
       
       
	}
	@When("User should verify after hotel booking success message {string} and save the order ID")
	public void userShouldVerifyAfterHotelBookingSuccessMessageAndSaveTheOrderID(String BookingConfirmation) {
	
		//String ordernoConfirmation = pom.getBookingConfirmationPage().getOrdernoConfirmation();
		//Assert.assertEquals("Verify OrderNo", BookingConfirmation, ordernoConfirmation);
		String bookingSucessMsg = pom.getBookingConfirmationPage().getbookingSucessMsg();
		//bookingSucessMsg.contains(bookingSucessMsg)
	org.junit.Assert.assertEquals("verify success message", BookingConfirmation, bookingSucessMsg);
	}
	@Then("User should verify same selected Hotel is booked or not")
	public void userShouldVerifySameSelectedHotelIsBookedOrNot() {
	 pom.getSelectHotel().getselectSuiteHotel();
	}

	
	@When("User click credit card")
	public void userClickCreditCard() {
		pom.getBookHotel().clickCreditCard();
		
	    }
	@When("User click submit without enetring payment details")
	public void userClickSubmitWithoutEnetringPaymentDetails() {
		pom.getBookHotel().clickSumit();
	    }
	@Then("User should verify after payment details error message {string},{string},{string},{string},{string} and {string}")
	public void userShouldVerifyAfterPaymentDetailsErrorMessageAnd(String expinvalidpayment, String expinvalidCardType, String expinvalidCardNo, String expinvalidCardName, String expinvalidmonth, String expinvalidcvv) {
	  WebElement invalidpayment = pom.getBookHotel().getInvalidpayment();
	  Assert.assertEquals("verify success msg", expinvalidmonth, invalidpayment);
	  WebElement invalidCardType = pom.getBookHotel().getInvalidCardType();
	  Assert.assertEquals("verify success msg", expinvalidmonth, invalidCardType);
	  WebElement invalidCardNo = pom.getBookHotel().getInvalidCardNo();
	  Assert.assertEquals("verify success msg", expinvalidmonth,invalidCardNo );
	  WebElement invalidCardName = pom.getBookHotel().getInvalidCardName();
	  Assert.assertEquals("verify success msg", expinvalidmonth,invalidCardName ); 
	  WebElement invalidmonth = pom.getBookHotel().getInvalidmonth();
	  Assert.assertEquals("verify success msg", expinvalidmonth,invalidmonth ); 
	  WebElement invalidcvv = pom.getBookHotel().getInvalidcvv();
	  Assert.assertEquals("verify success msg", expinvalidmonth,invalidcvv ); 
	  


	  
	  
	}


	
	@When("User enter upi details {string} and click submit")
	public void userEnterUpiDetailsAndClickSubmit(String expupiMsg) {
		WebElement upiId = pom.getBookHotel().getUpiId();
		Assert.assertEquals("verify success msg",expupiMsg ,upiId );
		pom.getBookHotel().clickSubmit();
		
	    }

	
	@When("User click upi")
	public void userClickUpi() {
		pom.getBookHotel().upiClick();
	    }
	@Then("User should verify after payment details error message {string}")
	public void userShouldVerifyAfterPaymentDetailsErrorMessage(String actErrorMsg) {
		WebElement expinvalidupiId = pom.getBookHotel().getInvalidupiId();
		Assert.assertEquals("verify success msg",actErrorMsg ,expinvalidupiId);

		
	   }






}

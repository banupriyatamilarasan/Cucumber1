package com.omrBranch.stepdefinition;


import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.omrBranch.pagemanager.pageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC5_ChangeBookingStep {
	pageObjectManager pom=new pageObjectManager();
	@When("User navigate to My Booking page")
	public void userNavigateToMyBookingPage() {
		pom.getMyBookingPage().myBooking();
	
		
	   }
	@Then("User should verify after navigate to My Booking page success message as {string}")
	public void userShouldVerifyAfterNavigateToMyBookingPageSuccessMessageAs(String expSuccess) {
	String acsuccessMsg = pom.getMyBookingPage().bookinSuccessMsg();	
	Assert.assertEquals(acsuccessMsg, expSuccess, "verify message");
	   }
	@When("User search the Order ID")
	public void userSearchTheOrderID() {
	
	 String sucessMsg = pom.getBookingConfirmationPage().getbookingSucessMsg();
		String substring = sucessMsg.substring(1);
		pom.getMyBookingPage().searchOrder(substring);
		
	   }
	@Then("User should verify same booked Order ID is present or not")
	public void userShouldVerifySameBookedOrderIDIsPresentOrNot() {
		
		boolean verifyOrderId = pom.getMyBookingPage().verifyOrderId();
		Assert.assertTrue("verify orderId", verifyOrderId);
	   }
	@Then("User should verify same booked Hotel Name is present or not")
	public void userShouldVerifySameBookedHotelNameIsPresentOrNot() {
		WebElement sameHotel = pom.getBookingConfirmationPage().getSameHotel();
		Assert.assertEquals("verify same hotel name", sameHotel);
	   }
	@Then("User should verify same booked Hotel Price is present or not")
	public void userShouldVerifySameBookedHotelPriceIsPresentOrNot() {
		WebElement sameHotelprice = pom.getBookingConfirmationPage().getSameHotelprice();
		Assert.assertEquals("verify same hotel price", sameHotelprice);
		   

		
	   }
	
	@When("User edit the Check-in Date {string}")
	public void userEditTheCheckInDate(String modifyDate) {
		pom.getMyBookingPage().getDate1();
	   }
	@Then("User should verify after modify check-in date success message {string}")
	public void userShouldVerifyAfterModifyCheckInDateSuccessMessage(String modifyDate) {
		WebElement edit = pom.getMyBookingPage().getEdit();
		Assert.assertEquals(modifyDate,edit , "verify msg");
	    }




}

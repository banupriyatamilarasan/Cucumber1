package com.omrBranch.stepdefinition;



import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.omrBranch.BaseClassNew;
import com.omrBranch.pagemanager.pageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC2_SearchHotelStep extends BaseClassNew{
	pageObjectManager pom=new pageObjectManager();

	
	@When("User search hotel {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void userSearchHotelAnd(String stateName,String cityName,String checkInDate,String checkOutDate,String roomType,String noOfRoom,String adultsCount,String childCount) {
	pom.getSearchHotelPage().searchHotels(stateName, cityName, checkInDate, checkOutDate, roomType, noOfRoom, adultsCount, childCount);
	pom.getSearchHotelPage().clickSearchButton();
	}
	
		@Then("User should verify after search hotel success message {string}")
	public void userShouldVerifyAfterSearchHotelSuccessMessage(String loginSucess) {
			String hotelName = pom.getSelectHotel().selectHotelName();
			Assert.assertEquals(hotelName, loginSucess, "verify success message after login");
	    }
		@When("User search hotel {string},{string},{string},{string},{string} and {string}")
		public void userSearchHotelAnd (String stateName,String cityName, String checkInDate,String checkOutDate,String noOfRoom,String adultsCount)  {
		pom.getSearchHotelPage().selectHotel(stateName, cityName, checkInDate, checkOutDate, noOfRoom, adultsCount);
		pom.getSearchHotelPage().clickSearchButton();
}
		@Then("User click Search button")
		public void userClickSearchButton() {
			pom.getSearchHotelPage().clickSearchButton();
			
		   }
		@Then("User should verify after search hotel error message {string},{string},{string},{string},{string} and {string}")
		public void userShouldVerifyAfterSearchHotelErrorMessageAnd(String expstateErrorMag,String expcityErrorMsg, String expcheckInErrorMsg,String expcheckOutErrorMsg,String expnoOfRoomErrorMsg,String expadultsCountErrorMsg) {
		String errorState1 = pom.getSearchHotelPage().errorState();
		Assert.assertEquals(errorState1,expstateErrorMag, "Verify state error msg");
		String errorCity1 = pom.getSearchHotelPage().errorCity();
		Assert.assertEquals(errorCity1, expcityErrorMsg, "Verify city error msg");
		
		String errorcheckIn1 = pom.getSearchHotelPage().errorcheckIn();
		Assert.assertEquals(errorcheckIn1,expcheckInErrorMsg , "Verify checkIn error msg");
		String errorcheckOut1 = pom.getSearchHotelPage().errorcheckOut();
		Assert.assertEquals(errorcheckOut1,expcheckOutErrorMsg , "Verify checkOut error msg");

		String errorRoom1 = pom.getSearchHotelPage().errorRoom();
		Assert.assertEquals(errorRoom1,expnoOfRoomErrorMsg , "Verify room error msg");
		String errorAdult1 = pom.getSearchHotelPage().errorAdult();
		Assert.assertEquals(errorAdult1,expadultsCountErrorMsg , "Verify adult error msg");
		}

		
		@When("User click sort from low to high")
		public void userClickSortFromLowToHigh() {
		pom.getSelectHotel().lowToHigh1();	
		    }
		@Then("User should verify after sorting that price are listed from low to high")
		public void userShouldVerifyAfterSortingThatPriceAreListedFromLowToHigh() {
		 pom.getSearchHotelPage().priceListLowToHigh();
		
		    }


		
		@When("User click sort from Descending order")
		public void userClickSortFromDescendingOrder() {
			pom.getSearchHotelPage().getDesending();
		   }
		@Then("User should verify after sorting that name in Descending order")
		public void userShouldVerifyAfterSortingThatNameInDescendingOrder() {
			pom.getSearchHotelPage().desendingName();
		   }


		
		@When("User click Suite room type")
		public void userClickSuiteRoomType() {
			pom.getSearchHotelPage().clickSuite();
		  }
		@Then("User should verify after sorting that Suite room type is listed")
		public void userShouldVerifyAfterSortingThatSuiteRoomTypeIsListed() {
		 pom.getSearchHotelPage().getHotel1();
		
			
		    }

		
		@Then("User should verify the header contains {string}")
		public void userShouldVerifyTheHeaderContains(String actSuite) {
			
		   }







			}




















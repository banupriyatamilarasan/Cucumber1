package com.omrBranch.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrBranch.BaseClassNew;

public class SearchHotelPage extends BaseClassNew {
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "//div[text()='Please select state']")
	private WebElement State1;
	@FindBy(xpath = "//div[text()='Please select city']")
	private WebElement city1;
	// @FindBy(xpath="//div[text()='Please select state']")
	// private WebElement roomType1;
	@FindBy(xpath = "//div[text()='Please select Check-in date']")
	private WebElement checkIn1;
	@FindBy(xpath = "//div[text()='Please select Check-out date']")
	private WebElement checkOut1;
	@FindBy(xpath = "//div[text()='Please select no. of rooms']")
	private WebElement noOfRoom1;
	@FindBy(xpath = "//div[text()='Please select no. of adults']")
	private WebElement adult1;
	@FindBy(xpath = "//button[text()='Search']")
	private WebElement search1;
	@FindBy(xpath="//h5[text()='Hyatt Regency Chennai Suite']")
	private WebElement hotel1;
	@FindBy(xpath="//h5[text()='ITC Grand Chola Hotel Suite']")
	private WebElement hotel2;
	@FindBy(xpath="//h5[text()='Radisson Blu Resort Temple Bay Suite']")
	private WebElement hotel3;
	
	@FindBy(xpath="//h5[text()='Taj Fisherman's Cove Resort & Spa Suite']")
	private WebElement hotel4;
	@FindBy(xpath="//h5[text()='//h5[text()='Taj Coromandel Suite']")
	private WebElement hotel5;
	@FindBy(xpath="//h5[text()='//h5[text()='Taj Connemara Suite']")
	private WebElement hotel6;
	

	public WebElement getState1() {
		return State1;
	}

	public WebElement getCity1() {
		return city1;
	}

	public WebElement getCheckIn1() {
		return checkIn1;
	}

	public WebElement getCheckOut1() {
		return checkOut1;
	}

	public WebElement getNoOfRoom1() {
		return noOfRoom1;
	}

	public WebElement getAdult1() {
		return adult1;
	}

	public WebElement getSearch1() {
		return search1;
	}

	public WebElement getHotel1() {
		return hotel1;
	}

	public WebElement getHotel2() {
		return hotel2;
	}

	public WebElement getHotel3() {
		return hotel3;
	}

	public WebElement getHotel4() {
		return hotel4;
	}

	public WebElement getHotel5() {
		return hotel5;
	}

	public WebElement getHotel6() {
		return hotel6;
	}

	@FindBy(xpath = "//a[@data-testid='username']")
	private WebElement textLoginSuccessMsg;
	@FindBy(id = "state")
	private WebElement state;
	@FindBy(id = "city")
	private WebElement city;
	@FindBy(id = "room_type")
	private WebElement roomtype;
	@FindBy(name = "check_in")
	private WebElement checkin;
	@FindBy(xpath = "//a[text()='6']")
	private WebElement date1;
	@FindBy(name = "check_out")
	private WebElement checkout;
	@FindBy(xpath = "//a[text()='8']")
	private WebElement date2;
	@FindBy(id = "no_rooms")
	private WebElement noofroom;
	@FindBy(id = "no_adults")
	private WebElement adult;
	@FindBy(id = "no_child")
	private WebElement child;
	@FindBy(id = "hotelsearch_iframe")
	private WebElement frame;
	@FindBy(id = "searchBtn")
	private WebElement search;
	@FindBy(xpath="//label[text()='Price low to high']")
	private WebElement lowToHigh;
	@FindBy(xpath="//label[text()='Name Descending']")
	private WebElement desending;
	

	
	public WebElement getLoginSuccessMsg() {
		return textLoginSuccessMsg;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getDate1() {
		return date1;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getDate2() {
		return date2;
	}

	public WebElement getNoofroom() {
		return noofroom;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getFrame() {
		return frame;
	}

	public WebElement getSearch() {
		return search;
	}
	public WebElement getLowToHigh() {
		return lowToHigh;
	}

	public WebElement getDesending() {
		return desending;
	}

	// public getSearchHotelPage() {

	public String getTextLoginSuccessMsg() {
		String elementGetText = elementGetText(textLoginSuccessMsg);
		return elementGetText;
	}

	public void searchHotels(String stateName, String cityName, String roomType1, String checkInDate,
			String checkOutDate, String noOfRoom, String adultsCount, String childCount) {
		selectOptionByText(state, stateName);
		selectOptionByText(city, cityName);
		selectOptionByText(roomtype, roomType1);
		elementSendKeysJs(checkin, checkInDate);
		elementSendKeysJs(checkout, checkOutDate);
		selectOptionByText(noofroom, noOfRoom);
		selectOptionByText(adult, adultsCount);
		elementSendKeys(child, childCount);
	}
//private void (WebElement checkin2, String checkInDate) {
	// TODO Auto-generated method stub

	public void clickSearchButton() {
		driver.switchTo().frame(frame);
		elementClick(search);
		driver.switchTo().defaultContent();

	}

	public void selectHotel(String stateName, String cityName, String checkInDate, String checkOutDate, String noOfRoom,
			String adultsCount) {
		selectOptionByText(state, stateName);
		selectOptionByText(city, cityName);

		elementSendKeysJs(checkin, checkInDate);
		elementSendKeysJs(checkout, checkOutDate);
		selectOptionByText(noofroom, noOfRoom);
		selectOptionByText(adult, adultsCount);
	}

	public String errorState() {
		String text = elementGetText(State1);
		return text;

	}

	public String errorCity() {
		String text1 = elementGetText(city1);
		return text1;

	}

	public String errorcheckIn() {
		String text2 = elementGetText(checkIn1);
		return text2;
	}

	public String errorcheckOut() {
		String text3 = elementGetText(checkOut1);
		return text3;

	}

	public String errorRoom() {
		String text4 = elementGetText(noOfRoom1);
		return text4;

	}

	public String errorAdult() {
		String text5 = elementGetText(adult1);
		return text5;
	}

public void priceListLowToHigh() {
	List<Integer>dev=new ArrayList<>();
	List<Integer>qa=new ArrayList<>();
	

List<WebElement> elements2 = driver.findElements(By.tagName("strong"));
for (WebElement price : elements2) {
	String u = price.getText(); 
	System.out.println(u);
	//String s1="$ 2,596";
	String s = u.substring(1,7);
	System.out.println(s);
	//System.out.println(replace);
	 
String p=s.replace("," ,"");
//System.out.println(p);
String trim=p.trim();
System.out.println(trim);
int number=Integer.parseInt(trim);
dev.add(number);
qa.addAll(dev);
}
Collections.sort(qa);
System.out.println(qa);
boolean b = qa.equals(dev);
if(b)
{
	System.out.println("ascending order");
}
else {
	System.out.println("Not");
}
}

	public void desendingName() {

		List<String> dev1 = new ArrayList<>();
		List<String> qa1 = new ArrayList<>();
		List<WebElement> elements1 = driver.findElements(By.tagName("h5"));
		for (WebElement price2 : elements1) {
			String u1 = price2.getText();
			System.out.println(u1);
			dev1.add(u1);
			qa1.addAll(dev1);
		}
		Collections.sort(qa1);

		System.out.println(qa1);
		boolean b1 = qa1.equals(dev1);
		Collections.reverse(qa1);
		System.out.println(qa1);
		boolean c = qa1.equals(dev1);
		if (c) {
			System.out.println("Descending order");

		} else {
			System.out.println("Not");
		}
	}
	public void clickDesending() {
		elementClick(desending);
	}
	public void clickSuite() {
		elementClick(roomtype);
	}

}

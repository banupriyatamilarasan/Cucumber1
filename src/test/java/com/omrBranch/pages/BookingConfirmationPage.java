package com.omrBranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.omrBranch.BaseClassNew;

public class BookingConfirmationPage extends BaseClassNew {
	@FindBy(xpath="//h2[@name='booking-code']//strong")
	private WebElement orderno;
	@FindBy(xpath="//strong[text()='Hyatt Regency Chennai']")
	private WebElement hotelname;
	@FindBy(xpath = "//li[text()='Booking updated successfully']")
	private WebElement success;
	@FindBy(xpath="(//div[@class=\"col-md-5 hotel-suites\"]//h5)[1]")
	private WebElement sameHotel;
	
	@FindBy(xpath="//div[@class=\"col-md-4\"]//strong")
	private WebElement sameHotelprice;
	
	

	public WebElement getSameHotel() {
		return sameHotel;
	}
	public WebElement getSameHotelprice() {
		return sameHotelprice;
	}
	public WebElement getOrderno() {
		return orderno;
	}
	public WebElement getHotelname() {
		return hotelname;
	}
		public WebElement getSuccess() {
			return success;
		
	}
	public void getOrdernoConfirmation() {
		String elementGetText = elementGetText(orderno);
		System.out.println(elementGetText);
	}
	
	
	public String getbookingSucessMsg() {
		String text = elementGetText(success);
		String substring = text.substring(11,20);
		return substring;
		
	}
	public String bookingSucessorNot() {
		String elementGetText1 = elementGetText(sameHotel);
	return elementGetText1;
		
	}
	
	
	

}

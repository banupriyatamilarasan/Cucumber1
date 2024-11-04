package com.omrBranch.pages;

import java.util.List;

//import org.checkerframework.checker.index.qual.SubstringIndexBottom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrBranch.BaseClassNew;

public class MyBookingPage extends BaseClassNew {
	public MyBookingPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='My Booking']")
	private WebElement mybook;

	@FindBy(xpath = "//span[text()='#CTXQR15747']")
	private WebElement id;

	@FindBy(xpath = "//h5[text()='Hyatt Regency Chennai Deluxe']")
	private WebElement hotelname1;

	@FindBy(xpath = "//strong[text()='Rs 2,832']")
	private WebElement pricelist;

	@FindBy(xpath = "(//button[@type='submit'])[1]")
	private WebElement edit;

	@FindBy(name = "check_in")
	private WebElement date;

	@FindBy(xpath = "//a[text()='8']")
	private WebElement date1;

	@FindBy(xpath = "//button[text()='Confirm']")
	private WebElement confirm1;

	@FindBy(xpath = "//li[text()='Booking updated successfully']")
	private WebElement success;

	@FindBy(xpath = "(//a[text()='Cancel'])[1]")
	private WebElement cancel;
	@FindBy(xpath="//input@[name='search']")
private WebElement srch;
	@FindBy(xpath = "//span[text()='#CTXQR15747']")
	private WebElement id1;

	@FindBy(xpath = "//h5[text()='Hyatt Regency Chennai Deluxe']")
	private WebElement hotelname2;

	@FindBy(xpath = "//strong[text()='Rs 2,832']")
	private WebElement pricelist1;

	@FindBy(xpath = "//li[text()='Your booking cancelled successfully']")
	private WebElement cancelalert;

	@FindBy(xpath = "//span[text()='#CTXQR15747']")
	private WebElement cancelorder1;

	public WebElement getMybook() {
		return mybook;
	}

	public WebElement getId() {
		return id;
	}

	public WebElement getHotelname1() {
		return hotelname1;
	}

	public WebElement getPricelist() {
		return pricelist;
	}

	public WebElement getEdit() {
		return edit;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getDate1() {
		return date1;
	}

	public WebElement getConfirm1() {
		return confirm1;
	}

	public WebElement getSuccess() {
		return success;
	}

	public WebElement getCancel() {
		return cancel;
	}

	public WebElement getId1() {
		return id1;
	}

	public WebElement getHotelname2() {
		return hotelname2;
	}

	public WebElement getPricelist1() {
		return pricelist1;
	}

	public WebElement getCancelalert() {
		return cancelalert;
	}

	public WebElement getCancelorder1() {
		return cancelorder1;
	}

	public void myBooking() {
		elementClick(mybook);
	}
	public String bookHotelText() {
		String string = elementGetText(hotelname1);
		String substring = string.substring(0,string.length()-5);
		System.out.println(substring);
		return substring;
	}

	public String bookinSuccessMsg() {
		String text = elementGetText(success);
		return text;
	}

	public String orderId() {
		String substring1 = elementGetText(id);
	System.out.println(substring1);
	if(substring1.contains("#")) {
		substring1=substring1.substring(1,11);
		System.out.println("orderId"+substring1);
	}
	return substring1;
	}
	public void searchOrder(String substring) {
		elementSendKeys(srch, substring);
		
		
	}
	public void modifyDate1(String modifyDate) {
		elementClick(edit);
		elementSendKeys(date, modifyDate);
		elementClick(confirm1);
		
		}
	public void  verifyOrderId() {
	elementGetText(id1);
		
		
		//BookingConfirmationPage.successMsgOrder;
	}
	public void sameHotel() {
		List<WebElement> elements = driver.findElements(By.tagName("h5"));
		for(WebElement t:elements) {
			//String text = t.getText();
			//System.out.println(text);
			boolean equals = elements.equals(t);
			if(equals) {
				System.out.println("same hotel name presend or not");
				
			}
			else {
				System.out.println("Not");
			}
		}
		
	}
	
	
	

}

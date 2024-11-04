package com.omrBranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrBranch.BaseClassNew;

public class BookHotelPage extends BaseClassNew {
	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "invalid-payment_type")
	private WebElement invalidpayment;
	@FindBy(id = "invalid-card_type")
	private WebElement invalidCardType;
	@FindBy(id = "invalid-card_no")
	private WebElement invalidCardNo;
	@FindBy(id = "invalid-card_name")
	private WebElement invalidCardName;
	@FindBy(id = "invalid-card_month")
	private WebElement invalidmonth;
	@FindBy(xpath="invalid-cvv")
	private WebElement invalidcvv;
	@FindBy(xpath = "//a[text()='Book Hotel']")
	private WebElement bookHotel;
	@FindBy(id = "own")
	private WebElement my;
	@FindBy(id = "user_title")
	private WebElement salutation;

	@FindBy(id = "first_name")
	private WebElement firstname;
	@FindBy(id = "last_name")
	private WebElement lastname;
	@FindBy(id = "user_phone")
	private WebElement mobile;
	@FindBy(id = "user_email")
	private WebElement email;
	@FindBy(id = "gst")
	private WebElement g;
	@FindBy(id = "gst_registration")
	private WebElement regist;
	@FindBy(id = "company_name")
	private WebElement company;
	@FindBy(id = "company_address")
	private WebElement address;
	@FindBy(id = "step1next")
	private WebElement next;
	@FindBy(id = "bed")
	private WebElement b;
	@FindBy(id = "other_request")
	private WebElement box;
	@FindBy(xpath = "(//button[text()='Next'])[2]")
	private WebElement next1;
	@FindBy(xpath = "//h5[text()='Credit/Debit/ATM Card']")
	private WebElement payment;
	@FindBy(id = "payment_type")
	private WebElement typepayment;
	@FindBy(id = "card_type")
	private WebElement cardtype;
	@FindBy(id = "card_no")
	private WebElement cardno;
	@FindBy(id="card_name")
	private WebElement cardName;
	@FindBy(id = "card_month")
	private WebElement month;
	@FindBy(id = "card_year")
	private WebElement year;
	@FindBy(id = "cvv")
	private WebElement cvv;
	@FindBy(id = "submitBtn")
	private WebElement submit;
@FindBy(xpath="//option[text()='Credit Card']")
private WebElement creditcard;	
@FindBy(xpath="//h5[text()='UPI']")
private WebElement upi;	
@FindBy(id="upi_id")
private WebElement upiId;	
@FindBy(id="submitBtn")
private WebElement upiSubmit;
@FindBy(id="invalid-upi")
private WebElement invalidupiId;

public WebElement getInvalidupiId() {
	return invalidupiId;
}

public WebElement getCreditcard() {
	return creditcard;
}

	public WebElement getBookHotel() {
		return bookHotel;
	}

	public WebElement getMy() {
		return my;
	}

	public WebElement getSalutation() {
		return salutation;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getG() {
		return g;
	}

	public WebElement getRegist() {
		return regist;
	}

	public WebElement getCompany() {
		return company;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getNext() {
		return next;
	}

	public WebElement getB() {
		return b;
	}

	public WebElement getBox() {
		return box;
	}

	public WebElement getNext1() {
		return next1;
	}

	public WebElement getPayment() {
		return payment;
	}

	public WebElement getTypepayment() {
		return typepayment;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getCardno() {
		return cardno;
	}
	

	public WebElement getInvalidpayment() {
		return invalidpayment;
	}

	public WebElement getInvalidCardType() {
		return invalidCardType;
	}

	public WebElement getInvalidCardNo() {
		return invalidCardNo;
	}

	public WebElement getInvalidCardName() {
		return invalidCardName;
	}

	public WebElement getInvalidmonth() {
		return invalidmonth;
	}
	public WebElement getInvalidcvv() {
		return invalidcvv;
	}


	public WebElement getCardName() {
		return cardName;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public String bookHotel() {
		String l = bookHotel.getText();
		return l;
	}

	public void addGuestDetails(String salutation1, String firstName, String lastName, String mobileNo, String email1) {
		elementClick(my);
		selectOptionByText(salutation,salutation1 );
		elementSendKeys(firstname,firstName );
		elementSendKeys(lastname, lastName);
		elementSendKeys(mobile, mobileNo);
		elementSendKeys(email, email1);
	}

	public void addGstDetails(String enterregistrationNo, String enterCompanyName, String enterCompanyAddress) {
		elementClick(g);
		elementSendKeys(regist, enterregistrationNo);
		elementSendKeys(company, enterCompanyName);
		elementSendKeys(address, enterCompanyAddress);
	}

	public void clickNext() {
		elementClick(next);

	}

	public void addRequest(String Request) {
		elementClick(b);
		elementSendKeys(box, Request);
		elementClick(next1);
	}
	public void cardType1(String paymentCardType) {
		elementClick(payment);
		selectOptionByText(typepayment, paymentCardType);
		
		
	}
	public void paymentDetails(String selectCard,String cardNo,String cardName1,String smonth,String syear ,String scvv ) {
		selectOptionByText(cardtype,selectCard );
		elementSendKeys(cardno,cardNo );
		elementSendKeys(cardName,cardName1 );
		selectOptionByText(month, smonth);
		selectOptionByText(year,syear );
		elementSendKeys(cvv,scvv );
		
		elementClick(submit);
	}
	public void clickCreditCard() {
		elementClick(creditcard);
	}
	public void clickSumit() {
		elementClick(submit);
	}
	public void invalidPayment(String expinvalidpayment, String expinvalidCardType, String expinvalidCardNo , String expinvalidCardName, String expinvalidmonth, String expinvalidcvv) {
	selectOptionByText(invalidpayment, expinvalidpayment);
		selectOptionByText(invalidCardType, expinvalidCardType);
		elementSendKeys(invalidCardNo,expinvalidCardNo );
		elementSendKeys(invalidCardName,expinvalidCardName );
		selectOptionByText(invalidmonth, expinvalidmonth);
	
		elementSendKeys(invalidcvv,expinvalidcvv );
		
		elementClick(submit);
	}

	public WebElement getUpi() {
		return upi;
	}

	public WebElement getUpiId() {
		return upiId;
	}

	public WebElement getUpiSubmit() {
		return upiSubmit;
	}
	public void upiDetails(String expupiMsg) {
		elementSendKeys(upiId, expupiMsg);
	}
		public void clickSubmit() {
			
		
		elementClick(upiSubmit);
	}
		public void upiClick() {
			elementClick(upi);
		}
		public void upiErrorMsg() {
			String text = elementGetText(invalidupiId);
			System.out.println(text);
		}
	
	
	// public void cardType() {
	// elementClick(payment);
	// selectOptionByText(address, card);

}

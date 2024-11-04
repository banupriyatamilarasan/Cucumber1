package com.omrBranch.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrBranch.BaseClassNew;

public class SelectHotelPage extends BaseClassNew {
	public SelectHotelPage() {
	PageFactory.initElements(driver, this);
	}
	public static String lastHotelName;
	public static String lastHotelPrice;
	public static String SecondFromLastHotel;
	public static String FirstHotelName;
	public static String FirstHotelPrice;
	String SecondFromLastHotelPrice;
	@FindBy(xpath="//label[text()='Price low to high']")
	private WebElement lowToHigh;
	@FindBy(xpath="//label[text()='Name Descending']")
	private WebElement desending;
	@FindBy(xpath="//h5[text()='Select Hotel']")
	private WebElement searchhotel;
	@FindBy(tagName="h5")
	private List<WebElement> elements;
	@FindBy(tagName="strong")
	private List<WebElement> elements2;
	
	@FindBy(xpath="//h5[text()='Hyatt Regency Chennai Deluxe']")
	private WebElement book;
	
	@FindBy(xpath="(//a[text()='Continue'])[1]")
	private List< WebElement> con;
	

	public WebElement getLowToHigh() {
		return lowToHigh;
	}
	

	public WebElement getDesending() {
		return desending;
	}


	public WebElement getSearchhotel() {
		return searchhotel;
	}

	public List<WebElement> getElements() {
		return elements;
	}

	public List<WebElement> getElements2() {
		return elements2;
	}

	public WebElement getBook() {
		return book;
	}

	public List <WebElement> getCon() {
		return con;
	}
	public String selectHotelName() {
		String text = elementGetText(searchhotel);
		return text;
	}
public void lowToHigh1() {
	elementClick(lowToHigh);
}
//public void nameDesending() {
	
//}

public void selectLastHotelName(){
	//int size = elements.size();
	WebElement webElement = elements.getLast();
 lastHotelName = webElement.getText();
}
public void selectLastHotelPrice() {
	//int size1 = elements2.size();
	WebElement webElement1 = elements2.getLast();
	 lastHotelPrice = webElement1.getText();
}
public void selectSecondFromLastHotelName() {
	int size = elements.size();
	WebElement t = elements.get(size-1);
	SecondFromLastHotel = t.getText();
	
}
public void selectSecondFromLastHotelPrice() {
	int size = elements2.size();
	WebElement t1 = elements2.get(size-1);
	 SecondFromLastHotelPrice = t1.getText();
}
	
	 public void selectFirstHotelName() {
		
		 WebElement t = elements.getFirst();
		 FirstHotelName = t.getText();
		 
	 }
	 public void selectFirstHotelPrice() {
		
		 WebElement t1 = elements2.getFirst();
		 FirstHotelPrice = t1.getText();
		 
}
	 public void continueB() {
		 //int size = con.size();
		 WebElement first = con.getFirst();
		 elementClick(first);
	 }
	 public void continueBtn() {
		 int size = con.size();
		 WebElement element = con.get(size-1);
		 //String string = element.getText();
		 elementClick(element);
	 }
	 public void continueButton() {
	//int i1 = con.size();
	WebElement last = con.getLast();
	elementClick(last);
	 }
public void getselectSuiteHotel() {
	List<WebElement> elements3 = driver.findElements(By.tagName("h5"));
	for (WebElement webElement : elements3) {
		
	String text = webElement.getText();
	selectOptionByText(webElement, text);
}
}
}



//}
//public void  nameDecending() {
	//elementClick(desending);
//}


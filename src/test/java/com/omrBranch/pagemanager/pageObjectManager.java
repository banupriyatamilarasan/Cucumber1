package com.omrBranch.pagemanager;

import com.omrBranch.pages.BookHotelPage;
import com.omrBranch.pages.BookingConfirmationPage;
import com.omrBranch.pages.Login;
import com.omrBranch.pages.MyBookingPage;
import com.omrBranch.pages.SearchHotelPage;
import com.omrBranch.pages.SelectHotelPage;

public class pageObjectManager {
	private Login login;
	private SearchHotelPage searchHotelPage;
	private SelectHotelPage selectHotel;
	private BookHotelPage bookHotel;
	private BookingConfirmationPage bookingConfirmationPage;
	private MyBookingPage myBookingPage;
	public Login getLogin() {
		return (login==null)? login=new Login():login;
	}

	public SearchHotelPage getSearchHotelPage() {
		return (searchHotelPage==null)? searchHotelPage=new SearchHotelPage():searchHotelPage;
	}
	public SelectHotelPage getSelectHotel() {
		return (selectHotel==null)? selectHotel=new SelectHotelPage():selectHotel;
	}
	public BookHotelPage getBookHotel() {
		return (bookHotel==null)?bookHotel =new BookHotelPage():bookHotel;
	}
	public BookingConfirmationPage getBookingConfirmationPage() {
		return (bookingConfirmationPage==null)? bookingConfirmationPage=new BookingConfirmationPage():bookingConfirmationPage;
	}
	public MyBookingPage getMyBookingPage() {
		return (myBookingPage==null)?myBookingPage=new MyBookingPage():myBookingPage;
	}
	

}

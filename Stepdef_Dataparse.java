package com.adaction_StepDef;

import org.openqa.selenium.Alert;

import com.hotel_booking.Book_a_hotal;
import com.hotel_booking.Log_out;
import com.hotel_booking.Login;
import com.hotel_booking.Search_hotel;
import com.hotel_booking.Select_Hotal;

import Bass_Class.Bass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdef_Dataparse  extends Bass{
	
	public static Login lg=new Login(driver);
	
	@Given("user can be able to launch the url")
	public void user_can_be_able_to_launch_the_url() {
	   urllaunch("https://adactinhotelapp.com/");
	}
	@When("user can be able enter the {string}  in textbox")
	public void user_can_be_able_enter_the_in_textbox(String usearname) {
	    
	
	   sendvalue(lg.getUsearneme(), usearname);
	}
	@When("user can be able to enter the {string} in textboox")
	public void user_can_be_able_to_enter_the_in_textboox(String password) {
	     sendvalue(lg.getPassword(), password);
	}
	@Then("user can be able to click on the login button and it navigates to the search hotel")
	public void user_can_be_able_to_click_on_the_login_button_and_it_navigates_to_the_search_hotel() {
	    click(lg.log_btn);
	}
	
	
	public static Search_hotel sc=new Search_hotel(driver);
	
	
	@When("user can be able to select the {int}  location droupdown")
	public void user_can_be_able_to_select_the_location_droupdown(Integer i) {
	   
	   
	    droupdown_Index(sc.getLocation(), i);
	}
	@When("user can be able to select the Hotels droupdown")
	public void user_can_be_able_to_select_the_hotels_droupdown() {
	   droupdown_Index(sc.getHotels(), 2);
	}
	@When("user can be able to select the  Roomtype droupdown")
	public void user_can_be_able_to_select_the_roomtype_droupdown() {
	   
		droupdown_Index(sc.getGetroom(), 3);
	}
	@When("user can be able to select the Number of Rooms droupdown")
	public void user_can_be_able_to_select_the_number_of_rooms_droupdown() {
	   
		droupdown_Index(sc.getNumberofroom(), 2);
	}
	@When("user can be able to clear the checkin date")
	public void user_can_be_able_to_clear_the_checkin_date() {
	   
		clear(sc.getCheckin_date());
	}
	@When("user can be able to select the date in checkindate sendvalue")
	public void user_can_be_able_to_select_the_date_in_checkindate_sendvalue() {
	   
		sendvalue(sc.getCheckin_date(), "02/02/2023");
	}
	@When("user can be able to clear the checkout date")
	public void user_can_be_able_to_clear_the_checkout_date() {
	   
		clear(sc.getCheckout());
	}
	@When("user can be able to select the date in  checkoutdate droupdown")
	public void user_can_be_able_to_select_the_date_in_checkoutdate_droupdown() {
	    
		sendvalue(sc.getCheckout(), "05/02/2023");
	}
	@When("user can be able to select the Adults per room droupdown")
	public void user_can_be_able_to_select_the_adults_per_room_droupdown() {
	           droupdown_Index(sc.getAdultsper(), 4);
	}
	@When("user can be able to select the Children per room  droupdown")
	public void user_can_be_able_to_select_the_children_per_room_droupdown() {
	   
		droupdown_Index(sc.getChildranperroom(), 3);
		
	}
	@Then("user can be able to click the search button and it navigate to the select hotel page")
	public void user_can_be_able_to_click_the_search_button_and_it_navigate_to_the_select_hotel_page() {
	    
		   clickonelement(sc.getSearch());
		
	}
	
	public static Select_Hotal ss=new Select_Hotal(driver);
	
	
	@When("user can be able to click the select hotel")
	public void user_can_be_able_to_click_the_select_hotel() {
	    
		click(ss.getRadiobutton());
		
	}
	@Then("user can be able to click the continue button and in navigate to the select to book")
	public void user_can_be_able_to_click_the_continue_button_and_in_navigate_to_the_select_to_book() {
	   clickonelement(ss.getContinues());
		}
	
	
	public static Book_a_hotal h=new Book_a_hotal(driver);
	
	
	
	@When("user can be able to  select the first name sendkey")
	public void user_can_be_able_to_select_the_first_name_sendkey() {
	
		sendvalue(h.getFirst_name(), "Jana");
	}
	@When("user can be able to select the last name sendkey")
	public void user_can_be_able_to_select_the_last_name_sendkey() {
	
		sendvalue(h.getLast_name(), "G");
	
	}
	
	
	
	
	
	@When("user can be able to select the buliding address sendkey")
	public void user_can_be_able_to_select_the_buliding_address_sendkey() {
	    
		sendvalue(h.getBuild_Address(),"chennai");
		
	}
	@When("user can be able to select the credit card number sendkey")
	public void user_can_be_able_to_select_the_credit_card_number_sendkey() {
	
		sendvalue(h.getCredite_card(), "1471471471471470");
		
	}
	
	@When("user can be able to select the credit card type droupdown")
	public void user_can_be_able_to_select_the_credit_card_type_droupdown() {
	   
		droupdown_Index(h.getCredit_card_type(), 2);
	
	}
	@When("user can be able to select the select month droupdown")
	public void user_can_be_able_to_select_the_select_month_droupdown() {
	   
		droupdown_Index(h.getExpiry_Date(), 4);
		
	}
	@When("user can be able to select the select year droupdowm")
	public void user_can_be_able_to_select_the_select_year_droupdowm() {
	
		droupdown_Index(h.getSelect_year(), 4);
	
	}
	
	@When("user can be able to select the cvv number sendkey")
	public void user_can_be_able_to_select_the_cvv_number_sendkey() {
	    
		sendvalue(h.getCcv(), "123");
		
	}
	@Then("user can be able to click the search button and it navagte to the book conformation")
	public void user_can_be_able_to_click_the_search_button_and_it_navagte_to_the_book_conformation() {
	
		clickonelement(h.getBook_now());
	
	}
	
	
	public static Log_out l= new Log_out(driver);
	
	@When("user can be able to  click the booked Itinerary")
	public void user_can_be_able_to_click_the_booked_itinerary() {
	    
		clickonelement(l.getBooked());
	}
	@When("user can be able to click the order ide")
	public void user_can_be_able_to_click_the_order_ide() {
		
		click(l.getBook_id());
	}
	@When("user can be able to click the cancel selection")
	public void user_can_be_able_to_click_the_cancel_selection() {
	    
		click(l.getCancel());
		
	}
	@When("user can be able to click the alart ok")
	public void user_can_be_able_to_click_the_alart_ok() {
	   
		Alert a=driver.switchTo().alert();
		//  a.accept();
		a.dismiss();
		
	}
	@Then("user can be able to click on  the logout_btn")
	public void user_can_be_able_to_click_on_the_logout_btn() {
	    
		
		
		
		
	}
	
	

	
	

}

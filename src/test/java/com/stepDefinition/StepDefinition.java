
package com.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.baseclass.BaseClass;
import com.sdp.FileReaderManager;
import com.sdp.PageObjectManager;
import com.testRunner.TestRunner;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;




public class StepDefinition extends BaseClass {

public static WebDriver driver= TestRunner.driver;
public static PageObjectManager pom = new PageObjectManager(driver);


//@Before
//public void before(Scenario s) {
//	// TODO Auto-generated method stub
//	String name = s.getName();
//	System.out.println(name);
//	System.out.println("before hook");
//}

@Given("^user Launch The Application$")
public void user_Launch_The_Application() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
 getUrl("https://adactinhotelapp.com/");
    
}


@When("user Enter The Valid {string} in the Username Field")
public void user_enter_the_valid_in_the_username_field(String Username) {
    // Write code here that turns the phrase above into concrete actions
	sendingParameters(pom.getObjectHomePage().getUserName_Box(), Username);
}
@When("user Enter The Valid {string} in the Password Field")
public void user_enter_the_valid_in_the_password_field(String Password) {
    // Write code here that turns the phrase above into concrete actions
	sendingParameters(pom.getObjectHomePage().getPassWord_Box(), Password);
}


@Then("^user Click the Login Button And It Navigates To SearchHotel Page$")
public void user_Click_the_Login_Button_And_It_Navigates_To_SearchHotel_Page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    clickingElement(pom.getObjectHomePage().getLogin_Button());
}

@When("user Select The {string} From The Dropdown")
public void user_select_the_from_the_dropdown(String location) {
    // Write code here that turns the phrase above into concrete actions
	dropDown("byvisibletext", pom.getObjectSearchHotelPage().getLocation_option(), location );
}
@When("^user Select The Hotels From The Dropdown$")
public void user_Select_The_Hotels_From_The_Dropdown() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	dropDown("byvisibletext", pom.getObjectSearchHotelPage().getHotels(), "Hotel Creek");
    
}

@When("^user Select The Roomtype From The Dropdown$")
public void user_Select_The_Roomtype_From_The_Dropdown() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	dropDown("byindex", pom.getObjectSearchHotelPage().getRoomType(), "2");
    
}

@When("^user Select The Number Of Rooms From The Dropdown$")
public void user_Select_The_Number_Of_Rooms_From_The_Dropdown() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	dropDown("byindex", pom.getObjectSearchHotelPage().getNos(), "1");
    
}

@When("^user Enter The Checkin Date In The Checkin Date Field$")
public void user_Enter_The_Checkin_Date_In_The_Checkin_Date_Field() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	// given default date

}

@When("^user Enter The Checkout Date In The Checkout Date Field$")
public void user_Enter_The_Checkout_Date_In_The_Checkout_Date_Field() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	// given default date
   
}

@When("^user Select The Adults Per Room From The Dropdown$")
public void user_Select_The_Adults_Per_Room_From_The_Dropdown() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	dropDown("byindex", pom.getObjectSearchHotelPage().getAdu(), "1");
    
}

@When("^user Select The Children Per Room From The Dropdown$")
public void user_Select_The_Children_Per_Room_From_The_Dropdown() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	dropDown("byindex", pom.getObjectSearchHotelPage().getCh(), "1");
    
}

@Then("^user Click the Search Button And It Navigates To Select Hotel Page$")
public void user_Click_the_Search_Button_And_It_Navigates_To_Select_Hotel_Page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	clickingElement(pom.getObjectSearchHotelPage().getSubmit());
    
}

@When("^user Select The Radio Button For The Hotel Creek$")
public void user_Select_The_Radio_Button_For_The_Hotel_Creek() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	timeOuts(5, TimeUnit.SECONDS);
	clickingElement(pom.getObjectSelectHotelPage().getRadioButton());
   
}

@Then("^user Click On The Continue Button And It Navigates To Book Hotel Page$")
public void user_Click_On_The_Continue_Button_And_It_Navigates_To_Book_Hotel_Page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	clickingElement(pom.getObjectSelectHotelPage().getContinue_button());
   
}

@When("^user Enter The First Name In The Firstname Field$")
public void user_Enter_The_First_Name_In_The_Firstname_Field() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	String firstname = FileReaderManager.getInstanceFRM().getInstanceFR().firstname();
	sendingParameters(pom.getObjectAdressAndPaymentPage().getFn(), firstname);
    
}

@When("^user Enter The Lasst Name In The Lastname Field$")
public void user_Enter_The_Lasst_Name_In_The_Lastname_Field() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	String lasttname = FileReaderManager.getInstanceFRM().getInstanceFR().lasttname();
	sendingParameters(pom.getObjectAdressAndPaymentPage().getLn(), lasttname);
    
}

@When("^user Enter The Billing Address In the Billing Address Field$")
public void user_Enter_The_Billing_Address_In_the_Billing_Address_Field() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	String address = FileReaderManager.getInstanceFRM().getInstanceFR().address();
	sendingParameters(pom.getObjectAdressAndPaymentPage().getAd(), address);
   
}

@When("^user Enter The Credit Card Number In The Credit Card Field$")
public void user_Enter_The_Credit_Card_Number_In_The_Credit_Card_Field() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	String ccnumber = FileReaderManager.getInstanceFRM().getInstanceFR().ccnumber();
	sendingParameters(pom.getObjectAdressAndPaymentPage().getCc(), ccnumber);
   
}

@When("^user Select The Credit Card Type From The Dropdown$")
public void user_Select_The_Credit_Card_Type_From_The_Dropdown() throws Throwable {
    // Write code here that turns the phrase above into concrete actions

	dropDown("byindex", pom.getObjectAdressAndPaymentPage().getCreditCard(), "2");
    
}

@When("^user Select The Expiry Month From The Dropdown$")
public void user_Select_The_Expiry_Month_From_The_Dropdown() throws Throwable {
    // Write code here that turns the phrase above into concrete actions

	dropDown("byindex", pom.getObjectAdressAndPaymentPage().getMonth(), "2");
   
}

@When("^user Select The Expiry Year From The Dropdown$")
public void user_Select_The_Expiry_Year_From_The_Dropdown() throws Throwable {
    // Write code here that turns the phrase above into concrete actions

	dropDown("byindex", pom.getObjectAdressAndPaymentPage().getYear(), "12");
    
}

@When("^user Enter The CVV Number In The CVV Number Field$")
public void user_Enter_The_CVV_Number_In_The_CVV_Number_Field() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	String cvv = FileReaderManager.getInstanceFRM().getInstanceFR().cvv();
	sendingParameters(pom.getObjectAdressAndPaymentPage().getCvv(),cvv);
}

@Then("^user Click The Book Now Button And It Navigates To Conformation Page$")
public void user_Click_The_Book_Now_Button_And_It_Navigates_To_Conformation_Page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	clickingElement(pom.getObjectAdressAndPaymentPage().getBook());
    
}

@Then("^user Click The My Itenary Button And It Navigates To Itenary Page$")
public void user_Click_The_My_Itenary_Button_And_It_Navigates_To_Itenary_Page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	clickingElement(pom.getConformationPage().getLink());
    
}

}

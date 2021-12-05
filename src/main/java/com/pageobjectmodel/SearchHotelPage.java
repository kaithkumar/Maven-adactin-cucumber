/**
 * 
 */
package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage {
    public WebDriver driver;
	public SearchHotelPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//select[@name='location']")
	private WebElement Location_option;
	
	@FindBy(xpath="//select[@name='hotels']")
	private WebElement hotels;
	
	@FindBy(xpath="//select[@name='room_type']")
	private WebElement roomType;
	
	@FindBy(id="room_nos")
	private WebElement nos;
	
	@FindBy(id="adult_room")
	private WebElement adu;
	
	@FindBy(id="child_room")
	private WebElement ch;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submit;
	
	

	@FindBy(xpath="//input[@name='datepick_in']")
	private WebElement checkInDate;
	
	@FindBy(xpath="//input[@name='datepick_out']")
	private WebElement checkOutDate;
	
	/**
	 * @return the driver
	 */
	public WebDriver getDriver() {
		return driver;
	}

	/**
	 * @return the location_option
	 */
	public WebElement getLocation_option() {
		return Location_option;
	}

	/**
	 * @return the hotels
	 */
	public WebElement getHotels() {
		return hotels;
	}

	/**
	 * @return the roomType
	 */
	public WebElement getRoomType() {
		return roomType;
	}

	/**
	 * @return the nos
	 */
	public WebElement getNos() {
		return nos;
	}

	/**
	 * @return the adu
	 */
	public WebElement getAdu() {
		return adu;
	}

	/**
	 * @return the ch
	 */
	public WebElement getCh() {
		return ch;
	}
	
	/**
	 * @return the submit
	 */
	public WebElement getSubmit() {
		return submit;
	}
	
	public WebElement getCheckInDate() {
		return checkInDate;
	}


	public WebElement getCheckOutDate() {
		return checkOutDate;
	}


	
	
}

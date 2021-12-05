
package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AdressAndPaymentPage {
 public WebDriver driver;
 
 public AdressAndPaymentPage(WebDriver driver)
 {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
 }
 
	@FindBy(id="first_name")
	private WebElement fn;
	
	@FindBy(id="last_name")
	private WebElement ln;
	
	@FindBy(id="address")
	private WebElement ad;
	
	@FindBy(id="cc_num")
	private WebElement cc;
	
	@FindBy(id="cc_type")
	private WebElement creditCard;
	
	@FindBy(id="cc_exp_month")
	private WebElement month;
	
	@FindBy(id="cc_exp_year")
	private WebElement year;
	
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	
	@FindBy(id="book_now")
	private WebElement book;
	

	/**
	 * @return the fn
	 */
	public WebElement getFn() {
		return fn;
	}

	/**
	 * @return the ln
	 */
	public WebElement getLn() {
		return ln;
	}

	/**
	 * @return the ad
	 */
	public WebElement getAd() {
		return ad;
	}

	/**
	 * @return the cc
	 */
	public WebElement getCc() {
		return cc;
	}

	/**
	 * @return the creditCard
	 */
	public WebElement getCreditCard() {
		return creditCard;
	}

	/**
	 * @return the month
	 */
	public WebElement getMonth() {
		return month;
	}

	/**
	 * @return the year
	 */
	public WebElement getYear() {
		return year;
	}

	/**
	 * @return the cvv
	 */
	public WebElement getCvv() {
		return cvv;
	}

	/**
	 * @return the book
	 */
	public WebElement getBook() {
		return book;
	}
	
}

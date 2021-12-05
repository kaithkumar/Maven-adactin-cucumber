/**
 * 
 */
package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ConformationPage {

	public WebDriver driver;
	public ConformationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement link;
	/**
	 * @return the link
	 */
	public WebElement getLink() {
		return link;
	}
	
	
}

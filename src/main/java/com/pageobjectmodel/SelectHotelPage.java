/**
 * 
 */
package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage {

	public WebDriver driver;
	public SelectHotelPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement radioButton;
	
	@FindBy(id="continue")
	private WebElement continue_button;
	

	/**
	 * @return the radioButton
	 */
	public WebElement getRadioButton() {
		return radioButton;
	}

	/**
	 * @return the continue_button
	 */
	public WebElement getContinue_button() {
		return continue_button;
	}
}

/**
 * 
 */
package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;

	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement userName_Box;
	
	@FindBy(id="password")
	private WebElement passWord_Box;
	
	@FindBy(name="login")
	private WebElement login_Button;

	/**
	 * @return the driver
	 */
	public WebDriver getDriver() {
		return driver;
	}

	/**
	 * @return the userName_Box
	 */
	public WebElement getUserName_Box() {
		return userName_Box;
	}

	/**
	 * @return the passWord_Box
	 */
	public WebElement getPassWord_Box() {
		return passWord_Box;
	}

	/**
	 * @return the login_Button
	 */
	public WebElement getLogin_Button() {
		return login_Button;
	}
}

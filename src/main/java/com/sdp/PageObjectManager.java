/**
 * 
 */
package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pageobjectmodel.AdressAndPaymentPage;
import com.pageobjectmodel.ConformationPage;
import com.pageobjectmodel.HomePage;
import com.pageobjectmodel.SearchHotelPage;
import com.pageobjectmodel.SelectHotelPage;

/**
 * @author 91888
 *
 */
public class PageObjectManager {
	public WebDriver driver;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver=driver;
	}
	
	 private  HomePage hp;
	 private  SearchHotelPage search;
	 private  SelectHotelPage select ;
	 private  AdressAndPaymentPage ap ;
	 private  ConformationPage cp ;
	 
	 public HomePage getObjectHomePage()
	 {
		 if(hp==null)
		 {
			 hp=new HomePage(driver);
		 }
		 return hp;
	 }
	 
	 public SearchHotelPage getObjectSearchHotelPage()
	 {
		 if(search==null)
		 {
			 search=new SearchHotelPage(driver);
		 }
		return search;
		 
	 }
	 public SelectHotelPage getObjectSelectHotelPage()
	 {
		 if(select==null)
		 {
			 select=new SelectHotelPage(driver);
		 }
		 return select;
	 }
	 
	 public AdressAndPaymentPage getObjectAdressAndPaymentPage()
	 {
		 if(ap==null)
		 {
			 ap= new AdressAndPaymentPage(driver);
		 }
		 return ap;
	 }
	 public ConformationPage getConformationPage()
	 {
		 if(cp==null)
		 {
			 cp=new ConformationPage(driver);
		 }
		 return cp;
	 }
	 
}

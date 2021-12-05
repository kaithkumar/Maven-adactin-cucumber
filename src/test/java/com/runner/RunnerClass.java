package com.runner;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import com.baseclass.BaseClass;
import com.sdp.PageObjectManager;
import com.sdp.FileReaderManager;

public class RunnerClass extends BaseClass {
	public static WebDriver driver = webDriverLaunch("chrome");
	
	// logger
	public static Logger log = Logger.getLogger(RunnerClass.class);
	
    public static PageObjectManager pom = new PageObjectManager(driver);
	
  
	public static void main(String[] args) throws IOException {
		
		PropertyConfigurator.configure("log4j.properties");
		
		String url = FileReaderManager.getInstanceFRM().getInstanceFR().url();
		getUrl(url);
		log.info("url launched");
		
		String username = FileReaderManager.getInstanceFRM().getInstanceFR().username();
		sendingParameters(pom.getObjectHomePage().getUserName_Box(), username);
		
		//String password = FileReaderManager.getInstanceFRM().getInstanceFR().password();
		String dataDrivenExcel = dataDrivenExcel("C:\\Users\\91888\\OneDrive\\Desktop\\project task\\Adactin testcases.xlsx",2,5);
		sendingParameters(pom.getObjectHomePage().getPassWord_Box(),dataDrivenExcel);
		
		clickingElement(pom.getObjectHomePage().getLogin_Button());
		log.info("login completed");
		
		//dropDownCheck(pom.getObjectSearchHotelPage().getLocation_option());
		dropDown("byvisibletext", pom.getObjectSearchHotelPage().getLocation_option(), "London");
	
		dropDown("byvisibletext", pom.getObjectSearchHotelPage().getHotels(), "Hotel Creek");

		dropDown("byindex", pom.getObjectSearchHotelPage().getRoomType(), "2");
		
		dropDown("byindex", pom.getObjectSearchHotelPage().getNos(), "1");
	
		dropDown("byindex", pom.getObjectSearchHotelPage().getAdu(), "1");
		
		dropDown("byindex", pom.getObjectSearchHotelPage().getCh(), "1");
	
		clickingElement(pom.getObjectSearchHotelPage().getSubmit());
		
		timeOuts(5, TimeUnit.SECONDS);
		clickingElement(pom.getObjectSelectHotelPage().getRadioButton());
		
		clickingElement(pom.getObjectSelectHotelPage().getContinue_button());
		log.info("search hotel page complete");
		String firstname = FileReaderManager.getInstanceFRM().getInstanceFR().firstname();
		sendingParameters(pom.getObjectAdressAndPaymentPage().getFn(), firstname);
		
		String lasttname = FileReaderManager.getInstanceFRM().getInstanceFR().lasttname();
		sendingParameters(pom.getObjectAdressAndPaymentPage().getLn(), lasttname);
		
		String address = FileReaderManager.getInstanceFRM().getInstanceFR().address();
		sendingParameters(pom.getObjectAdressAndPaymentPage().getAd(), address);
		
		String ccnumber = FileReaderManager.getInstanceFRM().getInstanceFR().ccnumber();
		sendingParameters(pom.getObjectAdressAndPaymentPage().getCc(), ccnumber);
		
		dropDown("byindex", pom.getObjectAdressAndPaymentPage().getCreditCard(), "2");
		
		dropDown("byindex", pom.getObjectAdressAndPaymentPage().getMonth(), "2");
		
		dropDown("byindex", pom.getObjectAdressAndPaymentPage().getYear(), "12");
		
		String cvv = FileReaderManager.getInstanceFRM().getInstanceFR().cvv();
		sendingParameters(pom.getObjectAdressAndPaymentPage().getCvv(),cvv);
		
		clickingElement(pom.getObjectAdressAndPaymentPage().getBook());
		log.info("address page completed");
		
		clickingElement(pom.getConformationPage().getLink());
		log.info("confromation page completed");
		
		takeScreenShot("adactin");
		log.info("screenshot taken");
		
	}

}

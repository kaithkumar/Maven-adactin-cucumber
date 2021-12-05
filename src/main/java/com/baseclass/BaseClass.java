package com.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;



public class BaseClass {
     
	public static WebDriver driver;
	public static String value;
	
	
	// browser launch  and maximizing
	public static WebDriver webDriverLaunch(String driverName) {
		
		if(driverName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(driverName.equalsIgnoreCase("FireFox"))
		{ 
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+ "\\Driver\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
			return driver;
	}
	
	
	
	// get URL
	
	public static void getUrl(String URL) 
	{
      driver.get(URL);
	}
	
	
	// sendKeys method
	
	public static void sendingParameters(WebElement element, String value) 
	{
		element.sendKeys(value);
	}
	
	
	
	// click method
	
	public static void clickingElement(WebElement element) 
	{
		element.click();
	}
	
	
	// printing options in the dropdown & checking multi or single dropdown 
	public static void dropDownCheck(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		for(WebElement k: options)
		{
		  System.out.println(k.getText());
		}

		System.out.println("muti select dropedown or single select dropdown");
		
	     if(s.isMultiple()==true)
		     System.out.println("it is a multiple dropdown");
	    else 
		    System.out.println(" it is a single dropdown");
	     
	     System.out.println(" index to be selected between  0 &  " + (options.size()-1));
	}
	
	
	
     // Dropdown method for select by index, value and visible text
 
	public static void dropDown(String selectType, WebElement element, String value) {
		
		Select s = new Select(element);
	 
		try {
			if(selectType.equalsIgnoreCase("Byvalue"))
			{
				s.selectByValue(value);
			}
			else if(selectType.equalsIgnoreCase("ByVisibleText"))
			{
				s.selectByVisibleText(value);
			}
			else if(selectType.equalsIgnoreCase("ByIndex"))
			{
				int number =Integer.parseInt(value);
				s.selectByIndex(number);
			}
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	
	
	//timeOuts
	
	public static void timeOuts(int time, TimeUnit duration) 
	{
			driver.manage().timeouts().implicitlyWait(time, duration);
	}
		
	
	
	
	//Taking Screen shot

    public static void takeScreenShot(String imgName) throws IOException 
    {
	
    TakesScreenshot ts = (TakesScreenshot)driver;
    File source = ts.getScreenshotAs(OutputType.FILE);
    File destination = new File("C:\\Users\\91888\\eclipse-workspace\\Maven\\ScreenShot\\"+imgName+".png");
    FileHandler.copy(source,destination);
    
   }
    
    //JavaScript Executor
   
	public static void usingJavaScript(String action, WebElement element, String keys) 
	{
		try {
	JavascriptExecutor js =(JavascriptExecutor) driver;
	
	if(action.equalsIgnoreCase("scroll"))
	{
	 js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	else if (action.equalsIgnoreCase("click"))
	{
		js.executeScript("arguments[0].click();", element);
	}
	else if(action.equalsIgnoreCase("sendkeys"))
	{
		js.executeScript("arguments[0].value='"+keys+"';", element);
	}
	else if(action.equalsIgnoreCase("scrolldown"))
	{
		js.executeScript("window.scrollBy(0,documnet.body.scrollHeight);","");
	}
	else if(action.equalsIgnoreCase("Scrollup"))
	{
		js.executeScript("window.scroll(0,0);", "");
	}
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}	
	
	// data Driven framework
	public static String dataDrivenExcel(String path, int rowIndex, int cellIndex) throws IOException 
	{
		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);
		Row row2 = sheetAt.getRow(rowIndex);
		Cell cell = row2.getCell(cellIndex);
		CellType ct = cell.getCellType();
		if(ct.equals(CellType.STRING))
		{
			String stringCellValue = cell.getStringCellValue();
			value = stringCellValue;
		}
		else if (ct.equals(CellType.NUMERIC))
		{
			double numericCellValue = cell.getNumericCellValue();
			 
			int num = (int)numericCellValue;
			value = String.valueOf(num);
		}
		return value;
	}

}

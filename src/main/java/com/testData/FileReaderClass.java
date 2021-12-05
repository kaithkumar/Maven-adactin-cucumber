/**
 * 
 */
package com.testData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileReaderClass {
	public static Properties p;

	public FileReaderClass() throws IOException
	{
		File f = new File("C:\\Users\\91888\\eclipse-workspace\\Maven\\src\\main\\java\\com\\testData\\TestData.properties");
		FileInputStream fis = new FileInputStream(f);
	    p = new Properties();
	    p.load(fis);
	}
	
	
	public String url() {
		String url = p.getProperty("url");
		return url;
	}
	
	
	public String username() {
		String username = p.getProperty("username");
		return username;
	}
	
	public String  password() {
		String password = p.getProperty("password");
		return password;
	}
	
	public String firstname() {
		String firstname = p.getProperty("firstname");
		return firstname;
	}
	public String lasttname() {
		String lasttname = p.getProperty("lastname");
		return lasttname;
	}
	public String address() {
		String address = p.getProperty("address");
		return address;
	}
	public String ccnumber() {
		String ccnumber = p.getProperty("ccnumber");
		return ccnumber;
	}
	
	public String cvv() {
		String cvv = p.getProperty("cvv");
		return cvv;
	}
	/**
	 * 
	 */
	public String browser() {
		String browser = p.getProperty("browser");
		return browser;
	}
}

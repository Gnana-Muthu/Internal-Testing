package com.mindtree.Reusable;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import com.mindtree.Utilities.PropertyFile;

public class ReusableMethod extends PropertyFile {
	Properties pro;
	public ReusableMethod() {
		File src=new File("./Configurations/Config.properties");
		try {
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		}catch(Exception e) {
			System.out.println("Exception is "+e.getMessage());
		}
	}
	
	public String getBrowser() {
		String browser=pro.getProperty("browser");
		return browser;
	}
	
	
	public String getApplicationURL() {
		String url=pro.getProperty("baseURL");
		return url;
	}
	
	public String getChromepath() {
		String chrome=pro.getProperty("chromepath");
		return chrome;
	}
	public String getIEpath() {
		String IE=pro.getProperty("iepath");
		return IE;
	}
	public String getFirefoxpath() {
		String firefox=pro.getProperty("firefox");
		return firefox;
	}
	public String getExcelpath() {
		String Excel=pro.getProperty("Excel");
		return Excel;
	}
	public String getFirstname1() {
		String Firstname1=pro.getProperty("FirstName");
		return Firstname1;
	}
	public String getLastname1() {
		String Lastname1=pro.getProperty("LastName");
		return Lastname1;
	}
	public String getPhone() {
		String PhoneNo=pro.getProperty("Phone");
		return PhoneNo;
	}
	public String getEmail1() {
		String Email1=pro.getProperty("Email");
		return Email1;
	}
	public String getAddress() {
		String Address1=pro.getProperty("Address");
		return Address1;
	}
	public String getCity1() {
		String City1=pro.getProperty("City");
		return City1;
	}
	
	public String getState1() {
		String State1=pro.getProperty("State");
		return State1;
	}
	public String getPostal1() {
		String Postal1=pro.getProperty("Postal");
		return Postal1;
	}
	public String getUserName1() {
		String UserName1=pro.getProperty("UserName");
		return UserName1;
	}
	public String getPassword() {
		String password=pro.getProperty("Password");
		return password;
	}
	
	public String getConfirmPassword() {
		String Confirmpassword=pro.getProperty("ConfirmPassword");
		return Confirmpassword;
	}
	public String getUserName2() {
		String UserName2i=pro.getProperty("UserName2");
		return UserName2i;
	}
	public String getPassword2() {
		String password2=pro.getProperty("Password2");
		return password2;
	}
	public String getReport() {
		String ReportPath=pro.getProperty("Report");
		return ReportPath;
	}
	
}

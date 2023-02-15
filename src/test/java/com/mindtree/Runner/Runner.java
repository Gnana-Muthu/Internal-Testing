package com.mindtree.Runner;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mindtree.PageObjects.LoginPageObjects;
import com.mindtree.PageObjects.NegativeSenarioValidationPageObjects;
import com.mindtree.PageObjects.RegisterPageObjects;
import com.mindtree.PageObjects.SearchFlightPageObjects;
import com.mindtree.Reusable.ReusableComponents;
import com.mindtree.Reusable.ReusableMethod;
import com.mindtree.Uistore.LoginUistore;
import com.mindtree.Uistore.RegisterUistore;
import com.mindtree.Utilities.ExcelDriven;
import com.mindtree.Utilities.Sendmail;


public class Runner extends ReusableComponents
{
	ExcelDriven ed=new ExcelDriven();
	LoginUistore ui=new LoginUistore();
	ReusableMethod rm =new ReusableMethod();
	//Logger logger=Logger.getLogger(ReusableComponents.class);
	@BeforeClass
	public void initialize() throws IOException {
		try {
			driver=setup();
			logger.info("Url is opened");
		}catch(Exception e) {
			
		}
		
	}
	@Test (priority=3,dataProvider="login")
	
	public void Login(String Username) {
		driver.get(baseURL);
		logger.info("Url is opened");
		LoginPageObjects lp=new LoginPageObjects(driver);
		lp.Loginclick();
		WebElement Enterusername=driver.findElement(ui.Username);
		Enterusername.sendKeys(Username);
		WebElement EnterPassword=driver.findElement(ui.Password);
		EnterPassword.sendKeys(rm.getPassword());
		WebElement Login=driver.findElement(ui.ClickSubmit2);
		 Login.click();
		 logger.info("Login Completed");
		
		
		lp.LoginFunction();
	}
	
	
@Test (priority=2)
	
	public void SearchFlight() {
	driver.get(baseURL);
		SearchFlightPageObjects SF=new SearchFlightPageObjects(driver);
		SF.SearchFlightData();
		logger.info("Search Flight");
	}
	
@Test (priority=1)

public void RegisterUSer() {
	driver.get(baseURL);
	RegisterPageObjects RP=new RegisterPageObjects(driver);
	RP.Register();
	RP.Registerdetails();
	logger.info("Registeration completed");
}
@Test (priority=4)

public void Negativedetails() {
	driver.get(baseURL);
	NegativeSenarioValidationPageObjects NF=new NegativeSenarioValidationPageObjects(driver);
	NF.LoginVerification();
	NF.Hostelvalidation();
}
@DataProvider(name="login")
public Object[][] getexceldata() throws IOException{
	ExcelDriven d=new ExcelDriven();
	ArrayList<String> data= d.getData("gnanamuthugmg@gmail.com");
	int s=data.size();
	Object[][] searchdata=new Object[s][1];
	for(int i=0;i<s;i++) {
		searchdata[i][0]=data.get(i);
	}
	return searchdata;
}
@AfterSuite
public void test() {
	Sendmail.sentEmail();
}

}

package com.mindtree.PageObjects;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

import com.mindtree.Reusable.ReusableMethod;

import com.mindtree.Uistore.RegisterUistore;
import com.mindtree.Utilities.ExcelDriven;


public class RegisterPageObjects extends RegisterUistore {
	
public WebDriver driver;
ReusableMethod rm =new ReusableMethod();
public String Firstname1=rm.getFirstname1();
	public RegisterPageObjects(WebDriver driver)
	{
		this.driver=driver;
	}

	
	
	
	public void Register()
    {
		try
		{
			WebElement ClickRegister=driver.findElement(Registerclick);
			ClickRegister.click();
			
		}
		catch(Exception e)
		{
			System.out.println("cannot able to Click Register");
			
		}
		
    }
	public void Registerdetails()
    {
		try
		{	
			WebElement EnterFirstName=driver.findElement(FirstName);
			EnterFirstName.sendKeys(Firstname1);
			EnterFirstName.sendKeys(Keys.TAB);
			WebElement EnterLastName=driver.findElement(LastName);
			EnterLastName.sendKeys(rm.getLastname1());
			WebElement EnterPhonenumber=driver.findElement(PhoneNumber);
			EnterPhonenumber.sendKeys(rm.getPhone());
			WebElement EnterEmailId=driver.findElement(EmailId);
			EnterEmailId.sendKeys(rm.getEmail1());
			WebElement Enteraddressvalue=driver.findElement(addressvalue);
			Enteraddressvalue.sendKeys(rm.getAddress());
			WebElement EnterCityvalue=driver.findElement(Cityvalue);
			EnterCityvalue.sendKeys(rm.getCity1());
			WebElement Enterstatevalue=driver.findElement(statevalue);
			Enterstatevalue.sendKeys(rm.getState1());
			WebElement Enterpostalvalue=driver.findElement(postalvalue);
			Enterpostalvalue.sendKeys(rm.getPostal1());
			Select Country =new Select(driver.findElement(country));
			Country.selectByVisibleText("INDIA");
			
			WebElement Enterusernamevalue=driver.findElement(usernamevalue);
			Enterusernamevalue.sendKeys(rm.getUserName1());
			WebElement EnterPasswordvalue=driver.findElement(Passwordvalue);
			EnterPasswordvalue.sendKeys(rm.getPassword());
			WebElement EnterconfirmPasswordvalue=driver.findElement(confirmPasswordvalue);
			EnterconfirmPasswordvalue.sendKeys(rm.getConfirmPassword());
			WebElement ClickSubmit=driver.findElement(ClickSubmit1);
			ClickSubmit.click();
			
			 WebElement ReadRegister=driver.findElement(RegisterText);
				System.out.println((ReadRegister).getText());
	
		
			
			
			
			
		}
		catch(Exception e)
		{
			System.out.println("cannot able to RegisterUser");
			
		}
		
    }
	
	
	
}
package com.mindtree.PageObjects;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

import com.mindtree.Reusable.ReusableMethod;
import com.mindtree.Uistore.LoginUistore;
import com.mindtree.Uistore.NegativeSenarioValidationUistore;
import com.mindtree.Utilities.ExcelDriven;


public class NegativeSenarioValidationPageObjects extends NegativeSenarioValidationUistore {
public WebDriver driver;
ReusableMethod rm =new ReusableMethod();

	public NegativeSenarioValidationPageObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	public void LoginVerification()
    {
		try
		{
			WebElement ClickLogin=driver.findElement(ClickSigin);
			ClickLogin.click();
			WebElement Enterusername=driver.findElement(Username);
			Enterusername.sendKeys(rm.getUserName2());
			WebElement EnterPassword=driver.findElement(Password);
			EnterPassword.sendKeys(rm.getPassword2());
			WebElement Login=driver.findElement(ClickSubmit2);
			 Login.click();
	 
			WebElement Checkvalidation=driver.findElement(validationtext);
			System.out.println((Checkvalidation).getText());
			String Actualvalue=Checkvalidation.getText();
			String Expectedvalue="Enter your userName and password correct";
			Assert.assertEquals(Expectedvalue,Actualvalue);
			
			
		}
		catch(Exception e)
		{
			System.out.println("cannot able to Login");
			
		}
		
    }
	
	
	
	public void Hostelvalidation()
    {
		try
		{
		
			
			 
				
		/*	Actions a=new Actions(driver);
			WebElement ClickSale=driver.findElement(Dress);
			a.moveToElement(ClickSale).contextClick().build().perform();
			WebElement Clickdress=driver.findElement(SummerDress);
			Clickdress.click();*/
				WebElement ClickHotel=driver.findElement(ClickHotel1);
				ClickHotel.click();
				WebElement CheckData=driver.findElement(readtext);
				 Thread.sleep(3000);
				String Actualvalue1=CheckData.getText();
				String Expectedvalue1="This section of our web site is currently under construction.   Sorry for any inconvienece.";
				Assert.assertEquals(Expectedvalue1,Actualvalue1);
				System.out.println((CheckData).getText());
				WebElement BackHome=driver.findElement(Backhome);
				BackHome.click();
				
		}
		catch(Exception e)
		{
			System.out.println("cannot able to Login");
			
		}
		
    }
   

    

}
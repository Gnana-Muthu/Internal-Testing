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
import com.mindtree.Utilities.ExcelDriven;


public class LoginPageObjects extends LoginUistore {
public WebDriver driver;
ReusableMethod rm =new ReusableMethod();
	public LoginPageObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	public void Loginclick()
    {
		try
		{
			WebElement ClickLogin=driver.findElement(ClickSigin);
			ClickLogin.click();
			
			
			
		}
		catch(Exception e)
		{
			System.out.println("cannot able to Login");
			
		}
		
    }
	
	
	
	public void LoginFunction()
    {
		try
		{
		
			
			 WebElement CheckLogin=driver.findElement(LoginText);
				System.out.println((CheckLogin).getText());
				String Actualvalue=CheckLogin.getText();
				String Expectedvalue="Login Successfully";
				Assert.assertEquals(Expectedvalue,Actualvalue);
				
		/*	Actions a=new Actions(driver);
			WebElement ClickSale=driver.findElement(Dress);
			a.moveToElement(ClickSale).contextClick().build().perform();
			WebElement Clickdress=driver.findElement(SummerDress);
			Clickdress.click();*/
				WebElement ClickHotel=driver.findElement(ClickHotel1);
				ClickHotel.click();
				WebElement CheckData=driver.findElement(readtext);
				
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
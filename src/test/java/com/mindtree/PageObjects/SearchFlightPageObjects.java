package com.mindtree.PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.mindtree.Reusable.ReusableMethod;

import com.mindtree.Uistore.SearchFlightUistore;


public class SearchFlightPageObjects extends SearchFlightUistore {
public WebDriver driver;
ReusableMethod rm =new ReusableMethod();
	public SearchFlightPageObjects(WebDriver driver)
	{
		this.driver=driver;
	}

	
	public void SearchFlightData()
    {
		try
		{
			 
			WebElement SelectFlight=driver.findElement(ClickFlight);
			SelectFlight.click();
			Thread.sleep(5000);
			WebElement frame1 = driver.findElement(Googleadd1);
		    driver.switchTo().frame(frame1);
		    WebElement frame2 = driver.findElement(Googleadd2);
		    driver.switchTo().frame(frame2);
		    driver.findElement(Googleadd3).click();
		    driver.switchTo().defaultContent();
			WebElement SelectOneway=driver.findElement(ClickOneway);
			SelectOneway.click();
			
			Select passenger =new Select(driver.findElement(ClickPassenger));
			passenger.selectByVisibleText("2");
			Select departure =new Select(driver.findElement(ClickDeparture));
			departure.selectByVisibleText("New York");
			Select FromMonth =new Select(driver.findElement(ClickFrommonth));
			FromMonth.selectByVisibleText("August");
			Select FromDate =new Select(driver.findElement(ClickFromDate));
			FromDate.selectByVisibleText("5");
			Select Arriving =new Select(driver.findElement(ClickArriving));
			Arriving.selectByVisibleText("London");
			Select Tomonth =new Select(driver.findElement(ClickTOmonth));
			Tomonth.selectByVisibleText("September");
			Select ToDate =new Select(driver.findElement(ClickTODate));
			ToDate.selectByVisibleText("10");
			WebElement SelectBusiness=driver.findElement(ClickBusiness);
			SelectBusiness.click();
			Select Airline =new Select(driver.findElement(ClickTOArline));
			Airline.selectByVisibleText("Blue Skies Airlines");
			WebElement SelectContinue=driver.findElement(ClickFindFlight);
			SelectContinue.click();
			
			
			/**/
			
		}
		catch(Exception e)
		{
			System.out.println("cannot able to Username");
			
		}
		
    }

}
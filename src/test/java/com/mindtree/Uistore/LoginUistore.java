package com.mindtree.Uistore;

import org.openqa.selenium.By;

public class LoginUistore {
	

	public static By Username= By.xpath("//input[@name='userName']");
	public static By Password= By.xpath("//input[@name='password']");
	public static By ClickSubmit2= By.xpath("//input[@name='submit']");
	public static By LoginText= By.xpath("//div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/h3");	
	public static By ClickSigin= By.xpath("//a[contains(@href,'login.php')]");
	
	
	
	public static By ClickHotel1= By.xpath("//table/tbody/tr[3]/td[2]/a");
	public static By readtext= By.xpath("//table/tbody/tr[1]/td[2]/table/tbody/tr[3]/td/p/font[1]");
	
	
	public static By Backhome= By.xpath("//table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a");
}
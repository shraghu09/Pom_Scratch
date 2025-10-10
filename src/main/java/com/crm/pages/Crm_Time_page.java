package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Testbase.TestBase;

public class Crm_Time_page extends TestBase{
	
	@FindBy(xpath="//span[text()='Time']")
	private WebElement click_on_time;
	
	public Crm_Time_page()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void select_time()
	{
		click_on_time.click();
	}

}

package com.crm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Testbase.TestBase;

public class Crm_Leave_page extends TestBase{
	
	@FindBy(xpath="//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name' and text()='Leave']")
	private WebElement click_leave;
	
	public Crm_Leave_page()
	{
		PageFactory.initElements(driver, this);
	}
	
	

	public void select_leave()
	{
		click_leave.click();
	}

}

package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Testbase.TestBase;

public class Crm_Myinfo_page extends TestBase{
	
	@FindBy(xpath="//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name' and text()='My Info']")
	private WebElement click_myinfo;
	
	
	public Crm_Myinfo_page()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void select_myinfo()
	{
		click_myinfo.click();
	}
	

}

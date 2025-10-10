package com.crm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Testbase.TestBase;

public class Crm_PIM_pages extends TestBase{
	
	@FindBy(xpath="//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name' and text()='PIM']")
	private WebElement click_PIM;
	
	public Crm_PIM_pages()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void select_Pim()
	{
		click_PIM.click();
	}

}

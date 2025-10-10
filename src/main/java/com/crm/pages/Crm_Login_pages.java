package com.crm.pages;



import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Testbase.TestBase;
import org.testng.Reporter;


public class Crm_Login_pages extends TestBase{
	
	Homepage homepage;
	
	
	@FindBy(name="username")
	private WebElement click_username;
	
	
	@FindBy(xpath="//input[@name='password'  and @type='password']")
	private WebElement click_password;
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button' and @type='submit']")
	private WebElement click_button;
	
	
	@FindBy(xpath="(//p[@class='oxd-text oxd-text--p'])[1]")
	private WebElement seeusername;
	
	public Crm_Login_pages()
	{
		
		PageFactory.initElements(driver,this);
	}
	
	
	
	public Homepage loginpage(String username,String password)
	{
		click_username.sendKeys(username);
		click_password.sendKeys(password);
		click_button.click();
		return new Homepage();
		
	}
	
	public String viewusername()
	{
		String color = seeusername.getCssValue("color");
		String attribute = seeusername.getText();
		String[] arr=attribute.split(":");
		System.out.println(arr[1]);
		Reporter.log(color);
		Reporter.log(attribute);
		
		return color;
	}

	

}

package com.testscripts;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.Testbase.TestBase;
import com.crm.pages.Crm_Leave_page;
import com.crm.pages.Crm_Login_pages;

public class Crm_leave_test  extends TestBase{
	
	Crm_Login_pages login;
	Crm_Leave_page leave_page;
	
	public Crm_leave_test()
	{
		super();
	}
	
	@BeforeMethod
	   public void setup()
	   {
		   initialization();
		   login=new Crm_Login_pages();
		    login.loginpage(prop.getProperty("username"),prop.getProperty("password"));
		   leave_page = new Crm_Leave_page();
		   
	   }
	
	@Test
	public void leavepage()
	{
		
		leave_page.select_leave();
	}
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}

}

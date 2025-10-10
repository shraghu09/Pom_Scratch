package com.testscripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.Testbase.TestBase;
import com.crm.pages.Crm_Login_pages;
import com.crm.pages.Crm_Time_page;
import com.crm.pages.Homepage;

public class Crm_time_test extends TestBase{
	
	Crm_Login_pages  lp;
	Crm_Time_page ctt;
	Homepage homepage;
	
	public Crm_time_test()
	{
		super();
	}
	
	@BeforeMethod
	public void select_date()
	{
		initialization();
		lp=new Crm_Login_pages();
		homepage=	lp.loginpage(prop.getProperty("username"), prop.getProperty("password"));
		ctt=new Crm_Time_page();
	}
	
	@Test
	public void select_dates()
	{
		ctt.select_time();
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}

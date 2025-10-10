package com.testscripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.Testbase.TestBase;
import com.crm.pages.Crm_Login_pages;
import com.crm.pages.Crm_Myinfo_page;

public class Crm_Myinfo_test extends TestBase{
	
	Crm_Login_pages login;
	Crm_Myinfo_page  cmp;
	
	public Crm_Myinfo_test()
	{
		super();
	}
	
	@BeforeMethod
	public void click_myinfocrm()
	{
		initialization();
		login=new Crm_Login_pages();
		login.loginpage(prop.getProperty("username"), prop.getProperty("password"));
		cmp=new Crm_Myinfo_page();
	}
	
	@Test
	public void select_myinfo()
	{
		cmp.select_myinfo();
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}

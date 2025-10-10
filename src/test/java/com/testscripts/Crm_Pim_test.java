package com.testscripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.Testbase.TestBase;
import com.crm.pages.Crm_Login_pages;
import com.crm.pages.Crm_PIM_pages;

public class Crm_Pim_test extends TestBase{
	
	Crm_Login_pages  lp;
	Crm_PIM_pages  pim;
	
	public Crm_Pim_test()
	{
		super();
	}
	
	@BeforeMethod
	public void setup_config()
	{
		initialization();
		lp=new Crm_Login_pages();
		lp.loginpage(prop.getProperty("username"), prop.getProperty("password"));
		pim=new Crm_PIM_pages();
	}
	
	@Test
	public void click_Pim()
	{
		pim.select_Pim();
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}

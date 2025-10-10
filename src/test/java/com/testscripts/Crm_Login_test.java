package com.testscripts;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import javax.security.auth.login.LoginContext;

import org.jspecify.annotations.Nullable;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.Testbase.TestBase;
import com.crm.pages.Crm_Login_pages;

public class Crm_Login_test extends TestBase{
	
	Crm_Login_pages login;
	
	public Crm_Login_test() throws IOException
	{
		super();
	}
   
   @BeforeMethod
   public void setup()
   {
	   initialization();
	   login=new Crm_Login_pages();
	   
   }
   
   
   @Test(priority = 1)
   public void login()
   {
	   login.loginpage(prop.getProperty("username"),prop.getProperty("password"));
	  
	String title = driver.getTitle();
	   assertEquals(title, "OrangeHRM");
   }
   
   @Test(priority = 2)
   public void selectusercolor()
   {
	   login.viewusername();
	   System.out.println();
   }
   
   @AfterMethod
   public void teardown()
   {
	   driver.quit();
   }
   

}

package com.crm.Testbase;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.testutils.Utils;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public  TestBase() 
	{
		prop=new Properties();
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(System.getProperty("user.dir") +"\\src\\main\\java\\com\\crm\\config\\test.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void initialization()
	{
		String browsername = prop.getProperty("browser");
		if(browsername.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		
		else if(browsername.equals("FF"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(browsername.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}

	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Utils.PAGE_LOAD));
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utils.IMPLICIT_WAIT));
	    driver.get(prop.getProperty("url"));

}
}

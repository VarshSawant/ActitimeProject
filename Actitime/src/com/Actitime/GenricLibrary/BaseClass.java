package com.Actitime.GenricLibrary;
// Generic Libraries is a component of a framework which has generic method and generic class
//which write once and use multiple time in project 

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.Actitime.pom.HomePage;
import com.Actitime.pom.LoginPage;

public class BaseClass 
{  
	FileLibrary f= new FileLibrary();
	
	
	public static WebDriver driver;
   @BeforeSuite
   public void databaseconnection() 
   {
	   Reporter.log("database connected",true);
   }
   @AfterSuite
   public void databasedisconnection()
   {
	   Reporter.log("database disconnected",true);
   }
   @BeforeClass
   public void launchBrowser() throws IOException
   {
       driver= new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   String URL = f.readDataFromPropertyFile("url");
	   driver.navigate().to(URL);
	   Reporter.log("browser Launch successfully",true);
   }
   @AfterClass
   public void closeBrowser() 
   {
	 driver.close();
	 Reporter.log("browser closed successfully",true);
	 
   }
   @BeforeMethod
   public void loginToActitime() throws IOException
   {
	   String UN = f.readDataFromPropertyFile("username");
	   String PS = f.readDataFromPropertyFile("password");
	   LoginPage lp= new LoginPage(driver);
	   lp.login(UN, PS);
	  
	   
	   
	   Reporter.log("Logged in to acttime", true);
	   
	   
   }
   @AfterMethod
   public void logoutFromActitime() throws InterruptedException
   {   Thread.sleep(6000);
	   driver.findElement(By.id("logoutLink")).click();
	   Reporter.log("logged out successfully",true);
   }
   
   
}

package com.Actitime.Testscript;

import org.testng.annotations.Test;

import com.Actitime.GenricLibrary.BaseClass;
import com.Actitime.pom.HomePage;
import com.Actitime.pom.TaskPage;

public class CreateCustomer extends BaseClass
{
	@Test
	   public void createCustomer() throws InterruptedException
	   {
		 HomePage Hp=new HomePage(driver);
		 
		 Hp.getTasklink().click();
		TaskPage tp= new TaskPage();
	   }
}

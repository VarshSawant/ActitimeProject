package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assert1 
{
	@Test
	public void demoassertion()
	{
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.google.com/");
		String expectedtitle = "soogle";
		String actualtitle = d.getTitle();
		if(expectedtitle.equals(actualtitle))
		{
			System.out.println("");
		}
		
	}

}

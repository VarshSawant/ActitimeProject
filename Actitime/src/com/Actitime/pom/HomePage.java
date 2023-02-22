package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{   
	@FindBy (xpath="//div[.='Tasks']")
	private WebElement Tasklink;
	@FindBy (id="logoutLink")
	private WebElement  lgout;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	
	
	public WebElement getTasklink() {
		return Tasklink;
	}
	public WebElement getLgout() {
		return lgout;
	}
	

}

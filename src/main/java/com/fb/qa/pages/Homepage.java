package com.fb.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.qa.base.TestBase;

public class Homepage extends TestBase  {
	
	
	@FindBy(xpath="//span[contains(text(),'Home')]")
	WebElement Home;
	
	@FindBy(xpath="//a[contains(text(),' days free trial)')]")
	WebElement DaysFreeTrail;
	
	
	public Homepage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public String ValidateHomePageTitle(){
		return driver.getTitle();
	}
	
	
	public Homepagelink ValidateHomeClick() throws IOException{
		Home.click();
		return new Homepagelink();
		
	}

	
	
	
	
//	public Contactpage ValidateClickContacts(){
//		Contacts.click();
//		return new Contactpage();
	}
	
	

	
	

	



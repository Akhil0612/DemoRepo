package com.fb.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.qa.base.TestBase;

public class Loginpage extends TestBase{
	
	

	//Page Factory--OR;
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="password")
	 WebElement password;
	
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement loginbtn;
	
	
	
	public Loginpage() throws IOException {
		PageFactory.initElements(driver, this);
		
		// TODO Auto-generated constructor stub
	}
	
	//Actions or Methods
	public String validateLoginTile(){
		return driver.getTitle();
	}
	
	public Homepage login(String un, String pwd) throws IOException{
		username.sendKeys(un);
		password.sendKeys(pwd);
        loginbtn.click();
        return new Homepage();
	}
	
	

}

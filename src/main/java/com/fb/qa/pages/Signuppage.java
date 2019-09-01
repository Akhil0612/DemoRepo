package com.fb.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.qa.base.TestBase;

public class Signuppage extends TestBase {

	
	@FindBy(id="u_0_p")
	WebElement FirstName;
	
	@FindBy(id="u_0_r")
	WebElement LastName;
	
	@FindBy(xpath="//a[@title='Facebook होम पर जाएँ']")
	
	WebElement fblogo;
	
	
	public Signuppage() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
	
	public boolean   ValididateLogo(){
		return fblogo.isDisplayed();

}
}
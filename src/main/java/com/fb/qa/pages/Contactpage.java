package com.fb.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.qa.base.TestBase;

public class Contactpage extends TestBase {
	
	
	
	
	@FindBy(xpath="//span[contains(text(),'Contacts')]")
	WebElement Contactspage;
	
	@FindBy(xpath="//div[contains(text(),'Contacts')]")
	WebElement Contactsheader;
	
	@FindBy(xpath="//button[contains(text(),'New')]")
	WebElement Newbttn;

	public Contactpage() throws IOException {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	public ContactNewPage Contacthomepage() throws IOException{
		Contactspage.click();
		return new ContactNewPage();
		
	}
	
	public String Contactpageheader(){
		return Contactsheader.getAttribute("Contacts");
		
	}
	
	public ContactNewPage ContactNewBttn() throws IOException{
		Newbttn.click();
		return new ContactNewPage();
		
		
	}
	
	


}

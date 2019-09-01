package com.fb.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fb.qa.base.TestBase;
import com.fb.qa.pages.ContactNewPage;
import com.fb.qa.pages.Contactpage;
import com.fb.qa.pages.Homepage;
import com.fb.qa.pages.Loginpage;

public class ContactTest extends TestBase{
	
	Loginpage loginpage;
	Homepage homepage;
	Contactpage contactpage;

	public ContactTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@BeforeMethod()
	public void SetupContactpage() throws IOException{
		
		initialization();
		
		 loginpage=	new Loginpage();
		 homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));	
		 homepage      = new Homepage();
		 contactpage= new Contactpage();
	}
	
	
	
	@Test(priority=0)
	public void Contactpagelink() throws IOException{
		contactpage.Contacthomepage();
	}
	@Test()
	public void Contactpageheader(){
		String contctheader=contactpage.Contactpageheader();
		
		if(contctheader.equals("Contacts")){
			System.out.println("The Header is Correct Displaying");
		}else{
			System.out.println("The Header is not Correct Displaying");
		}
	}
	
//	@AfterMethod
//	public void tearup(){
//
//		driver.quit();
//
//
//	}

	
		

}

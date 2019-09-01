package com.fb.qa.testcases;



import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fb.qa.base.TestBase;
import com.fb.qa.pages.Homepage;
import com.fb.qa.pages.Loginpage;

@Test
public class LoginTest extends TestBase {
	Loginpage loginpage;
	Homepage homepage;

	public LoginTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	public void Setup() throws IOException{
		
		initialization();
		
		 loginpage=	new Loginpage();
		 homepage      = new Homepage();
		
	}
	
//	@Test(priority=0)
//	
//	public void loginpagetitletest() throws InterruptedException{
//		    
//		String loginpagetitle=loginpage.validateLoginTile();
//		if(loginpagetitle.equals("CRM")){
//			System.out.println("The Login Title is matching");
//			}else{
//				System.out.println("The Login Page Tilte is not matching");
//			}
//	}
	
	@Test(priority=1)
	public void LoginTestcred() throws IOException{
		 
			Homepage homepagetitle1=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
			
			if(homepagetitle1.equals("CRM")){
				System.out.println("The Page is redirecting to Home Page");
				}else{
					System.out.println("The Page is not redirecting to Home Page");
				}
			
			
			
		
			
	}
	

	
	
//	@AfterMethod
//	
//	public void teardown(){
//		driver.quit();
//	}
	
	
	
	

}

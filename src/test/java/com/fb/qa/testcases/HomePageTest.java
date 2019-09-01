package com.fb.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fb.qa.base.TestBase;
import com.fb.qa.pages.Homepage;
import com.fb.qa.pages.Homepagelink;
import com.fb.qa.pages.Loginpage;
import com.fb.qa.util.TestUtils;
@Test
public class HomePageTest extends TestBase {

	Loginpage loginPage;
	TestUtils testutils;
	Homepage homePage;

	public HomePageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	public void SetupHome() throws IOException{
		
		initialization();
	
		loginPage= new Loginpage();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));	
		
	}

	
    @Test(priority=0)

	public  void ValidateTitleHomePageTest(){
		String homepagetitle= homePage.ValidateHomePageTitle();
		if(homepagetitle.equals("CRM")){
			System.out.println("The Title is Home page title");
		}else{
			System.out.println("The Title is not Home page title");
		}

	}

	@Test(priority=1)

	public void ValidateHomeTest() throws IOException{
		
		Homepagelink homefromTest=homePage.ValidateHomeClick();
		
		System.out.println("The Home Page is opened");
	}

//	@AfterMethod
//	public void tearup(){
//
//		driver.quit();


	//}


}
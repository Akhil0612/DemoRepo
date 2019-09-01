package com.fb.qa.util;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.fb.qa.base.TestBase;

public class TestUtils extends TestBase {
	
	
	public TestUtils() throws IOException {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	public static long PAGE_LOAD_TIMEOUT=20;
	public static long IMPILICIT_WAIT=30;
	
	public  void SwitchToFrame(){
		driver.switchTo().frame("mainpanel");
		
	}
		
  public void JavaScriptExecutor(String locator){
	  
	  JavascriptExecutor js=  (JavascriptExecutor)driver;
	  js.executeScript("arguments[0].click();", locator);
	 
	  
		
		
	}

}

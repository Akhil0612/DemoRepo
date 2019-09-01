package com.fb.qa.base;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.host.Iterator;

public class Gmail {



	public static WebDriver driver;


	public static void createAccount(){

		System.setProperty("webdriver.chrome.driver", "C://Users//Akhil//Desktop//chromedriver.exe");

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}


	public static void loginfun(){
		
		String row= "//*[@id='leftcontainer']/table/tbody/tr";
		
		
	int rowData=	  driver.findElements(By.xpath(row)).size();
	System.out.println(rowData);
	
	String col= "//*[@id='leftcontainer']/table/tbody/tr[1]/td";
	
	
	
	int colData= driver.findElements(By.xpath(col)).size();
	
	
	System.out.println(colData);
	
	
	String s1="//*[@id='leftcontainer']/table/tbody/tr[";
	String s2="]/td[";
	String s3="]";
	
	for(int i=1;i<=rowData;i++){
		for(int j=1;j<=colData;j++){
			String sfinal=s1+i+s2+j+s3;
			
			//System.out.println(sfinal);
			
			String txt=driver.findElement(By.xpath(sfinal)).getText();
			
			
			
		
			System.out.print(txt + "|");
		}
		
		System.out.println("");
	}
		
	}
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gmail gg=new Gmail();
		gg.createAccount();
		gg.loginfun();

		


	}

}

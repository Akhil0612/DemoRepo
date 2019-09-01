package com.fb.qa.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadfile {
	
	public static WebDriver driver;


	public static void createAccount(){

		System.setProperty("webdriver.chrome.driver", "C://Users//Akhil//Desktop//chromedriver.exe");

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/upload/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	} 
	
	public static void uploadfile(){
		
		driver.findElement(By.xpath("//input[@id='uploadfile_0']")).sendKeys("C:\\Users\\Akhil\\Desktop\\cucumber.txt");
		driver.findElement(By.xpath("//input[@id='terms']")).click();
		driver.findElement(By.xpath("//button[@id='submitbutton']")).click();
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createAccount();
		uploadfile();
		

	}

}

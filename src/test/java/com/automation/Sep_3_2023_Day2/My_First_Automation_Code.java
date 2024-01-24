package com.automation.Sep_3_2023_Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class My_First_Automation_Code {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER); 
		
		
		WebDriver driver = new ChromeDriver(options);  //Ctrl + Shift + O
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		driver.findElement(By.className("signin")).click();
		driver.quit();
		
		
		WebDriver driver1 = new FirefoxDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.flipkart.com");
		driver1.quit();
		
		
		WebDriver driver2 = new EdgeDriver();
		driver2.manage().window().maximize();
		driver2.get("https://tutorialsninja.com/demo");
		driver2.quit();
		
		//driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
	//	driver.findElement(By.id("password")).sendKeys("Selenium@123");
	//	driver.findElement(By.name("proceed")).click();
	//	Thread.sleep(2000);
	//	driver.findElement(By.className("rd_logout")).click();

	}

}

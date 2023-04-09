package com.TestProject;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mouse_Hover_Ex1 {
	public static void main(String[] args) throws InterruptedException {
		
		// Create object of HashMap Class
				Map<String, Object> prefs = new HashMap<String, Object>();
		              
		                // Set the notification setting it will override the default setting
				prefs.put("profile.default_content_setting_values.notifications", 2);
		 
		                // Create object of ChromeOption class
				ChromeOptions options = new ChromeOptions();
		 
		                // Set the experimental option
				options.setExperimentalOption("prefs", prefs);
		 
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.yatra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement Supp = driver.findElement(By.xpath("//a[contains(text(),'Support')]"));
		//Alternative is below, we use contains when there is space e.g. Above after Support there is space
		//WebElement Support = driver.findElement(By.xpath("(//a[contains(text(),'Support')])[1]"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Support')]"))).build().perform();
		driver.findElement(By.xpath("(//a[text()='Contact Us'])[2]")).click();
		System.out.println("Title: "+ driver.getTitle());
		driver.navigate().back();
		
				
		act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Support')]"))).build().perform();
	
		driver.findElement(By.xpath("(//a[text()='Complete Booking'])[2]")).click();
		
		driver.navigate().back();
		
		act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Support')]"))).build().perform();
	
		driver.findElement(By.xpath("(//a[text()='Make a Payment'])[2]")).click();//tried with [1] too but didn't work
//      driver.findElement(By.xpath("(//a[contains(text(),'Make a Payment')])[2]")).click();//tried with [1] as well
									 
		System.out.println("Make a Payment Tab Executed");				
		driver.navigate().back();
		
		act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Support')]"))).build().perform();
		driver.findElement(By.xpath("(//a[text()='Flight Cancellation Charges'])[2]")).click();
		       
		//navigate to Main Page
		driver.navigate().back();
		
		System.out.println("All Steps Executed, Test Ends Here:");
		driver.close();		
		
		
		
	}
}

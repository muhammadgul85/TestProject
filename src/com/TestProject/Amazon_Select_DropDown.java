package com.TestProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_Select_DropDown {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.co.uk/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement selectElement = driver.findElement(By.id("searchDropdownBox"));
		
		Select select = new Select (selectElement);
		select.getAllSelectedOptions();
		select.selectByValue("search-alias=beauty");
		Thread.sleep(1000);
		select.selectByVisibleText("Computers & Accessories");
		Thread.sleep(1000);
		select.selectByIndex(3);
		List <WebElement> li = select.getOptions();
		System.out.println("list size: "+ li.size());
		Thread.sleep(1000);
		
		for (int i=0; i <li.size(); i++)
		{
			System.out.println(li.get(i).getText());
		}
		
//		driver.findElement(By.xpath("(//span[text()='Account & Lists'])[2]")).click();//Element not interactable Exception thrown
//		Thread.sleep(1000);
//		driver.navigate().back();
		
		System.out.println("All Test Steps Executed: ");
		driver.close();
	}
}

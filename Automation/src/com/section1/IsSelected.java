package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsSelected {
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\User\\Documents\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		WebElement checkbox = driver.findElement(By.id("keepLoggedInLabel"));
		if(checkbox.isSelected())
		{
			System.out.println("Checkbox is Selected");
			
		}
		else
		{
			System.out.println("Checkbox is not Selected");
			checkbox.click();
		}
		
	}

}

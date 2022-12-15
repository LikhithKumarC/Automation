package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCSSValue {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		WebElement error = driver.findElement(By.xpath("//span[contains(text(),'Please try again')]"));
		//Dimension errorfont = error.getSize();
		String errorfont1 = error.getCssValue("font");
		//String errorfont2 = error.getCssValue("color");
		//System.out.println(errorfont);
		System.out.println(errorfont1);
		//System.out.println(errorfont2);
		String s1 = "Username or Password is invalid. Please try again.";
		String s2 = error.getText();
		if(s1.equals(s2))
		{
			System.out.println("TC is passed");
		}
		else 
		{
			System.out.println("TC is failed");
		}
		driver.close();
	}

}

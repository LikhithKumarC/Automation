package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		
		By usernameLoc = By.id("username");
		WebElement username = driver.findElement(usernameLoc);
		username.sendKeys("admin");
		Thread.sleep(2000);
		
		By passwordLoc = By.name("pwd");
		WebElement password = driver.findElement(passwordLoc);
		password.sendKeys("manager");
		Thread.sleep(2000);
		
		By loginLoc = By.id("loginButton");
		WebElement login= driver.findElement(loginLoc);
		login.click();
		//Thread.sleep(2000);
		
		//System.out.println(driver.getTitle());
		
		//driver.findElement(By.id("logoutLink")).click();
		//Thread.sleep(2000);
		
		//driver.quit();
		
		
		
	}

}

package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay2 {
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		Ebay2 e = new Ebay2();
		String name = "Watches";
		e.launchBrowser();
		String result = e.search(name);
		Thread.sleep(2000);
		System.out.println(result);
		e.close();

	}
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	public String search(String name) throws InterruptedException
	{
		driver.get("https://www.ebay.com/");
		driver.findElement(By.id("gh-ac")).sendKeys(name);
		driver.findElement(By.id("gh-btn")).click();
		Thread.sleep(2000);
		String result = driver.findElement(By.className("srp-controls__count-heading")).getText();
		return result;
	}
	public void close()
	{
		driver.close();
	}
	
}


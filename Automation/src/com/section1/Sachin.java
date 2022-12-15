package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sachin {
	ChromeDriver driver;
	public static void main(String[]args) throws InterruptedException
	{
		String name = "Virender Sehwag";
		Sachin x = new Sachin();
		x.launchBrowser();
		Thread.sleep(2000);
		String result = x.search(name);
		System.out.println(result);
		Thread.sleep(2000);
		
		x.close();
		
	}
	
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public String search(String name) throws InterruptedException
	{
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[class='gLFyf gsfi']")).sendKeys(name);
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(2000);
		String result = driver.findElement(By.id("result-stats")).getText();
		return result;
	}
	
	public void close()
	{
		driver.close();
	}

}

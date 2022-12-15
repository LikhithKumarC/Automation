package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected1 {
	WebDriver driver;
	WebElement search;
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	public void openFlipkart()
	{
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
	}
	public void search()
	{
		search = driver.findElement(By.name("q"));
		search.sendKeys("IphoneX");
		search.submit();
	}
	public void checkbox()
	{
		driver.findElement(By.xpath("//div[text()='APPLE iPhone X (Silver, 64 GB)']/../../../div/div[2]/div/span")).click();
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 12 Mini (Black, 64 GB)']/../../../div/div[2]/div/span")).click();
	}
	public static void main(String[] args) throws InterruptedException {
		IsSelected1 i = new IsSelected1();
		i.launchBrowser();
		Thread.sleep(2000);
		i.openFlipkart();
		Thread.sleep(2000);
		i.search();
		Thread.sleep(2000);
		i.checkbox();
	}

}

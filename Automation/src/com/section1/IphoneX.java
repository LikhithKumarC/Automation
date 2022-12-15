package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IphoneX {
	ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		String productname = "APPLE iPhone X (Space Gray, 256 GB)";
		IphoneX i = new IphoneX();
		i.launchBrowser();
		i.search();
		Thread.sleep(2000);
		String price = i.fetchprice(productname);
		System.out.println(price);
		i.close();

	}
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	public void search()
	{
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphoneX");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
	}
	public String fetchprice(String productname)
	{
		String price = driver.findElement(By.xpath("//div[text()='"+productname+"']/../../div[2]/div[1]/div[1]/div")).getText();
		return price;
	}
	public void close()
	{
		driver.close();
	}

}

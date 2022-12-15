package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateNewTypeofWork {
	WebDriver driver;
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	public void login() throws InterruptedException
	{
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
	}
	public void createWork() throws InterruptedException
	{
		driver.findElement(By.xpath("//div[@class='menuTable']/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Types of Work")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("i")).click();
		System.out.println(driver.findElement(By.className("pagetitle")).getText());
	}
	public void close()
	{
		driver.close();
	}
	public static void main(String[] args) throws InterruptedException {
		CreateNewTypeofWork c = new CreateNewTypeofWork();
		c.launchBrowser();
		c.login();
		c.createWork();
		Thread.sleep(2000);
		c.close();
	}

}

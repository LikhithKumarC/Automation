package com.section1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeScreenshot {
	WebDriver driver;
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	public void login()
	{
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
	}
	public void settings() throws InterruptedException
	{
		driver.findElement(By.xpath("//div[@class='menuTable']/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@id='popup_menu_items_content']/li[4]")).click();
	}
	public void screenshot() throws IOException
	{
		WebElement acti = driver.findElement(By.className("pagetitle"));
		File src = acti.getScreenshotAs(OutputType.FILE);
		File trg = new File("./screenshot/GeneralSettings.png");
		FileUtils.copyFile(src, trg);
	}
	public void close()
	{
		driver.close();
	}
	public static void main(String[]args) throws IOException, InterruptedException
	{
		ActiTimeScreenshot a = new ActiTimeScreenshot();
		a.launchBrowser();
		Thread.sleep(2000);
		a.login();
		Thread.sleep(2000);
		a.settings();
		Thread.sleep(2000);
		a.screenshot();
		Thread.sleep(2000);
		a.close();
	}

}

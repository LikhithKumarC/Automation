package com.section1;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ActitimeCustomer {
	ChromeDriver driver;
	
	public static void main(String[]args) throws InterruptedException {
		Random r = new Random();
		int num = r.nextInt(10000);
		String actcustomername = "Aruna";
		actcustomername = actcustomername+num;
		ActitimeCustomer ac = new ActitimeCustomer();
		ac.launchBrowser();
		ac.login();
		Thread.sleep(2000);
		String expcustomername = ac.customerCreation(actcustomername);
		Assert.assertEquals(actcustomername, expcustomername);
		System.out.println("Assertion Completed");
		System.out.println(expcustomername);
		ac.closeBrowser();
		
	}
	
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
	public String customerCreation(String actcustomername) throws InterruptedException
	{
		driver.findElement(By.id("container_tasks")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".title.ellipsis")).click();
		driver.findElement(By.className("createNewCustomer")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("newNameField")).sendKeys(actcustomername);
		driver.findElement(By.cssSelector("[placeholder='Enter Customer Description']")).sendKeys("Software");
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
		Thread.sleep(2000);
		String expcustomername = driver.findElement(By.cssSelector(".titleEditButtonContainer>.title")).getText();
		return expcustomername;
	}
	public void closeBrowser()
	{
		driver.close();
	}

}

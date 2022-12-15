package com.section1;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeXpath {

	public static void main(String[] args) throws InterruptedException {
		Random r = new Random();
		int num = r.nextInt(10000);
		String actcustomername = "Aruna";
		actcustomername = actcustomername+num;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		
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
		System.out.println(expcustomername);
		
		if(actcustomername.equals(expcustomername))
		{
			System.out.println("TC is Passed");
		}
		else
		{
			System.out.println("TC is Failed");
		}
		
		driver.close();
	}

}

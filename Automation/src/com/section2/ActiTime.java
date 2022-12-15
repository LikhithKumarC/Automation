package com.section2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.TAB,Keys.SPACE,Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.id("container_tasks")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//table[@class='headerRowTable']/tbody/tr/td[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='delete button']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//div[text()='You are about to delete 62 tasks']")).getText());
		Thread.sleep(2000);
		driver.close();
		

	}

}

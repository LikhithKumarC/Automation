package com.section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DoB {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();
		String mon=driver.findElement(By.className("ui-datepicker-month")).getText();
		String yr =driver.findElement(By.className("ui-datepicker-year")).getText();
		while(!(mon.equals("August") && yr.equals("1999")))
		{
			driver.findElement(By.className("ui-datepicker-prev")).click();
			mon=driver.findElement(By.className("ui-datepicker-month")).getText();
			yr =driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		driver.findElement(By.linkText("4")).click();

	}

}

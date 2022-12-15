package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssFlipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("._2KpZ6l._2doB4z")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[class='_3704LK']")).sendKeys("iphone");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
	}

}

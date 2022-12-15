package com.section1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Documents\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		Thread.sleep(2000);
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.manage().window().setPosition(new Point(500,300));
		Thread.sleep(2000);
		
		driver.manage().window().setSize(new Dimension(600,200));
		Thread.sleep(2000);
		
		driver.quit();
	}

}

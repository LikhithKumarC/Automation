package com.section1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipAmaz {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\User\\Documents\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		URL url = new URL("https://www.flipkart.com/");
		driver.navigate().to(url);
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		driver.quit();
		

	}

}

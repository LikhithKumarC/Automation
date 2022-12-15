package com.section1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class YatraEbay {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Documents\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.yatra.com/");
		Thread.sleep(2000);
		
		driver.get("https://www.ebay.com/");
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		System.out.println(driver.getTitle());
		
		driver.manage().window().minimize();
		Thread.sleep(2000);
		
		driver.quit();

	}

}

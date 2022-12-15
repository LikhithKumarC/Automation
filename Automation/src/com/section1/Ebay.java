package com.section1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String sourcecode = driver.getPageSource();
		System.out.println(sourcecode);
		
		driver.quit();

	}

}

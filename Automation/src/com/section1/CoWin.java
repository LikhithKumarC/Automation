package com.section1;

import org.openqa.selenium.chrome.ChromeDriver;

public class CoWin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.cowin.gov.in/");
		//driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//String title = driver.getTitle();
		//System.out.println(title);
		
		//String Url = driver.getCurrentUrl();
		//System.out.println(Url);
		
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		driver.close();
	}

}

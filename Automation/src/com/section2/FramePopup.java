package com.section2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramePopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//font[text()='Free Mock Tests']")).click();
		
		String mainid=driver.getWindowHandle(); 
		Set<String> allid=driver.getWindowHandles();

		for(String id:allid)
		{

			if(!(id.equals(mainid)))
				{
				driver.switchTo().window(id);
				}
		}
		driver.findElement(By.xpath("//nav[@class='navbar navbar-default pw-navbar-default navbar-fixed-top']/div[1]/div[1]/ul[1]/li[4]")).click();
		driver.findElement(By.xpath("//div[@class='row']/div[1]/div[1]/div[1]/div[1]/div[1]/a")).click();		
		
		System.out.println(driver.getTitle());


	}
}

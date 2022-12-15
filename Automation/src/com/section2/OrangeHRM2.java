package com.section2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement linkedIn=driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[1]"));
		linkedIn.click();
		
		WebElement fb =driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[2]"));
		fb.click();
		
		WebElement yt = driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[4]"));
		yt.click();
		
		Set<String> allid = driver.getWindowHandles();
		System.out.println(allid);
		
		//ArrayList<String> tabs = new ArrayList<>(allid);
		//driver.switchTo().window(tabs.get(1));
		//System.out.println(driver.getTitle());
		//driver.switchTo().window(tabs.get(2));
		//driver.close();
		//driver.switchTo().window(tabs.get(3));
		//driver.close();
		//driver.switchTo().window(tabs.get(0));
		//driver.close();
		
	}

}

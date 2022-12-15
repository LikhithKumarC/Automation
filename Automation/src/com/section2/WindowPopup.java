package com.section2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("IphoneX",Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='APPLE iPhone X (Silver, 256 GB)']")).click();
		String mainID=driver.getWindowHandle();
		//System.out.println(mainID);
		Set<String> allID=driver.getWindowHandles();
		for(String id:allID)
		{
			if(!(id.equals(mainID)))
			{
				driver.switchTo().window(id);
			}
		}
		String price = driver.findElement(By.className("CEmiEU")).getText();
		System.out.println(price);
		driver.close();
		driver.switchTo().window(mainID);
		System.out.println(driver.getTitle());
		

	}

}

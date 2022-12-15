package com.section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IRCTC {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.irctc.com/");
		WebElement wb = driver.findElement(By.xpath("//div[@id='topNav']/ul[1]/li[1]/a"));
		Actions act = new Actions(driver);
		act.moveToElement(wb).perform();
		driver.findElement(By.xpath("//div[@id='topNav']/ul[1]/li[1]/ul[1]/li[2]/a")).click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
		WebElement name = driver.findElement(By.xpath("//table[@class='responsive-table']/tbody/tr[2]/td[2]"));
		System.out.println("Name: "+name.getText());
		WebElement name2= driver.findElement(By.xpath("//table[@class='responsive-table']/tbody/tr[2]/td[3]"));
		System.out.println("Designation: "+name2.getText());
		driver.close();
		
	}

}

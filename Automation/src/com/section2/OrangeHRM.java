package com.section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeHRM {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.orangehrm.com/");
		
		driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']/ul/li[2]/a/button")).click();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
		
		WebElement wb = driver.findElement(By.name("FullName"));
		wb.sendKeys("SachinTendulkar",Keys.TAB,Keys.TAB,"9900990099",Keys.TAB,"xyz@gmail.com",Keys.ENTER);
		
		WebElement country = driver.findElement(By.name("Country"));
		Select s = new Select(country);
		s.selectByVisibleText("India");
		
		WebElement emp = driver.findElement(By.name("NoOfEmployees"));
		Select s1 = new Select(emp);
		s1.selectByVisibleText("101 - 150");
		
		WebElement wb2 = driver.findElement(By.name("JobTitle"));
		wb2.sendKeys("xyz",Keys.TAB,"QSpidersOAR_Bengaluruuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu",Keys.TAB,Keys.ENTER);
		
		
		}

}

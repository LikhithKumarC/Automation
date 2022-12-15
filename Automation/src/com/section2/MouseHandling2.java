package com.section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHandling2 {

	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("IphoneX",Keys.ENTER);
		
		WebElement slider1 = driver.findElement(By.xpath("(//div[contains(@class,'FdLqY')])[1]"));
		Actions act = new Actions(driver);
		act.dragAndDropBy(slider1, 60, 0).perform();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Clear all']")));
		
		WebElement slider2 = driver.findElement(By.xpath("(//div[contains(@class,'FdLqY')])[2]"));
		act.dragAndDropBy(slider2, -60, 0).perform();
		
	}

}

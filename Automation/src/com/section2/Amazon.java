package com.section2;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		WebElement l= driver.findElement(By.id("twotabsearchtextbox"));
		l.sendKeys("clock");
		
		Actions a = new Actions(driver);
		a.keyDown(Keys.CONTROL).sendKeys("a",Keys.DELETE).perform();
		Thread.sleep(2000);
		a.keyUp(Keys.CONTROL).perform();
		Thread.sleep(2000);
		a.sendKeys(l,"flower").perform();
		l.submit();
		
		driver.findElement(By.xpath("//span[text()='Brand']/../following-sibling::ul/li[8]/span/div/a/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Amazon Brand - Solimo")).click();
		Thread.sleep(2000);
		WebElement result = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
		String s = result.getText();
		System.out.println(s);
		Thread.sleep(2000);
		
		driver.close();
		
		
	}
}

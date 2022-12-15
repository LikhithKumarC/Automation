package com.section1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static void main(String[]args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement flipkart=driver.findElement(By.xpath("//a[@href='/plus']"));
		File src= flipkart.getScreenshotAs(OutputType.FILE);
		File trg = new File("./screenshot/flipkart.png");
		FileUtils.copyFile(src,trg);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src1= ts.getScreenshotAs(OutputType.FILE);
		File trg1 = new File("./screenshot/page.png");
		FileUtils.copyFile(src1,trg1);
	}
	
}

package com.section1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flip {
	WebDriver driver;
	
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	public void search()
	{
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
	}
	public void screenShot() throws IOException
	{
		WebElement flipkart = driver.findElement(By.xpath("//div[@class='xtXmba']/../../../../.."));
		File src = flipkart.getScreenshotAs(OutputType.FILE);
		File trg = new File("./screenshot/flipkart2.png");
		FileUtils.copyFile(src, trg);
	}
	public void close()
	{
		driver.close();
	}

	public static void main(String[] args) throws IOException{
		Flip f = new Flip();
		f.launchBrowser();
		f.search();
		f.screenShot();
		f.close();
	}

}

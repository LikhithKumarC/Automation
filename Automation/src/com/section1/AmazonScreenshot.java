package com.section1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonScreenshot {
	WebDriver driver;
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	public void amazon()
	{
		driver.get("https://www.amazon.in/");
	}
	public void screenshot() throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File("./screenshot/amazonpage.png");
		FileUtils.copyFile(src, trg);
	}
	public void close()
	{
		driver.close();
	}
	public static void main(String[] args) throws IOException {
		AmazonScreenshot a = new AmazonScreenshot();
		a.launchBrowser();
		a.amazon();
		a.screenshot();
		a.close();
	}

}

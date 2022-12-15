package com.section2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Naukri_com {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/");
		
		WebElement job=driver.findElement(By.xpath("//div[text()='Jobs']"));
		Actions act = new Actions(driver);
		act.moveToElement(job).perform();
		WebElement itJob = driver.findElement(By.xpath("//div[text()='IT jobs']"));
		act.click(itJob).perform();
		driver.findElement(By.xpath("//a[text()='Embedded Test Engineer']")).click();
		
		
		
		WebElement ss = driver.findElement(By.className("nI-gNb-followus"));
		File src = ss.getScreenshotAs(OutputType.FILE);
		File trg = new File("./screenshot/naukri.png");
		FileUtils.copyFile(src, trg);
		
		driver.findElement(By.xpath("//a[text()='Privacy policy']")).click();
		
		System.out.println(driver.getTitle());
		
	}

}

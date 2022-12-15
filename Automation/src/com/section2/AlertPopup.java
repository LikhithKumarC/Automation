package com.section2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.TAB,Keys.SPACE,Keys.ENTER);
		driver.findElement(By.xpath("//div[@class='menuTable']/div[2]")).click();
		driver.findElement(By.xpath("//a[text()='Types of Work']")).click();
		driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
		driver.findElement(By.id("name")).sendKeys("QSPOAR");
		driver.findElement(By.xpath("//input[@onclick='handleCancel();']")).click();
		
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.dismiss();
		
		WebElement ss =driver.findElement(By.xpath("//table[@class='leftAligned']/tbody[1]/tr[1]/td"));
		File src = ss.getScreenshotAs(OutputType.FILE);
		File trg = new File("./screenshot/actiTime.png");
		FileUtils.copyFile(src, trg);
		
		

	}

}

package com.section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AbsoluteXpath {

	public static void main(String[] args){
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\User\\Documents\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///D:/HTML/Registration.html");
		driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("Likith Kumar C");
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("likith1234");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("likithkumarc1999@gmail.com");
		driver.findElement(By.xpath("/html/body/input[4]")).click();
		driver.findElement(By.xpath("/html/body/input[7]")).click();
		driver.quit();
	}

}

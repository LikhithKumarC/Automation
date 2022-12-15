package com.section2;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarPopup2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String date = "4";
		String month = "August";
		String year = "1999";
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		WebElement dob = driver.findElement(By.id("datepicker"));
		dob.click();
		
		while(true)
		{
			String mon=driver.findElement(By.className("ui-datepicker-month")).getText();
			String yr =driver.findElement(By.className("ui-datepicker-year")).getText();
			if(mon.equals(month) && yr.equals(year))
				break;
			else
			{
				driver.findElement(By.className("ui-datepicker-prev")).click();
			}
			
		}
		
		List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody[1]/tr/td"));
		for(WebElement dt:allDates)
		{
			String dat =dt.getText();
			if(dat.equals(date))
			{
				dt.click();
				break;
			}
			
		}
		System.out.println(date+"th "+month+","+year);
		
		
	}

}

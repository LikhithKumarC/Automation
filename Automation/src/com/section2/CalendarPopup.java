package com.section2;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		
		//driver.findElement(By.className("ui-state-highlight")).click();
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH,1);
		Date currentDate = cal.getTime();
		System.out.println(currentDate);
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		String modifiedDate = sdf.format(currentDate);
		System.out.println(modifiedDate);
		
		driver.findElement(By.id("datepicker")).sendKeys(modifiedDate,Keys.ESCAPE);

	}

}

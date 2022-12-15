package com.section2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///D:/HTML/MultipleSelectDropdown.html");
		WebElement dd =driver.findElement(By.id("Movies"));
		Select s = new Select(dd);
		
		if(s.isMultiple())
		{
			System.out.println("It is a MultiSelect");
		}
		else
		{
			System.out.println("It is a SingleSelect");
		}
		

	}

}

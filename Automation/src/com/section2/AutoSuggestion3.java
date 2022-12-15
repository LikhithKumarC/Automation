package com.section2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.timeanddate.com/");
		driver.findElement(By.className("picker-city__input")).sendKeys("bang");
		List<WebElement> allSuggestions = driver.findElements(By.xpath("//div[@class='po']/div/ul/li/a/span[2]"));
		for(WebElement suggestion:allSuggestions)
		{
			System.out.println(suggestion.getText());
		}
	}

}

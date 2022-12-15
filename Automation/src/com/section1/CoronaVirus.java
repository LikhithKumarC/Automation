package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CoronaVirus {
	ChromeDriver driver;

	public static void main(String[] args) {
		CoronaVirus cv = new CoronaVirus();
		cv.launchBrowser();
		cv.search();
		System.out.println("Coronavirus Cases: "+cv.cases());
		System.out.println("Deaths: "+cv.deaths());
		System.out.println("Recovered: "+cv.recovered());
		cv.close();

	}
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	public void search()
	{
		driver.get("https://www.worldometers.info/coronavirus/");
		
	}
	public String cases()
	{
		String cases = driver.findElement(By.xpath("//h1[text()='Coronavirus Cases:']/../div/span")).getText();
		return cases;
	}
	public String deaths()
	{
		String deaths = driver.findElement(By.xpath("//h1[text()='Deaths:']/../div/span")).getText();
		return deaths;
	}
	public String recovered()
	{
		String recovered =driver.findElement(By.xpath("//h1[text()='Recovered:']/../div/span")).getText();
		return recovered;
	}
	public void close()
	{
		driver.close();
	}

}

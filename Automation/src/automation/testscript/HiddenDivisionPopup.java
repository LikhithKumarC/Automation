package automation.testscript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import automation.genericLib.BaseClass;

public class HiddenDivisionPopup extends BaseClass{
	@Test
	public void HiddenPopup()
	{
	driver.findElement(By.id("container_tasks")).click();
	driver.findElement(By.xpath("//table[@class='headerRowTable']/tbody/tr/td[1]")).click();
	driver.findElement(By.xpath("//div[@class='delete button']")).click();
	String msg = driver.findElement(By.xpath("//div[contains(text(),'You are about to delete')]")).getText();
	System.out.println(msg);
	driver.findElement(By.className("clearSelection")).click();
	}
}

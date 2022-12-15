package automation.testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import automation.genericLib.BaseClass;
import automation.genericLib.CommonUtility;

public class AlertPopUp extends BaseClass{
	@Test
	public void alertpopup() throws IOException
	{
		driver.findElement(By.xpath("//div[@class='menuTable']/div[2]")).click();
		driver.findElement(By.xpath("//a[text()='Types of Work']")).click();
		driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
		driver.findElement(By.id("name")).sendKeys("QSPOAR");
		driver.findElement(By.xpath("//input[@onclick='handleCancel();']")).click();
		
		CommonUtility cu = new CommonUtility();
		String msg = cu.getAlertMsg(driver);
		System.out.println(msg);
		cu.getAlertCancel(driver);
		
	}

}

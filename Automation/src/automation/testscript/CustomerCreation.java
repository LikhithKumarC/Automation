package automation.testscript;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import automation.genericLib.BaseClass;
import automation.genericLib.CommonUtility;

public class CustomerCreation extends BaseClass{
	@Test
	public void CreateCustomer() throws InterruptedException, IOException {
		
		CommonUtility cu = new CommonUtility();
		int num = cu.getRandomNumber(10000);
		String actcustomername = du.getDatafromExcelsheet("Sheet1", 0, 0);
		actcustomername = actcustomername+num;
		
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.cssSelector(".title.ellipsis")).click();
		driver.findElement(By.className("createNewCustomer")).click();
		
		driver.findElement(By.className("newNameField")).sendKeys(actcustomername);
		driver.findElement(By.cssSelector("[placeholder='Enter Customer Description']")).sendKeys("Software");
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector(".titleEditButtonContainer>.title"), actcustomername));
		String expcustomername = driver.findElement(By.cssSelector(".titleEditButtonContainer>.title")).getText();
		System.out.println(expcustomername);

	}
}

package home.sms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	
	public void aspLogin1(WebDriver driver)
	{
		WebElement userid = driver.findElement(By.id("FormPlaceHolder_txtLoginName"));
		userid.sendKeys("shn123");
		
		WebElement password = driver.findElement(By.id("FormPlaceHolder_txtPassword"));
		password.sendKeys("1");
		
		WebElement submit = driver.findElement(By.id("FormPlaceHolder_btnSave"));
		submit.click();
	}
	
	public void centralwarehouseLogin1(WebDriver driver)
	{
		WebElement userid = driver.findElement(By.id("FormPlaceHolder_txtLoginName"));
		userid.sendKeys("centralwarehouse");
		
		WebElement password = driver.findElement(By.id("FormPlaceHolder_txtPassword"));
		password.sendKeys("1");
		
		WebElement submit = driver.findElement(By.id("FormPlaceHolder_btnSave"));
		submit.click();
	}

}

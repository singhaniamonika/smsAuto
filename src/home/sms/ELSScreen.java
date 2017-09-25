package home.sms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class ELSScreen {

public void elsPass(WebDriver driver)
{
	try {
	WebElement elsPassRadoio = driver.findElement(By.id("DefaultContent_rbnStatus_0"));
	elsPassRadoio.click();
	
	Thread.sleep(3000);
	
	
	WebElement estimatedAmount = driver.findElement(By.id("DefaultContent_txtEstimate"));
	estimatedAmount.sendKeys("888");
	
	WebElement approved	 = driver.findElement(By.id("DefaultContent_rbnApproved"));
	approved.click();
	
	WebElement submitELS = driver.findElement(By.id("DefaultContent_btnSubmit"));
	submitELS.click();
	
		Thread.sleep(3000);
		

		WebElement okButtonELS = driver.findElement(By.xpath(".//*[@id='DefaultContent_btnPnlMessageClose']"));
		okButtonELS.click();
		
		Thread.sleep(3000);
		
		WebElement nextButton = driver.findElement(By.id("DefaultContent_btnNext"));
		nextButton.click();
		
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
		
}


}

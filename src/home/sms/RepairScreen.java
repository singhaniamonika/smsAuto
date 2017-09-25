package home.sms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class RepairScreen {

public void addNew (WebDriver driver)
{

	try {
	WebElement addNewButton = driver.findElement(By.id("DefaultContent_btnAddNew"));
	addNewButton.click();
	
		Thread.sleep(3000);
	
	Select faultCode = new Select(driver.findElement(By.id("DefaultContent_ucAddEditRepair_ddlFaultCode")));
	faultCode.selectByVisibleText("1-Part Faulty");
	
	Thread.sleep(2000);
	
	/*WebElement partCodeForPartFaulty = driver.findElement(By.id("txtPartName"));
	Actions builder = new Actions(driver);
	builder.moveToElement(partCodeForPartFaulty);
	builder.sendKeys("61830023982-RF Cable-ZIANT1731-Astra-4G(Ziox-Mobile)");
	builder.sendKeys(Keys.DOWN);
	builder.sendKeys(Keys.ENTER);
	builder.build().perform();*/
	
	WebElement partCodeForPartFaulty = driver.findElement(By.id("txtPartName"));
	partCodeForPartFaulty.sendKeys("6");
	Thread.sleep(2000);
	Actions builder = new Actions(driver);
	builder.moveToElement(driver.findElement(By.xpath(".//*[@id='txtPartName']")));
	builder.sendKeys(Keys.DOWN);
	builder.sendKeys(Keys.ENTER);
	builder.build().perform();
	
	
	
	
	
	
	
	Thread.sleep(2000);
	
	WebElement savingPartFaulty = driver.findElement(By.id("btnSave"));
	savingPartFaulty.click();
	
	WebElement closingPartFaulty = driver.findElement(By.id("DefaultContent_ucAddEditRepair_btnExit"));
	closingPartFaulty.click();
	
	//Thread.sleep(2000);
	
	//WebElement savingPartFaulty1 = driver.findElement(By.id("btnSave"));
	//savingPartFaulty1.click();
	
	Thread.sleep(2000);
	
	WebElement enterEnggRemarks = driver.findElement(By.id("DefaultContent_txtEnggRemarks"));
	enterEnggRemarks.sendKeys("tp");
	
	WebElement submitingOnRepair = driver.findElement(By.id("DefaultContent_btnSubmit"));
	submitingOnRepair.click();
	
	Thread.sleep(2000);
	
	WebElement okRepair = driver.findElement(By.xpath(".//*[@id='DefaultContent_btnPnlMessageClose']"));
	okRepair.click();
	
	
	
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
			
}


}

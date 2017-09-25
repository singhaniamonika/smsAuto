package home.sms;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class GetSRNumber {

public void getSRNumberText(WebDriver driver)
{
	/*WebDriverWait wait = new WebDriverWait(driver,30);
	WebElement alertForSR = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='DefaultContent_PnlMessage']/table")));
	System.out.println("on the alert box");
	alertForSR.accept();*/
	
	//element.sendKeys("john");
	
/*WebDriverWait wait = new WebDriverWait(driver, 10);
       wait.until(ExpectedConditions.alertIsPresent());
       */
   Alert alert = driver.switchTo().alert();
//String message=alert.getText();


       //log().info("Alert detected: {}" + alert.getText());
       alert.accept();	
}


}

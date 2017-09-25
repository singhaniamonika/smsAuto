package home.sms;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GenerateMobileServiceRequest {

	public void createZioxMobileCall(WebDriver driver) {
		try {

			WebElement imeino = driver.findElement(By.id("DefaultContent_txtIMEINo"));
			imeino.sendKeys("435456332534196");

			WebElement goclick = driver.findElement(By.id("DefaultContent_btnGo"));
			goclick.click();

			Thread.sleep(1000);

			WebElement firstName = driver.findElement(By.id("DefaultContent_txtFirstName"));
			firstName.sendKeys("abc");

			WebElement mobileNumber = driver.findElement(By.id("DefaultContent_txtMobile"));
			mobileNumber.sendKeys("9090909090");

			Select mobileBrandDropdown = new Select(driver.findElement(By.id("ddlBrand")));
			mobileBrandDropdown.selectByVisibleText("HAIER MOBILE");

			Select mobileModelDropdown = new Select(driver.findElement(By.id("DefaultContent_ddlModel")));
			mobileModelDropdown.selectByVisibleText("C380(Haier)");

			WebElement popSuppliers = driver.findElement(By.id("DefaultContent_txtPurchaseShowRoom"));
			popSuppliers.sendKeys(new String[] { "abcplaza" });

			WebElement datecl = driver.findElement(By.id("DefaultContent_ajaxDOP"));

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("$('#DefaultContent_ajaxDOP').trigger('click')", datecl);
			Thread.sleep(1000);
			js.executeScript("$('#DefaultContent_CalendarExtender3_today').trigger('click')", datecl);
			

			//WebElement imeiSecondaryno = driver.findElement(By.id("DefaultContent_txtSecondaryIMEI"));
			//imeiSecondaryno.sendKeys(new String[] { "123654789656783" });

			Select submittedBy = new Select(driver.findElement(By.id("DefaultContent_ddlSubmittedBy")));
			submittedBy.selectByVisibleText("Customer");

			WebElement invoiceNumber = driver.findElement(By.id("DefaultContent_txtInvoiceNumber"));
			invoiceNumber.sendKeys(new String[] { "98789" });

			WebElement customerProblem = driver.findElement(By.id("DefaultContent_txtCustomerProblem"));
			customerProblem.sendKeys(new String[] { "switch on/off" });

			Select physicalCondition = new Select(driver.findElement(By.id("DefaultContent_ddlPhysicalCondition")));
			physicalCondition.selectByVisibleText("Good");

			Select customerFaultCode = new Select(driver.findElement(By.id("DefaultContent_ddlFaultCode")));
			customerFaultCode.selectByVisibleText("Damage");

			// multiple select list
			WebElement allItems = driver.findElement(By.id("DefaultContent_lstSubfault"));
			Select dropdown = new Select(allItems);
			// get all options of list
			List<WebElement> options = dropdown.getOptions();
			// int i=0;
			for (WebElement option : options) {
				option.click();
				WebElement rightShift = driver.findElement(By.id("imgMap"));
				rightShift.click();
			}
			
			WebElement submitingCall = driver.findElement(By.id("DefaultContent_btnSave"));
			submitingCall.click();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}

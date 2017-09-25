package home.sms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class OpenBrowser {
	public static void main(String[] args)
	{
		try {
		System.out.print("hi");
		//System.setProperty("webdriver.gecko.driver","F:\\EclipseWorkspace\\drivers\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://sms.demos.rvsolutions.in/rvLogin.aspx");
		System.out.print("opened");
		
		WebElement userid = driver.findElement(By.id("FormPlaceHolder_txtLoginName"));
		userid.sendKeys("shn123");
		
		WebElement password = driver.findElement(By.id("FormPlaceHolder_txtPassword"));
		password.sendKeys("1");
		
		WebElement submit = driver.findElement(By.id("FormPlaceHolder_btnSave"));
		submit.click();
		
		
		Thread.sleep(3000);
		
		Actions action = new Actions(driver);
		WebElement service = driver.findElement(By.xpath(".//*[@id='mnuFMS']/ul/li[3]/a"));
		action.moveToElement(service).build().perform(); 	
				
		WebElement generateNewRequest = driver.findElement(By.xpath(".//*[@id='mnuFMS:submenu:9']/li[1]/a"));
		generateNewRequest.click();
		
		Select mobileBrandDropdown = new Select(driver.findElement(By.id("ddlBrandTop")));
		mobileBrandDropdown.selectByVisibleText("Ziox Mobiles");
		
		
		GenerateMobileServiceRequest generateMobileServiceRequest = new GenerateMobileServiceRequest();
		generateMobileServiceRequest.createZioxMobileCall(driver);
		
		Thread.sleep(3000);
		
		WebElement okButton = driver.findElement(By.xpath(".//*[@id='DefaultContent_btnPnlMessageClose']"));
		okButton.click();
		
		Thread.sleep(3000);
		
		WebElement nextButton = driver.findElement(By.id("DefaultContent_btnNext"));
		nextButton.click();
		
		
		
		//GetSRNumber getSRNumber = new GetSRNumber();
		//getSRNumber.getSRNumberText(driver);
		
		ELSScreen elsScreen = new ELSScreen();
		elsScreen.elsPass(driver);
		
		Thread.sleep(3000);
		
		RepairScreen repairScreen = new RepairScreen();
		repairScreen.addNew(driver);
		
		
		
			
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

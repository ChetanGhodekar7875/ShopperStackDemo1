package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
protected WebDriver webDriver;
	
	@Parameters("bName")
	@BeforeClass
	public void launchApplication(String bname) throws InterruptedException {
		if(bname.contains("FireFox")) 
			webDriver=new FirefoxDriver();
		
		if(bname.contains("Chrome")) {
			System.setProperty("webdriver.chrome.driver","./src/test/resources/Drivers/chromedriver.exe");
			webDriver=new ChromeDriver();
		}
		if(bname.contains("Edge")) 
			webDriver=new EdgeDriver();
		
		webDriver.manage().window().maximize();
		webDriver.get("https://www.shoppersstack.com");
		webDriver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	}
	
	@AfterClass
	public void closeApplication() {
		webDriver.close();
	}
}

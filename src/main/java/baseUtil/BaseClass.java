package baseUtil;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.HomePage;

public class BaseClass {
public WebDriver driver;
public HomePage homePage;
	
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\com.zara\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		driver.get("https://www.zara.com/us/en/logon");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		homePage= new HomePage(driver);
		
	}
	
	
	
	@AfterMethod
	public void tearUp() {
		driver.quit();
	}


}

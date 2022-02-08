package newtestingfeb3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import newtestingfeb3.Readconfigfile;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	Readconfigfile conf;
	WebDriver driver;

	@Parameters("coforge")
	@BeforeTest
	public void launchApp(String br) throws Exception {
//crossBrowserTesting
		System.out.println("Execution of test case on Browser: " + br);
		if (br.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (br.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (br.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			System.out.println("choose app. browser");
		}

		driver.manage().window().maximize();
		conf = new Readconfigfile();
		driver.get(conf.appURL());
	}

	@AfterTest
	public void closeApp() throws Exception {
		Thread.sleep(2000);
		driver.close();
	}

}
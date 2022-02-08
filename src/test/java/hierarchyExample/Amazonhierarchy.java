package hierarchyExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazonhierarchy {
	WebDriver driver;
	@Test (priority=1)
	public void launchapp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	@Test (priority=3)
	public void closeapp() throws Exception {
		Thread.sleep(2000);
		driver.close();
	}
	@Test(priority=2)
	public void testHierarchy() {
		driver.findElement(By.xpath("//div[contains(@data-a-card-type,\"basic\")]//descendant::a[text()=\"Shop now\"]")).click();
		
	}

}

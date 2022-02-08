package newtestingfeb2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartTesting {
	WebDriver driver;
	@BeforeTest
	public void launchApp() {
		System.out.print("**********Welcome to Youtube**************");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		
}
	@AfterTest
	public void closeapp() {
		driver.close();
		System.out.println("**********Bye Bye**************");
	}
	@Test
	public void search() throws Exception {
		
		//driver.findElement(By.xpath("//input[@id='search']")).sendKeys(search);
		
		driver.findElement(By.xpath("(//tp-yt-paper-button[@id='button'])[2]")).click();
		Thread.sleep(4000);
//		System.out.println("the searched is: "+search );
	}
	}

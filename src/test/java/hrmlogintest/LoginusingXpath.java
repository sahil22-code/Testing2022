package hrmlogintest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginusingXpath {

@Test
public void login() throws Exception {
// System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sahil\\Downloads\\chromedriver_win32\\chromedriver.exe");
// WebDriver driver = new ChromeDriver();
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/");
//xpath - excercise
driver.findElement(By.xpath("//input [@id='txtUsername']")).sendKeys("Admin");
driver.findElement(By.xpath("//input [@id='txtPassword']")).sendKeys("admin123");
driver.findElement(By.xpath("//input[@value=\"LOGIN\"]")).click();


driver.close();
//driver.quit();

}


}

package hrmlogintest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginusinganylocator {

@Test
public void login() throws Exception {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sahil\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://opensource-demo.orangehrmlive.com/");
//Objective: Identify element uniqely
//Locator- ID/NAME/CLASSNAME/TAGNAME/LINKTEXT/PARTIALLINKTEXT/XPATH/CSS SELECTOR
//id
driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//name
driver.findElement(By.name("txtPassword")).sendKeys("admin123");
//classname
driver.findElement(By.className("button")).click();

//Close Application
driver.close();
//driver.quit();

}}


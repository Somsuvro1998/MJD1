package test_cases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class First_Test {
	@Test
public void first_test() throws Throwable
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.google.co.in/");
	WebElement searchBox = driver.findElement(By.xpath("//textarea[@name='q']"));
	searchBox.sendKeys("Selenium");
	searchBox.submit();
	//driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();
	Thread.sleep(5000);
	driver.close();
	
}
}

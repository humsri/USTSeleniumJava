package dailyAssignment_2June;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FrameTest {
	
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/frames.php");
		
	}
	
	@Test (priority =1)
	public void launchApp() {
		System.out.println("App Is Launched");
		
	}
	
	@Test (priority =2)
	public void verifyFrame1Text() {
		
		//Switch to Frame1
		driver.switchTo().frame(0);

		
		//Locate heading inside frame
		WebElement heading = driver.findElement(By.xpath("/html/body/div/header/div[2]/h1"));
		

		
		String actualText = heading.getText();
		
		System.out.println("Frame Text: " + actualText);
		
		//Validation
		Assert.assertEquals(actualText, "Selenium - Automation Practice Form");
		
		//Return to main page
		driver.switchTo().defaultContent();
		
			
	}
	
	@Test (priority =3)
	public void closeApp() {
		System.out.println("App Is Closed");
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	
}

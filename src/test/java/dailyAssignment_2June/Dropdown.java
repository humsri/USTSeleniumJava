package dailyAssignment_2June;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Dropdown {
		
		WebDriver driver;
		
		@BeforeClass (groups = { "smoke" })
		public void setup() {
			
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://the-internet.herokuapp.com/dropdown");
			
			System.out.println("Setup @BeforeClass is executed");
			
		}
		
		@Test (groups = { "regression" })
		public void launchApp() {
			System.out.println("App Is Launched");
			
		}
		
		/**
		 * 
		 */
		@Test (groups = { "smoke" })
		public void selectOption1Test() {

			WebElement dropdown = driver.findElement(By.id("dropdown"));
			
			Select select = new Select(dropdown);
			select.selectByVisibleText("Option 1");
		    String actualOption = select.getFirstSelectedOption().getText();
		    		    
		    System.out.println("Actual option selected--> " + actualOption);
		    	
				
		}
		
		@Test (groups = { "regression" })
		public void closeApp() {
			System.out.println("App Is Closed");
			
		}
		
		@AfterClass (groups = { "smoke" })
		public void tearDown() {
			System.out.println(" @AfterClass is executed");
			driver.quit();
		}

	

	}



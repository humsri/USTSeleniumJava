package dailyAssignment_1June;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginCheck {

	static WebDriver driver;

	public static void main(String[] args) {
		
// setup chrome driver using WebDriver Manager
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--guest");
		try {
			driver = new ChromeDriver(options);
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			
			Thread.sleep(4000);
			WebElement username = driver.findElement(By.id("user-name"));
			username.sendKeys("standard_user");
			
			WebElement pwd = driver.findElement(By.id("password"));
			pwd.sendKeys("secret_sauce");
			
			WebElement loginButton =  driver.findElement(By.id("login-button"));
			loginButton.click();
					
			String title= driver.getTitle();
			System.out.println("The name of the page title is -  "+ title);
			
			String currentTitle = driver.getCurrentUrl();
			System.out.println("The current url is - " + currentTitle);
			
			String ExpectedUrl = "https://www.saucedemo.com/inventory.html";
			
			if(currentTitle.equals (ExpectedUrl)) {
				System.out.println("Both values are matching and landed in homepage");
			} else {
				System.out.println("Current url is not matched");
			}
			
			//driver.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

package dailyAssignment_1June;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginAfterRegistration {

	    static WebDriver driver;

		public static void main(String[] args) {
			
	// setup chrome driver using WebDriver Manager
			
			WebDriverManager.chromedriver().setup();
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--guest");
			try {
				driver = new ChromeDriver(options);
				driver.get("https://www.tutorialspoint.com/selenium/practice/login.php");
				driver.manage().window().maximize();	
				
				Thread.sleep(4000);
				
				WebElement uname =  driver.findElement(By.id("email"));
				uname.sendKeys("Srikanth123@gmail.com");
				
				WebElement pwd =  driver.findElement(By.id("password"));
				pwd.sendKeys("Password@123");
				
				driver.findElement(By.xpath("//input[@value='Login']")).click();
				
				String CurrentUrl = driver.getCurrentUrl();
		
				if(CurrentUrl.contains("login")){
					System.out.println("Login Attempt Completed");
				} else {
					System.out.println("Login Failed");
				}
			}
			
				catch (Exception e) {
					e.printStackTrace();
				}

	}

}

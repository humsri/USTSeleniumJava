package dailyAssignment_1June;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Registration {

	static WebDriver driver;

	public static void main(String[] args) {
		
// setup chrome driver using WebDriver Manager
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--guest");
		try {
			driver = new ChromeDriver(options);
			driver.get("https://www.tutorialspoint.com/selenium/practice/register.php");
			driver.manage().window().maximize();
			
			Thread.sleep(4000);
			WebElement fname = driver.findElement(By.id("firstname"));
			fname.sendKeys("Srikanth");
			
			WebElement lname = driver.findElement(By.id("lastname"));
			lname.sendKeys("Selvaraj");
			
			WebElement uname =  driver.findElement(By.id("username"));
			uname.sendKeys("Srikanth123@gmail.com");
			
			WebElement pwd =  driver.findElement(By.id("password"));
			pwd.sendKeys("Password@123");
			
			WebElement register =  driver.findElement(By.xpath("//input[@value='Register']"));
			register.click();
			
			Thread.sleep(3000);
			
			String CurrentUrl = driver.getCurrentUrl();
			String ExpectedUrl = "https://www.tutorialspoint.com/selenium/practice/register.php#";
			
			if(CurrentUrl.equals (ExpectedUrl)) {
				System.out.println("Registration is Successful");
			} else {
				System.out.println("Registration is Failed");
			}
					
			
			//driver.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

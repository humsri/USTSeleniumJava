package UST.SeleniumJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvokeFF {

	static WebDriver driver;

	public static void main(String[] args) {
		
// setup firefox driver using WebDriver Manager
		
		WebDriverManager.firefoxdriver().setup();
		
		try {
			driver = new FirefoxDriver();
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			
			
			//driver.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}

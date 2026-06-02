package UST.SeleniumJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvokeChrome {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
// setup chrome driver using WebDriver Manager
		
		WebDriverManager.chromedriver().setup();
		
		try {
			driver = new ChromeDriver();
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			
			String title= driver.getTitle();
			System.out.println("The name of the page title is -  "+ title);
			
			driver.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}

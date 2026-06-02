package UST.SeleniumJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserNavigations {

		static WebDriver driver;

		public static void main(String[] args) {
			
	// setup chrome driver using WebDriver Manager
			
			WebDriverManager.chromedriver().setup();
			
			try {
				driver = new ChromeDriver();
				driver.get("https://www.saucedemo.com/");
				driver.manage().window().maximize();
				
				String title= driver.getTitle();
				System.out.println("The name of the page title is -  "+ title);
				
				String currentTitle = driver.getCurrentUrl();
				System.out.println("The current url is - " + currentTitle);
				
				String ExpectedUrl = "https://www.saucedemo.com/";
				
				if(currentTitle.equals (ExpectedUrl)) {
					System.out.println("Both values are matching");
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

package UST.SeleniumJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvokeEdge {

	static WebDriver driver;

	public static void main(String[] args) {
		
// setup edge driver using WebDriver Manager
		
		WebDriverManager.edgedriver().setup();
		
		try {
			driver = new EdgeDriver();
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			
			
			//driver.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}


}

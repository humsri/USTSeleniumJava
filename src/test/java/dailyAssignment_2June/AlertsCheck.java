package dailyAssignment_2June;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsCheck {

	static WebDriver driver;

	public static void main(String[] args) {
		
// setup chrome driver using WebDriver Manager
		
		WebDriverManager.chromedriver().setup();
		
		try {
			driver = new ChromeDriver();
			driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
			driver.manage().window().maximize();	
			
			Thread.sleep(4000);
			
			//simple alert
			
			WebElement Alert1 = driver.findElement(By.xpath("//button[@onclick='showAlert()']"));
			Alert1.click();
			Thread.sleep(2000);
			Alert simpleAlert = driver.switchTo().alert();
			System.out.println("Simple Alert Text:" + simpleAlert.getText());
			simpleAlert.accept();
			Thread.sleep(2000);
			
			//Late Alert
			
			WebElement Alert2 = driver.findElement(By.xpath("//button[@onclick='myMessage()']"));
			Alert2.click();
			Thread.sleep(5000);
			Alert lateAlert = driver.switchTo().alert();
			System.out.println("Late Alert Text:" + lateAlert.getText());
			Thread.sleep(2000);
			simpleAlert.accept();
			Thread.sleep(2000);
			
			//Confirmation Alert
			
			WebElement Alert3 = driver.findElement(By.xpath("//button[@onclick='myDesk()']"));
			Alert3.click();
			Thread.sleep(2000);
			Alert confirmationAlert = driver.switchTo().alert();
			System.out.println("Confirmation Alert Text:" + confirmationAlert.getText());
			Thread.sleep(2000);
			confirmationAlert.dismiss(); //Click CANCEL
			Thread.sleep(2000);
			
			//Prompt Alert
			
			WebElement Alert4 = driver.findElement(By.xpath("//button[@onclick='myPromp()']"));
			Alert4.click();
			Thread.sleep(2000);
			Alert promptAlert = driver.switchTo().alert();
			promptAlert.sendKeys("Sri");
			System.out.println("Prompt Alert Text:" + promptAlert.getText());
			Thread.sleep(2000);
			promptAlert.accept(); //Click OK
			Thread.sleep(2000);
			
		   }
		
		
		catch (Exception e) {
			e.printStackTrace();
		}
 
	}
}

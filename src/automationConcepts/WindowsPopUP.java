package automationConcepts;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsPopUP {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "src/resource/chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://lbsimds.ac.in/");
			
	        // Handle the alert
	       Alert  alertText = driver.switchTo().alert();
	       
	        System.out.println("Alert text: " + alertText);
	        alertText.accept(); // Or alert.dismiss() if needed

	        // Continue with other actions on the page
	        // ...

	        driver.quit();
//			Set<String> handler =driver.getWindowHandles();
//			Iterator<String> it =handler.iterator();
//			
//			String parentWindowId = it.next();
//			System.out.println("id is " + parentWindowId);
//			
//			
//			
//			String ChildWindowId = it.next();
//			System.out.println("id is " + ChildWindowId);
	}

}
//need to resolve this not works
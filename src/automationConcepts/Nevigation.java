package automationConcepts;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nevigation {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "src/resource/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				driver.get("https://www.ebay.com/");
				driver.navigate().to("https://www.amazon.in");
				driver.navigate().back();
				driver.navigate().forward();
				driver.navigate().refresh();
	}
//Q driver.get() vs navigate.to()
}

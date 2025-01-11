package automationConcepts;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/resource/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	
	
//		driver.get("https://upsee.in/");
		driver.get("https://www.goelgroup.co.in/");
		
		
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		// the above is deprecated 
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//*[@id=\"elementor-popup-modal-53\"]/div/a")).click();
		driver.findElement(By.id("form-field-name")).sendKeys("arvind");
		driver.findElement(By.id("form-field-email")).sendKeys("arvind@gmail.com");
		
		
}
	
}

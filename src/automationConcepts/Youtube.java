package automationConcepts;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Youtube {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/resource/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=LxJzeiTQGoE&list=PLFGoYjJG_fqo4oVsa6l_V-_7-tzBnlulT&index=34&t=1308s");
		
		String title=driver.getTitle();
		
		driver.manage().window().maximize();
		
//		explicit wait for the element
		
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement ChannelTitle=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Selenium WebDriver Tutorials - By Naveen AutomationLabs")));
		
					System.out.println(ChannelTitle.getText());
		
		
		
//	System.out.println(driver.findElement(By.linkText("Selenium WebDriver Tutorials - By Naveen AutomationLabs")).getText()); 
		
	//scroll by 2000 line important
	JavascriptExecutor js =(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,2000)");
		
	
	
	}

}

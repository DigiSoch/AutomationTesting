package automationConcepts;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMomentConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/resource/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
	
		Actions action =new Actions(driver);
		
		action.moveToElement(driver.findElement(By.linkText("SwitchTo"))).build().perform();
		//static wait
		Thread.sleep(3000);
		driver.findElement(By.linkText("Windows")).click();
		
		

	}

}

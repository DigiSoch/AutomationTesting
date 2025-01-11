package automationConcepts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelFileUploadPopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/resource/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().getImplicitWaitTimeout();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.id("imagesrc")).sendKeys("C:\\Users\\arvin\\Pictures\\Camera Roll\\WIN_20240904_00_22_58_Pro.jpg");
		//attach handling is important in interview , do not click at browse button only sendkey
		driver.quit();	
	}
}

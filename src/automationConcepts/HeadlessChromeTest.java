package automationConcepts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class HeadlessChromeTest {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/resource/chromedriver.exe");
	
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("window-size=1400,800");
		option.addArguments("headless");
		
		WebDriver driver =new ChromeDriver(option);
		driver.get("https://demo.automationtesting.in/Register.html");
		System.out.println(driver.getTitle());
}
}


//mandatory options :
//1. version should be greater than 59 on and greater than 60 on windmvs
//2. windmy-size—14ØØ , 800
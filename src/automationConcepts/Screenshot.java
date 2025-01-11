package automationConcepts;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "src/resource/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				driver.get("https://www.ebay.com/");
				//take screenshot and store as a file format
				File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				
				//now copy screenshot to desire location
				
				FileUtils.copyFile(src, new File("C:\\Users\\arvin\\Downloads\\myscreenshot.png"));
				

	}

}

package automationConcepts;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadProperties {
	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		FileInputStream iput =new FileInputStream("/Users/arvin/eclipse-workspace/Automation/src/config.properties");		
		prop.load(iput);
		System.out.println(prop.getProperty("Browser"));
		System.out.println(prop.getProperty("Name"));
		System.out.println(prop.getProperty("Location"));
		
		System.setProperty("webdiver.chrome.driver", "src/resource/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get(prop.getProperty("URL"));
		
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Lucknow ");
		driver.findElement(By.xpath(prop.getProperty("Address"))).sendKeys("Charbagh");
		
		
	}
}

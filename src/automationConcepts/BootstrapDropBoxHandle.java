package automationConcepts;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropBoxHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/resource/chromedriver.exe");
//		here the WebDriver is the interface and the ChromeDriver is class which implement this interface
		WebDriver driver =new ChromeDriver();
//		driver.manage().window().maximize();
		
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		driver.findElement(By.xpath("//button[@type='button']//following-sibling::ul/li//label[contains(text(),'jQuery tutorial')]")).click();
		driver.findElement(By.xpath("//button[@type='button']//following-sibling::ul/li//label[contains(text(),'Bootstrap Tips')]")).click();
		driver.findElement(By.xpath("//button[@type='button']//following-sibling::ul/li//label[contains(text(),'HTML')]")).click();
		driver.findElement(By.xpath("//button[@type='button']//following-sibling::ul/li//label[contains(text(),'jQuery tutorial')]")).click();
		
//		to select all we can use for loop
		
//		Thread.sleep(3000);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3,10));
		List<WebElement> list= driver.findElements(By.xpath("//button[@type='button']//following-sibling::ul/li//label"));
		for(int i=0;i<list.size();i++)
		{
		
			list.get(i).click();
			}
		}
		
		
	}



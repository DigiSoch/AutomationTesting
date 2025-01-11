package automationConcepts;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/resource/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		//driver.manage().window().maximize();
		
		
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("kathal");
		Thread.sleep(6000);
	//	List<WebElement> list= driver.findElements(By.xpath("//ul[@role='listbox']//li//descendant::div[@role='option']//div[@class='wM6W7d']//span"));
//		List<WebElement> list= driver.findElements(By.xpath("//ul[@role='listbox']//li//descendant::div[@role='option']//div[@class='wM6W7d']"));
		List<WebElement> list= driver.findElements(By.xpath("//ul//li//div[@class='wM6W7d']/span"));
		
				 
		//System.out.println(list.size());
		
		for(int i=0 ;i<list.size();i++)
		{
			System.out.println(i+" -> " + list.get(i).getText());
			
			//driver.findElement(By.xpath("//ul[@role='listbox']/li[3]//div[@class='wM6W7d']")).click();
			if (list.get(i).getText().contains("kathal ki sabji"))
				
			{
//				since index starts from 0 but li start from 1
				list.get(i).click();
//				driver.findElement(By.xpath("//ul//li["+i+"]//div[@class='wM6W7d']/span")).click();
//				driver.findElement(By.xpath("//ul[@role='listbox']/li["+(i+1)+"]//div[@class='wM6W7d']")).click();
				break;
			}
			
		}
		Thread.sleep(3000);
		driver.quit();
	}

}
//*[@id="jZ2SBf"]/div[1]/span


//ul[@class='G43f7e']/
package automationConcepts;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/resource/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.ebay.com/");
		List <WebElement> myList= driver.findElements(By.tagName("a"));
		System.out.println(myList.size());
		
		//to print the data we use for loop
		for(int i=0; i< myList.size(); i++)
		{
			String linkText =myList.get(i).getText();
			System.out.println(linkText);
		}
		
		//Q how to see how many buttons input or links or from are there 
	}

}

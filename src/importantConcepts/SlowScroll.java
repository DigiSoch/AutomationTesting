package importantConcepts;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SlowScroll {

	
	WebDriver driver;
	long maxheight;
	
	@BeforeClass
	public void setup()
	{
	driver =new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	driver.get("https://en.wikipedia.org/wiki/Selenium#History");
	}
	
	
	@Test
	public void testSlowScroll() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		int srollAmount=10;
		maxheight= (long)(js.executeScript("return document.body.scrollHeight"));
		System.out.println(maxheight);
		
		for(int i=0; i< maxheight -srollAmount; i +=srollAmount )
		{
			js.executeScript("window.scrollBy(0,"+ srollAmount +")");
			
			Thread.sleep(20);
		}
		
	}
	
	


	@AfterClass
	public void tearDown() {
//		driver.close();
	}
	
	
	
	
	
}

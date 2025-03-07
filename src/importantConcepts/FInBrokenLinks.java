package importantConcepts;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FInBrokenLinks {
	WebDriver driver;
	
	
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
	}
	
	
	@Test
	public void findbrokenLink()
	{
		
// find all anchor tags
		List<WebElement> links =driver.findElements(By.tagName("a"));

		for(WebElement link :links)
		{
//	get href value of each anchor tag
			String url= link.getAttribute("href");
			
		
			URL urlobj;
			try {
				urlobj = new URL(url);
				
//	Send http request and find the response
				HttpURLConnection con = (HttpURLConnection) urlobj.openConnection();
				con.setRequestMethod("HEAD");
				int responseCode=con.getResponseCode();
				
//		compare the respnse code 
				if(responseCode>400)
				{
					System.out.println("Broken link found :"+ url);
				}
			}
			catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}
	
}

package importantConcepts;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Screenshot {
	
	private WebDriver driver;
	
	@BeforeClass
	private void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		
	}
	
	

	@Test
	private void takeS() throws IOException
	{
	//converting the 
		TakesScreenshot scr =(TakesScreenshot)driver;
		
		File file=new File("src/resource/screeenshot/avidence_"+getTimedate()+".png");
		
		File srshot=scr.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(srshot, file);
	
		
	}
	
	
	
	
	@AfterClass
	private void tearDown()
	{
//		driver.close();
	}
	
	public String getTimedate()
	{
		Date date=new Date();
		System.out.println(date);
		String pattern=date.toString().substring(10, 19).replaceAll(" ", "").replaceAll(":","-");
	
		return pattern;
		
	}
	
}

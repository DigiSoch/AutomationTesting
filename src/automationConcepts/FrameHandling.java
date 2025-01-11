package automationConcepts;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/resource/chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			
			
			//dynamic wait 
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.get("https://demo.automationtesting.in/Frames.html");
			//driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("arvind");
			
			//here is very important things to notice that if you are facing the no such element: Unable to
			//locate element that means either you have give the wrong selection or element is in the frame
			//to handle with the frame we have to switch into frame
			//on web page you can find the name of frame by right click using view source
			
			driver.switchTo().frame("SingleFrame");
			Thread.sleep(3000);
			
			//driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("arvind");
			//the above xpath is not good practice to give xpath learn to create dynamic xpath as below
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("arvind");
			
}
}
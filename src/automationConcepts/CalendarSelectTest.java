package automationConcepts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalendarSelectTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/resource/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		
	
		Thread.sleep(2000);
		driver.findElement(By.id("datepicker2")).click();
		Thread.sleep(2000);
		Select select =new Select(driver.findElement(By.xpath("//select[@title='Change the month']")));
		Thread.sleep(2000);
		select.selectByVisibleText("July");
		driver.findElement(By.xpath("//select[@title='Change the year']")).sendKeys("1998");
//		Select select1 =new Select(driver.findElement(By.xpath("//select[@title='Change the year']")));
		Thread.sleep(2000);
		
		
		driver.findElement(By.linkText("4")).click();
		
		
		
	}

}

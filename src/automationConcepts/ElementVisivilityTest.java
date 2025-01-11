package automationConcepts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisivilityTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/resource/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Boolean abc= driver.findElement(By.id("remember")).isSelected();
		System.out.println(abc);
		
		abc =driver.findElement(By.xpath("//input[@name='proceed']")).isEnabled();
		
		System.out.println(abc);
		
		abc =driver.findElement(By.xpath("//input[@name='proceed']")).isDisplayed();
		System.out.println(abc);

	}

}

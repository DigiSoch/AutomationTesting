package automationConcepts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBox {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "src/resource/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.automationtesting.in/Register.html");
	
	driver.findElement(By.id("msdd")).click();
	
	driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[6]/a")).click();
	
	driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[3]/a")).click();
	driver.findElement(By.cssSelector("body")).click();
	
	//here the select element not used in website so to automate this type of drop down used click function
	//need to scroll the page where the element exists for above
	Select select = new Select(driver.findElement(By.id("Skills")));
	select.selectByVisibleText("Android");
	
	
	Select select1 =new Select(driver.findElement(By.id("yearbox")));
	select1.selectByVisibleText("2011");
	
	
	
	
		
	
	
		
	
				
}
}

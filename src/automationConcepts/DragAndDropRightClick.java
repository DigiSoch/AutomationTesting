package automationConcepts;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropRightClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/resource/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
//		driver.manage().window().maximize();
		
		Actions action =new Actions(driver);
		
		
		
		action.moveToElement(driver.findElement(By.linkText("Interactions"))).build().perform();
		action.moveToElement(driver.findElement(By.linkText("Drag and Drop"))).build().perform();
		driver.findElement(By.linkText("Static")).click();
		//from above we will reach to the drag and drop web page
		
		//one step drag and drop
		action.dragAndDrop(driver.findElement(By.id("angular")),driver.findElement(By.id("droparea"))).build().perform();
		
		//two steps drag and drop
		action.clickAndHold(driver.findElement(By.id("angular"))).moveToElement(driver.findElement(By.id("droparea"))).release().build().perform();
		
		
		
//		right click using contextClick
//		WebElement nameBox=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
//		action.contextClick(nameBox).perform();
		action.contextClick().perform();
		
//		
//		Thread.sleep(Duration.ofSeconds(5));
//		WebElement elementOpen = driver.findElement(By.xpath("//*[text()='Paste']")); 
//		
//		elementOpen.click();
//		driver.close();
		
	} 

}

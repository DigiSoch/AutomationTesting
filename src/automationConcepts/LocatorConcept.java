package automationConcepts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "src/resource/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
			driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[1]/input")).sendKeys("arvind");
			driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[2]/input")).sendKeys("kumar");
			driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("Royal Soceity gaurabagh coloney 226022");
			driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("arvindkuamr@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("8707692972");
			
			driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")).click();
			driver.findElement(By.xpath("//*[@id=\"checkbox1\"]")).click();
			
			
			// for all above elements we can use id selector also
			//driver.findElement(By.id("msdd")).click();
			
			//driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[6]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"Skills\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"Skills\"]/option[8]")).click();
			
			
			 
			// 3. name:
			
			//4. linkText :
			//this is only for links
		
			// 5. partialLinkText: not useful
		
			//6. CSSSe1ector:
		driver.findElement(By.cssSelector("#Skills")).click();
			
			

			
			
			//*[@id="msdd"]
			
		//for link only we use link selector 
			//driver.findElement(By.linkText("Home")).click();
			//*[@id="header"]/nav/div/div[2]/ul/li[1]/a
		System.out.println(driver.getTitle());
	
	/*
	 * periority of the selector
	 * id
	 * xpath - relative
	 *name
	 *css selector using id class should be duplicate
	 *linktext for link only
	 *classname
	 */
		
		
		
		
}
}

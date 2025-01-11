package automationConcepts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableHandle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/resource/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://ui.cogmento.com/contacts");
		driver.findElement(By.name("email")).sendKeys("dm.d.ngsn.d.n.f.s.nb.t@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Automation@12345");
		
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		Thread.sleep(6000);
		
	/*
		//first method - using for loop , but less useful when data is very large
		
//		driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/div/table/tbody/tr[1]/td[1]")).click();
		String beforeXpath="//table/tbody/tr[";
		String AfterXpath="]/td[2]/a";
		
		for(int i=1;i<=5;i++) 
		{
			String text= driver.findElement(By.xpath(beforeXpath+i+AfterXpath)).getText();
			if(text.equals("vdvv"))
			{
				driver.findElement(By.xpath(beforeXpath+i+"]/td[2]")).click();
			}
			
		}
		
*/
		
		
		
		// second method
		driver.findElement(By.xpath("//a[contains(text(),'vdvv')]//parent::td//preceding-sibling::td")).click();
		
		//use xpath helper extension to make custom path 
		
	
		
		
		
		
		
		
		
		
//		System.out.println(driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]/a")).getText());
//		System.out.println(driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]/a")).getText());
//		System.out.println(driver.findElement(By.xpath("//table/tbody/tr[3]/td[2]/a")).getText());
//		System.out.println(driver.findElement(By.xpath("//table/tbody/tr[4]/td[2]/a")).getText());
//		System.out.println(driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]/a")).getText());
		
//		/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[2]/a
	}
}
//ul[@class='G43f7e']/li

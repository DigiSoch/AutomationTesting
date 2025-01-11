package automationConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicWebdriver {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "src/resource/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		System.out.println(title);
		//same thing works for firefox . In safari no need to add properties and driver path only you have to add selenium extension in safari and enable automation in develop menu of safari
		
		//validation
		if(title.equals("Google"))
		{
			System.out.println("correct title");
		}
		else
		{
			System.out.println("Title is not correct");
		}
	
		String current_url=driver.getCurrentUrl();
		System.out.println(current_url);
		
		String source=driver.getPageSource();
		//System.out.println(source);
		
		driver.quit();
		
	}

}

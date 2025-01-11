package automationConcepts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverconcept {

	public static void main(String[] args) {
		//.setProperty("webdiver.chrome.driver", "src/resource/chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		//HtmlUnitDriver not available in selenium now
		//we need to download jar file to use it and add it in dependencies by - go to build path - library- classpath-add external library
		
		WebDriver driver =new HtmlUnitDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		System.out.println("before click -" +driver.getTitle());
		
		driver.findElement(By.linkText("WebTable")).click();
		System.out.println("after click -" + driver.getTitle());
		//aåvantages :
		//1. testing is happening behind the scene --no browser is launched
		//2. Very fast -- execution of test cases		-- very fast -- performance of the script
		//3. not suitable for Actions class		-- user actions -- mouse_moemvgnent, doubleC1ick, drag and drop
		
		//also called-  Ghost Driver -- HeadLess Browser:some are below- 
		//--HtmlUnit Driver Java
		//--PhantanJS JavaScript
	}

}

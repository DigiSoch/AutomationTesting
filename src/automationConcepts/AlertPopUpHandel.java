package automationConcepts;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandel {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "src/resource/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			driver.findElement(By.name("proceed")).click();
			Thread.sleep(5000);
			Alert alert=  driver.switchTo().alert();
			String alertTxt= alert.getText();
			System.out.println(alertTxt);
			
			alert.accept();
			if(alertTxt.equals("Please enter a valid user name")) {
				System.out.println("correct text");
			
			}
			else {
				System.out.println("not correct text");
			}
	}

}


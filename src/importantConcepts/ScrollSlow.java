package importantConcepts;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class ScrollSlow {

    WebDriver driver;
    long totalHeight;

    @BeforeClass
    public void setupBrowser() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://en.wikipedia.org/wiki/Selenium#History");
    }

    @Test
    public void scrollSlowStep() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        totalHeight = (long)js.executeScript("return document.body.scrollHeight");

        int scrollIncrement =1;

        for (int i = 0; i < totalHeight - scrollIncrement; i += scrollIncrement) {
            js.executeScript("window.scrollBy(0, " + scrollIncrement + ")");
            System.out.println(i);
            Thread.sleep(1); // Optional: Add a small delay between scrolls
        }
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
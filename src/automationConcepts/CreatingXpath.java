package automationConcepts;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v127.indexeddb.model.Key;

public class CreatingXpath {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "src/resource/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&sgfl=gh&ru=https%3A%2F%2Fwww.ebay.com%2F");
		//when we copy x path sometime gives below type of xpath which is not recommended because after some time the hieracy changes then the xpath will not work
		
		//*[@id="post-6"]/div/div/section[3]/div/div[3]/div/div[1]/div/div/div/div/a
		
		//*[@id="vl-flyout-nav"]/ul/li[12]/a
		//*[@id="userid"]   
		driver.findElement(By.xpath("//*[@id='userid']")).click();
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("arvind");
		driver.findElement(By.xpath("//input[contains(@id,userid)]")).sendKeys(Keys.CONTROL + "a",Keys.DELETE);
		// start with //element[@attribute='value']
		
		//here contains function does not use = to to write value it use ,  userid can be put in quote also
		//contains function used even the id changed on every page refresh like user_123 -> refresh -> user_476
		// to handel this used partial id name like below
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@id,user)]")).sendKeys(Keys.CONTROL + "z");
		Thread.sleep(3000);
		driver.findElement(By.ByCssSelector.xpath("//input[starts-with(@id,'user')]")).sendKeys("arvind@gmail.com");
		
		//for link only text function can be used
		driver.findElement(By.xpath("//a[contains(text(),'AdChoice')]")).click();
		
			
			
			driver.get("https://demoqa.com/text-box");
			
			//Using contains() to locate full name and enter data
			driver.findElement(By.xpath("//input[contains(@id, 'userN')]")).sendKeys("User Name");

			//using placeholder
			driver.findElement(By.xpath("//input[contains(@placeholder, 'example')]")).sendKeys("Using Placeholder");
			
			//using start-with() 
			driver.findElement(By.xpath("//input[starts-with(@placeholder,'Fu')]")).sendKeys("Using start with");
			
			//using text() to get label
			String text = driver.findElement(By.xpath("//label[text()='Email']")).getText();
			System.out.println(text);
			
			//using AND operator to locate full name
			driver.findElement(By.xpath("//input[@placeholder ='Full Name' and @type = 'text']")).sendKeys("AND operator");
			
			//using OR operator to locate full name
			driver.findElement(By.xpath("//input[@placeholder ='Full Name' or @type = 'text']")).sendKeys("OR operator");
			
			//using ancestor to locate form tag
			boolean bol =driver.findElement(By.xpath("//label[text()='Full Name']/ancestor::form")).isDisplayed();
			System.out.println("Form is displayed : "+bol);
			
			//using child to locate full name textbox from form
			String label = driver.findElement(By.xpath("//form[@id='userForm']/child::div[1]//label")).getText();
			System.out.println("The label text is : "+ label);
			
			
			//using decendent axis to locate yes radio
			driver.get("https://demoqa.com/radio-button");
			driver.findElement(By.xpath("//div[@class= 'custom-control custom-radio custom-control-inline']/descendant::input/following-sibling::label")).click();
			
			//using parent axis to locate yes radio
			boolean bo = driver.findElement(By.xpath("//input[@id='yesRadio']/parent::div")).isSelected();
			System.out.println("The Yes radio is selected : "+bo);
			
			//using following axis to locate current address
			driver.get("https://demoqa.com/text-box");
			driver.findElement(By.xpath("//input[@id=\"userName\"]/following::textarea")).sendKeys("Text Area locate following");
			
			//using following-sibling to locate email 
			driver.findElement(By.xpath("(//div[@class='col-md-3 col-sm-12']/following-sibling::div/input)[2]")).sendKeys("abc@xyz.com");
			
			//using preceding-axis to locate full name
			String preceding = driver.findElement(By.xpath("//input[@id='userName']/preceding::label")).getText();
			System.out.println("The value of preceding : "+preceding);
			
			driver.close();
			}

		
		
		//similarly ends-with
		//Q. how will you handle dynamics id
	}	//advantage and disadvantage of using absolute xpath


//below website could be used for learn xpath

//https://toolsqa.com/selenium-webdriver/write-effective-xpaths/




//Xpath Contains() function
//tag_name[contains(@attribute,'value_of_attribute')] - //input[contains(@placeholder, "example")] -//input[contains(@id, "userN")]



//XPath Starts-with() function
//tag_name[starts-with(@attribute,'Part_of_Attribute_value')] -//input[starts-with(@placeholder,"Fu")]


//XPath Starts-with() function
//tag_name[text()='Text of the element'] -//label[text()=”Email”]



//AND & OR operators
//tag_name[@name = 'Name value' and @id = ‘ID value’] -//input[@placeholder ='Full Name' and @type = 'text']
//tag_name[@name = 'Name value' or @id = ‘ID value’] - //input[@placeholder ='Full Name' or @type = 'text']


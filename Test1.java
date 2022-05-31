package Actions_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 
{
	public static void main(String[] args) throws InterruptedException
	  {
		  // Step-I: Set path of chromedriver.exe file
		  //Parameter-I: Name of the browser
		  //Parameter-II: Path of chromedriver.exe file
		  System.setProperty("webdriver.chrome.driver", 
				  "C:\\Users\\samsung\\Desktop\\selenium-II\\Browser\\chromedriver_win32 (1)\\chromedriver.exe");
		  
		  
		  //Create object of chromedriver class and provide reference of  Webdriver interface             
		            WebDriver driver=new ChromeDriver();
		   
		  
		            driver.get("http://demo.automationtesting.in/Frames.html");
		            
		            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		            
		       //Step-I:Identify  dropdown and store into an object 
		 WebElement Dropdown=driver.findElement(By.xpath("//a[text()='SwitchTo']"));  
		 
		 
		 			//Create object of Actions class
		 			Actions act=new Actions(driver);
		 			
		 			//To move curser
		 			act.moveToElement(Dropdown).perform();
		 			
		 			Thread.sleep(1000);
		 			
		 			//to click windows option
		 			driver.findElement(By.xpath("//a[text()='Windows']")).click();
	
	  }
	
	
	
	
	
	
	
}

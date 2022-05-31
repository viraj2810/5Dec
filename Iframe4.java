package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe4 
{

	 public static void main(String[] args)
	  {
		
		  // Step-I: Set path of chromedriver.exe file
		  //Parameter-I: Name of the browser
		  //Parameter-II: Path of chromedriver.exe file
		  System.setProperty("webdriver.chrome.driver", 
				  "C:\\Users\\samsung\\Desktop\\selenium-II\\Browser\\chromedriver_win32 (1)\\chromedriver.exe");
		  
		  
		  //Create object of chromedriver class and provide reference of  Webdriver interface            
		            WebDriver driver=new ChromeDriver();
		  
		  
		  driver.get("http://demo.automationtesting.in/Frames.html");
		  
		 
		    //switch to frame
		  driver.switchTo().frame("SingleFrame");
		  
		  
		  //Identify text field and enter information
		  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("xyz");
		  
		  
		  
	}
		
	
	
	
	
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
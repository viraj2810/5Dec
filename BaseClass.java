package Library_File;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{	
	public WebDriver driver;
	public void initializeBrowser() throws IOException 
	{
		//To open an browser 
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\samsung\\Desktop\\Chrome\\chromedriver_win32 (1)\\chromedriver.exe");
				driver=new ChromeDriver();
				
				// To enter URL, maximize and implycitlyWait
				driver.get(UtilityClass.getDataFromPF("URL"));
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
	}
	
	
	
}

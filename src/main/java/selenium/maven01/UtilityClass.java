package selenium.maven01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class UtilityClass 
{
	static WebDriver driver;
	public static WebDriver openBrowser(String browserName)
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Training_C2a.04.30\\Desktop\\chromedriver.exe");
			driver = new ChromeDriver();		
		}		
		
		else
			System.out.println("Invalid Browser !!");
		return driver;
	}

}

	        


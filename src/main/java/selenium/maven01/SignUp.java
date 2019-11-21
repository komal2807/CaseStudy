package selenium.maven01;

import selenium.maven01.UtilityClass;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignUp
{
    WebDriver driver;
	
	@BeforeTest
	   public void beforeTest()
	   {
		   driver = UtilityClass.openBrowser("chrome");
		   driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	   }
	
	@Test
	   public void f()
	   {
		   driver.findElement(By.linkText("SignUp")).click();
		   driver.findElement(By.name("userName")).sendKeys("shivanirajbhoj");
		   driver.findElement(By.name("firstName")).sendKeys("shivani");
		   driver.findElement(By.name("lastName")).sendKeys("rajbhoj");
		   driver.findElement(By.name("password")).sendKeys("Password123");
		   driver.findElement(By.name("confirmPassword")).sendKeys("Password123");
		   driver.findElement(By.xpath("//input[@value='Female' and @type='radio']")).click();
		   driver.findElement(By.name("emailAddress")).sendKeys("komalkhapekar@gmail.com");
		   driver.findElement(By.name("mobileNumber")).sendKeys("7038970445");
		   driver.findElement(By.name("dob")).sendKeys("28/03/1997");
		   driver.findElement(By.name("address")).sendKeys("Manish Nagar Nagpur");
		   driver.findElement(By.name("answer")).sendKeys("Blue");
		   driver.findElement(By.name("Submit")).click();
		   driver.findElement(By.name("userName")).sendKeys("shivanirajbhoj");
		   driver.findElement(By.name("password")).sendKeys("Password123");
		   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	   }
	
	@AfterTest
	   public void afterTest()
	   {
	 	  //driver.close();
	   }
		  
}

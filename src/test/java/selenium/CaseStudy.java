package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import selenium.maven01.UtilityClass;

public class CaseStudy {
	   WebDriver driver;
	   WebDriverWait wait;
	   Actions act;
	   
	   @BeforeTest
	   public void beforeTest()
	   {
		   driver = UtilityClass.openBrowser("chrome");
		   driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	   }
	   
	   @Test(priority=1)
	   public void f()
	   {
		   act = new Actions(driver);
		   driver.findElement(By.linkText("SignIn")).click();
		   //wait = new WebDriverWait(driver, 50);
		   //wait.until(ExpectedConditions.presenceOfElementLocated(By.name("userName")));
		   driver.findElement(By.name("userName")).sendKeys("Lalitha");
		   driver.findElement(By.name("password")).sendKeys("Password123");
		   driver.findElement(By.name("Login")).click();
		   act.moveToElement(driver.findElement(By.linkText("All Categories"))).build().perform();
		   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	   
	   }
	   
	   @Test(priority=2)
	   public void doAction()
	   {
		   act = new Actions(driver);
		   act.moveToElement(driver.findElement(By.linkText("All Categories"))).build().perform();
		   act.moveToElement(driver.findElement(By.linkText("Electronics"))).click().build().perform();
		   act.moveToElement(driver.findElement(By.linkText("Head Phone"))).click().build().perform();
		   //driver.findElement(By.name("Head Phone")).click();
		   //driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	
		   WebDriverWait wait = new WebDriverWait(driver, 50);
		   wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Add to cart")));
		   driver.findElement(By.linkText("Add to cart")).click();
		   driver.findElement(By.partialLinkText("Cart")).click();
		   driver.findElement(By.linkText("Checkout")).click();
		   driver.findElement(By.xpath("//input[@value='Proceed to Pay']")).click();
		   driver.findElement(By.xpath("//label[text()='Andhra Bank']")).click();
		   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		   driver.findElement(By.xpath("//a[@id='btn' and @href='#']")).click();
		   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		   
		   //wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Net Banking")));
		   //driver.findElement(By.linkText("Continue")).click();
		   driver.findElement(By.name("username")).sendKeys("Lalitha");
		   driver.findElement(By.name("password")).sendKeys("Password123");
		   driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		   driver.findElement(By.name("PASSWORD")).sendKeys("Trans@456");
		   driver.findElement(By.xpath("//input[@value='PayNow']")).click();
		   Assert.assertEquals("Order Details", driver.getTitle());
		   driver.findElement(By.linkText("SignOut")).click();
		  // driver.close();
	   }
	   
	   @AfterTest
	   public void afterTest()
	   {
	 	  //driver.close();
	   }
}

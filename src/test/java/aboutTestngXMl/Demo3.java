package aboutTestngXMl;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo3 {
	
	ChromeDriver driver;
	@Test
	public void Login(){
	 driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("Student");
        driver.findElement(By.id("password")).sendKeys("Password123");
        driver.findElement(By.id("submit")).click();
   Assert.assertTrue(false);
  
	}
	
	@Test(dependsOnMethods = "Login",alwaysRun = true)
	public void m2() {
//	System.out.println(driver.findElement(By.tagName("h1")).getText());
		System.out.println("m2 is executed");
	}
	
}

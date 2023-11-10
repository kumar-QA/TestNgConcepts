package aboutTestngXMl;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo2 {

	@Test
	public void D() {
		System.out.println("d method");
	}

	
	@Test()
	@Parameters({"username","password"})
	public void Login(String name,String pwd) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys(name);
        driver.findElement(By.id("password")).sendKeys(pwd);
        driver.findElement(By.id("submit")).click();
        Thread.sleep(1000);
   String Actualvalue= driver.findElement(By.tagName("h1")).getText();
	String customervalue="Successfully";	
	
	Assert.assertEquals(Actualvalue, customervalue);
	
	}
	
	
	@Test
	public void E() {
		System.out.println("e method");
		
	}
	
}

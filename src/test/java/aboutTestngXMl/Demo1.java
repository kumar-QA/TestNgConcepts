package aboutTestngXMl;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo1 {

	@BeforeSuite
	public void m4() {
		
	}
	
	@BeforeTest
	void m1() {
		
	}
	
	@BeforeClass
	public  void m2() {
		
		
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
   String Actualvalue= driver.findElement(By.id("error")).getText();
	String customervalue="enter valid username";	
	
	Assert.assertEquals(Actualvalue, customervalue);
	
	}

	
	public void G() {
	}
	@Test(dependsOnMethods = "I")
	public void H() {
		System.out.println("h method");	
	}
	@Test
	public void I() {
		System.out.println("i method");
	}
	@Test
	public void J() {
		System.out.println("j method");
	}
	
}

package aboutTestngXMl;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo1 {

	
	@Test
	public void Login() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("Password123");
        driver.findElement(By.id("submit")).click();
        Thread.sleep(1000);
   String Actualvalue= driver.findElement(By.tagName("h1")).getText();
	String customervalue="Successfully";	
	
	Assert.assertEquals(Actualvalue, customervalue);
	
	}

	
	@Test
	public void G() {
		System.out.println("g method");
	}
	@Test
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

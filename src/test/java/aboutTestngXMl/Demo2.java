package aboutTestngXMl;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo2 {

    @DataProvider
	public Object[][] Data() {
	    Object[][] ob={
                {"student","Password123"},
                {"student123","Password123"},
                {"student","Password1122123"},
	            {"student1233","Password1122123"},

            };
	    return ob;
	}

	
	@Test(dataProvider = "Data")
	public void Login(String name,String pwd) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys(name);
        driver.findElement(By.id("password")).sendKeys(pwd);
        driver.findElement(By.id("submit")).click();
	}
	
	@Test(dataProvider = "Data")
	public void m3(String name,String pwd) {
		System.out.println(name + " " + pwd);
	}

	
}

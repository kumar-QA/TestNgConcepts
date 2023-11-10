package aboutTestngXMl;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AboutTestNgAnnotation {

	@BeforeSuite
	public void a() {
		System.out.println("befor suite is running");
	}
	
	@BeforeMethod
	public void d() {
		System.out.println("befor method is running");
	}
	
	@Test
	public void m1() {
		
		System.out.println("m1 method");
	}
	
	@Test
	public void m2() {
		System.out.println("m2 method");	
	}
	@Test
	public void m3() {
		System.out.println("m1 method");
	}
	@BeforeTest
	public void b() {
		System.out.println("befor test is running");
	}
	
	@BeforeClass 
	public void c() {
		System.out.println("befor class is running");	
	}
	
	@AfterMethod
	public void d1() {
		System.out.println("After Method is running");	
	}
	
	@AfterClass
	public void d2() {
		System.out.println("After class is running");	
	}
	
	@AfterTest
	public void d3() {
		System.out.println("After test is running");	
	}
	@AfterSuite
	public void d4() {

		System.out.println("After suite is running");	
		
	}
	
	
}

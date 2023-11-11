package aboutTestngXMl;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class InvoactionCountEx {

	
	@Test
	public void m1() {
		
		Assert.assertTrue(false);
		
	}
	
	@Test(dependsOnMethods = "m1")
	public void m2() {
	
	
		
	}
	

}

package aboutTestngXMl;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Abc implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName() +" onTestStart--Listener is executed");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		 System.out.println(result.getName() +"onTestSuccess--Listener is executed");
			}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName() +"onTestFailuer--Listener is executed");
		
			}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName() +"onTestSkipped--Listener is executed");
		
			}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
			}

	@Override
	public void onStart(ITestContext context) {
			}

	@Override
	public void onFinish(ITestContext context) {
			}

	
}

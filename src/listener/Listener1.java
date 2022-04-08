package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener1 implements ITestListener 
{
	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("TC is Starting",true);
		ITestListener.super.onTestStart(result);
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("TC is Success",true);
		ITestListener.super.onTestSuccess(result);
	}
	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("TC is Fail",true);
		ITestListener.super.onTestFailure(result);
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("TC is Skiped",true);
		ITestListener.super.onTestSkipped(result);
	}
}

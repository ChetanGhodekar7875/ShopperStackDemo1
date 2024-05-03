package Util;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import ProjectListners.TakeScreenShotOnFailure;

public class TestNgListeners implements ITestListener{

	public void onTestStart(ITestResult result) {
		Reporter.log("START ",true);
	}

	public void onTestSuccess(ITestResult result) {
		Reporter.log("SUCCESS " + result.getName(),true);
	}

	public void onTestFailure(ITestResult result) {
		Reporter.log("FAILED "+ result.getName(),true);
	}
	
	

}

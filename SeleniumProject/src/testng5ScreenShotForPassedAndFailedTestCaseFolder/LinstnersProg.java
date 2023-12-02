package testng5ScreenShotForPassedAndFailedTestCaseFolder;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class LinstnersProg extends LaunchAndQuite implements ITestListener{
	TakesScreenshot s1 = (TakesScreenshot) driver;
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
		Reporter.log("Test case execution started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		
//		WebDr?iver driver = (WebDriver) result.getTestContext().getAttribute("WebDriver");
//		TakesScreenshot s1 = (TakesScreenshot) driver;
		File source = s1.getScreenshotAs(OutputType.FILE);
		File destination = new File(
				"C:\\LaptopData\\GroTechMindClass\\SeleniumProject\\src\\testng5ScreenShotForPassedAndFailedTestCaseFolder\\passedScreenshot\\Passed" + Math.random() + ".png");
		try {
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Reporter.log("Test case execution passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		
//		WebDriver driver = (WebDriver) result.getTestContext().getAttribute("WebDriver");
		
		File source = s1.getScreenshotAs(OutputType.FILE);
		File destination = new File(
				"C:\\LaptopData\\GroTechMindClass\\SeleniumProject\\src\\testng5ScreenShotForPassedAndFailedTestCaseFolder\\FailedScreenshot\\Failed" + Math.random() + ".png");
		try {
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Reporter.log("Test case execution got failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
		Reporter.log("Test case execution got skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}

}

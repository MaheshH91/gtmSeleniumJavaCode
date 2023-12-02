package retryPackage;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {

	int count = 0;
	int retrynumber=3;
	
	@Override
	public boolean retry(ITestResult arg0) {
		if(retrynumber>count) {
			count++;
			return true;
		}
		
		return false;
	}

}

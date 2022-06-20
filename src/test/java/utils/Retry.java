package utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {

    int counter = 0;
    int retryLimit = 5;

    /**
     * interface from the testNG framework
     * @param result - describes the result of the test
     * @return true if the test method has to be retried
     */

    @Override
    public boolean retry(ITestResult result) {
        if (counter < retryLimit){
            counter++;
            return true;
        }
        return false;
    }
}

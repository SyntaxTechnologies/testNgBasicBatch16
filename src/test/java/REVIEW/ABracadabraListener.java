package REVIEW;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ABracadabraListener implements ITestListener {

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("test success"+result.getName());
    }
    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("  test failed "+result.getName());
    }

}

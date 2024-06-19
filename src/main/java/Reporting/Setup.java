package Reporting;

import com.aventstack.extentreports.ExtentReports;
import org.testng.ITestContext;
import org.testng.ITestListener;

public class Setup implements ITestListener {

    private static ExtentReports extentReports;

    public void onStart(ITestContext context) {
        String fileName = ExtentReportManager.getReportNameWithTimeStamp();
        String fullReportPath = System.getProperty("user.dir") + "\\Reports\\" + fileName;
        extentReports = ExtentReportManager.createInstance
                (fullReportPath,"Test API Automation Report", "Test Execution Report");
    }

    public void onFinish(ITestContext context) {
        if(extentReports != null)
            extentReports.flush();
    }
}

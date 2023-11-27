package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportUtil {
    private static ExtentReports extent;

    public static ExtentReports getInstance() {
        if (extent == null) {
            createReportInstance();
        }
        return extent;
    }

    private static void createReportInstance() {
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("test-output/extent-report.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
    }
}

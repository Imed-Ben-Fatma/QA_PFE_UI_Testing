package StepDefinitions;

import base.TestBase;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

    private static ExtentReports extent;
    private static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<>();

    @Before(order = 0)
    public void initializeExtentReports() {
        if (extent == null) {
            ExtentSparkReporter reporter = new ExtentSparkReporter("target/Reports/Report.html");
            reporter.config().setDocumentTitle("Test Execution Report");
            reporter.config().setReportName("Cucumber Automation Report");
            reporter.config().setTheme(com.aventstack.extentreports.reporter.configuration.Theme.DARK);

            extent = new ExtentReports();
            extent.attachReporter(reporter);
            extent.setSystemInfo("Environment", "QA");
            extent.setSystemInfo("Tester", "Imed Ben Fatma");
        }
    }

    @Before(order = 1)
    public void setUp(Scenario scenario) {
        // Initialize the WebDriver if not already done
        if (TestBase.getDriver() == null) {
            TestBase.setUp();
        }

        // Start Extent Test for the Scenario
        ExtentTest test = extent.createTest(scenario.getName());
        extentTest.set(test);
    }

    @After
    public void tearDown(Scenario scenario) {
        // Tear down the WebDriver
        TestBase.tearDown();
    }

    @After(order = 1)
    public void flushExtentReports() {
        if (extent != null) {
            extent.flush();
        }
    }

    // Getter for ExtentTest
    public static ExtentTest getExtentTest() {
        return extentTest.get();
    }
}

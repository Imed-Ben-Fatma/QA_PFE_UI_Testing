package StepDefinitions;

import base.TestBase;
import com.aventstack.extentreports.Status;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.logout;


public class LogoutStep extends TestBase {

    private final logout logoutPage;

    public LogoutStep(){
        // Initialize loginPage with the WebDriver managed by TestBase
        this.logoutPage = new logout(TestBase.getDriver());
    }

    @Given("the user is on the home page")
    public void userIsOnHomePage() {
        try {
            String title = logoutPage.getHomePageTitle();
            Assertions.assertTrue(title.contains("Home"),
                    "Expected failure message not found");
            Thread.sleep(200);
            Hooks.getExtentTest().log(Status.PASS, "the user is on the home page");
        } catch (Exception e) {
            logFailure("Failed to redirect the home page: "+e.getMessage());
        }
    }
    @When("the user clicks the account avatar")
    public void userClicksAvatarButton() {
        try {
            logoutPage.avatarBtn();
            Hooks.getExtentTest().log(Status.PASS, "clicks on the Avatar button");
            Thread.sleep(200);
        } catch (Exception e) {
            logFailure("Failed to click on the avatar button: "+e.getMessage());
        }
    }


    @When("the user clicks the logout button")
    public void userClicksLogoutButton() {
        try {
            logoutPage.logoutBtn();
            Hooks.getExtentTest().log(Status.PASS, "clicks on the logout button");
            Thread.sleep(200);
        } catch (Exception e) {
            logFailure("Failed to click on the logout button: "+e.getMessage());
        }
    }

    @Then("the user should be redirected to the login page")
    public void userRedirectedToLoginPage() {
        try {
            String title = logoutPage.getLoginPageTitle();
            Assertions.assertTrue(title.contains("Se connecter"),
                    "Expected failure message not found");
            Thread.sleep(200);
            Hooks.getExtentTest().log(Status.PASS, "success to redirect the login page");
        } catch (Throwable t) {
            logFailure("Failed to redirect the login page: " + t.getMessage());
        }
    }


    // Utility method to handle failures and log them in ExtentReports
// Utility method to handle failures and log them in ExtentReports
    private void logFailure(String message) {
        try {
            // Capture screenshot and get its path
            String screenshotPath = captureScreenshot("Step_Failure");

            // Log the failure message and attach the screenshot in the same line
            Hooks.getExtentTest()
                    .fail(message + "<br><a href='" + screenshotPath + "' target='_blank'><img src='" + screenshotPath + "' height='30%' /></a>");

        } catch (Exception ex) {
            // Handle cases where screenshot capture or logging fails
            Hooks.getExtentTest().fail("Failed to capture screenshot or log error: " + ex.getMessage());
        }
        throw new RuntimeException(); // Stop further execution and propagate the original exception
    }
}

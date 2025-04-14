package StepDefinitions;

import base.TestBase;
import com.aventstack.extentreports.Status;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.loginPage;


public class LoginStep extends TestBase {

    private loginPage loginPage;

    public LoginStep(){
        // Initialize loginPage with the WebDriver managed by TestBase
        this.loginPage = new loginPage(TestBase.getDriver());
    }

    @Given("the user is on the login page")
    public void userIsOnLoginPage() {
        try {
            loginPage.openLoginPage();
            Hooks.getExtentTest().log(Status.PASS, "the user is on the login page");
        } catch (Exception e) {
            logFailure("Failed to open the login page");
        }
    }

    @When("the user enters a email as {string}")
    public void userEntersEmail(String email) {
        try {
            loginPage.enterEmail(email);
            Hooks.getExtentTest().log(Status.PASS, "the user enters a email");
        } catch (Exception e) {
            logFailure("Failed to enter email");
        }
    }

    @When("the user enters a password as {string}")
    public void userEntersPassword(String password) {
        try {
            loginPage.enterPassword(password);
            Hooks.getExtentTest().log(Status.PASS, "the user enters a password");
        } catch (Exception e) {
            logFailure("Failed to enter password");
        }
    }

    @When("clicks on the login button")
    public void userClicksLoginButton() {
        try {
            loginPage.submitLogin();
            Hooks.getExtentTest().log(Status.PASS, "clicks on the login button");
        } catch (Exception e) {
            logFailure("Failed to click on the login button");
        }
    }

    @Then("the user should see a successful login message")
    public void userSeesSuccessfulLoginMessage() {
        try {
            String failureMessage = loginPage.getSuccessMessage();
            Assertions.assertTrue(failureMessage.contains("Succès! Connexion réussie!"),
                    "Expected failure message not found");
            Hooks.getExtentTest().log(Status.PASS, "success login ");
        } catch (Throwable t) {
            logFailure("Successful login message not displayed or incorrect");
        }
    }
    @Then("the user should see a login failure message")
    public void userSeesLoginFailureMessage() {
        try {
            String failureMessage = loginPage.getErrorMessage();
            Assertions.assertTrue(failureMessage.contains("Erreur! Nom d'utilisateur ou mot de passe incorrect."),
                    "Expected failure message not found");
            Hooks.getExtentTest().log(Status.PASS, "The user should see a login failure message: " + failureMessage);
        } catch (Throwable t) {
            logFailure("Error login message not displayed or incorrect");
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

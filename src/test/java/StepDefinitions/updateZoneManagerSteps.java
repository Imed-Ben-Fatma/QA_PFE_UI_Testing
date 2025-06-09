package StepDefinitions;

import base.TestBase;
import com.aventstack.extentreports.Status;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.zoneManager;


public class updateZoneManagerSteps extends TestBase {

    private zoneManager page;

    public updateZoneManagerSteps(){
        // Initialize loginPage with the WebDriver managed by TestBase
        this.page = new zoneManager(TestBase.getDriver());
    }


    @When("the user clicks on the update button for the zone manager")
    public void userEntersZoneManagerSection() {
        try {
            page.updateZoneManagerButton();
            Hooks.getExtentTest().log(Status.PASS, "User clicks on the update button for the zone manager");
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to click on the update button for the zone manager");
        }
    }

    @When("the user enters the new contract start date {string} for the zone manager")
    public void userEntersDateDebutContrat(String date) {
        try {
            page.enterDateDebutContrat(date);
            Hooks.getExtentTest().log(Status.PASS, "User enters date debut contrat: " + date);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to enter date debut contrat: "+e.getMessage());
        }
    }

    @When("the user enters the new contract end date {string} for the zone manager")
    public void userEntersDateFinContrat(String date) {
        try {
            page.enterDateFinContrat(date);
            Hooks.getExtentTest().log(Status.PASS, "User enters date fin contrat: " + date);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to enter date fin contrat: "+e.getMessage());
        }
    }

    @Then("the zone manager's contract is successfully updated")
    public void userSuccessMessage() {
        try {
            // L'attente est gérée dans getSuccessMessage(), le sleep n'est donc pas indispensable
            String successMessage = page.getSuccessUpdateMessage();
            Assertions.assertTrue(successMessage.contains("Le chef de zone a été mis à jour avec succès."),
                    "Expected success message not found. Actual message: " + successMessage);
            Hooks.getExtentTest().log(Status.PASS, "Zone manager updated successfully");
        } catch (Throwable t) {
            addFailure("Success message not displayed or incorrect / " + t.getMessage());
        }
    }

    @Then("the Zone manager should be updated unsuccessfully")
    public void unsuccessMessage() {
        try {
            // L'attente est gérée dans getSuccessMessage(), le sleep n'est donc pas indispensable
            boolean unsuccessCondition = page.unsuccessCobdition();
            Assertions.assertTrue(unsuccessCondition,
                    "Expected Failed cindition not found.");
            Hooks.getExtentTest().log(Status.PASS, "unsuccessfully updated zone manager " );
        } catch (Throwable t) {
            addFailure("Failed condition message not displayed or incorrect / " + t.getMessage());
        }
    }

    // Utility method to log failures and capture screenshots
    private void addFailure(String message) {
        try {
            String screenshotPath = captureScreenshot("Step_Failure");
            Hooks.getExtentTest()
                    .fail(message + "<br><a href='" + screenshotPath + "' target='_blank'><img src='" + screenshotPath + "' height='30%' /></a>");
        } catch (Exception ex) {
            Hooks.getExtentTest().fail("Failed to capture screenshot or log error: " + ex.getMessage());
        }
        throw new RuntimeException(message);
    }
}

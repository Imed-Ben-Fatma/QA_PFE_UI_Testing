package StepDefinitions;

import base.TestBase;
import com.aventstack.extentreports.Status;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.packQRcode;


public class addPackSteps extends TestBase {

    private packQRcode page;

    public addPackSteps(){
        // Initialize loginPage with the WebDriver managed by TestBase
        this.page = new packQRcode(TestBase.getDriver());
    }

    @When("the user clicks on the Packs section button")
    public void userClickPackAndQrCodesButton() {
        try {
            page.PackSectionButton();
            Hooks.getExtentTest().log(Status.PASS, "User clicks on Pack & QR Codes");
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to click on Pack & QR Codes button: "+e.getMessage());
        }
    }


    @When("the user clicks on the \"Add Packs\" button")
    public void userClickAddPacks() {
        try {
            page.addPackButton();
            Hooks.getExtentTest().log(Status.PASS, "User clicks on add packs button");
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to click on add packs button: "+e.getMessage());
        }
    }


    @When("the user enters the number of packs as {string}")
    public void userEntersNumberOfPacks(String numberOfPacks) {
        try {
            page.enterNumberPacks(numberOfPacks);
            Hooks.getExtentTest().log(Status.PASS, "User enters number of packs: "+numberOfPacks);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to enters number of packs:"+e.getMessage());
        }
    }

    @When("the user enters the number of QR codes per pack as {string}")
    public void userEntersNumberOfQRCodes(String numberOfQRCodes) {
        try {

            page.enterNumberQRcodeOfPacks(numberOfQRCodes);
            Hooks.getExtentTest().log(Status.PASS, "User enters number of QR codes: " + numberOfQRCodes);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to enters number of QR codes: "+e.getMessage());
        }
    }

    @When("the user clicks on the \"Save Packs\" button")
    public void userClicksOnAddbutton() {
        try {
            page.enregistrerButton();
            Hooks.getExtentTest().log(Status.PASS, "User clicks on enregistrer button");
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to click on enregistrer button: "+e.getMessage());
        }
    }

    @Then("the packs should be added successfully")
    public void successMessage() {
        try {
            // L'attente est gérée dans getSuccessMessage(), le sleep n'est donc pas indispensable
            String successMessage = page.getSuccessMessage();
            Assertions.assertTrue(successMessage.contains("Le pack a été ajouté avec succès."),
                    "Expected success message not found. Actual message: " + successMessage);
            Hooks.getExtentTest().log(Status.PASS, "Packs created successfully: " + successMessage);
        } catch (Throwable t) {
            addFailure("Success message not displayed or incorrect / " + t.getMessage());
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

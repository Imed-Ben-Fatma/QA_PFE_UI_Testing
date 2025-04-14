package StepDefinitions;

import base.TestBase;
import com.aventstack.extentreports.Status;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;


public class addDiscountSteps extends TestBase {

    private pages.addDiscount page;

    public addDiscountSteps(){
        // Initialize loginPage with the WebDriver managed by TestBase
        this.page = new pages.addDiscount(TestBase.getDriver());
    }

    @When("the user clicks on Remise&Offer")
    public void userClickRemiseAndOffer() {
        try {
            page.remiseAndOfferButton();
            Hooks.getExtentTest().log(Status.PASS, "User clicks on Remise&Offer");
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to click on Remise&Offer button: "+e.getMessage());
        }
    }


    @When("the user clicks on Discount")
    public void userEntersDiscountSection() {
        try {
            page.discountSectionButton();
            Hooks.getExtentTest().log(Status.PASS, "User clicks on remise section");
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to click on remise section button: "+e.getMessage());
        }
    }

    @When("the user clicks on ajoute remise button")
    public void userClickOnAjouteButton() {
        try {
            page.addDiscountButton();
            Hooks.getExtentTest().log(Status.PASS, "User clicks on ajoute button");
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to click on ajoute button: "+e.getMessage());
        }
    }

    @When("the user selects mode de selection {int}")
    public void userClicksOnSlectionMode(int mode) {
        try {
            page.enterSelectionMode(mode);
            Hooks.getExtentTest().log(Status.PASS, "User selects mode de selection with index");
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to click on mode de selection:"+e.getMessage());
        }
    }

    @When("the user selects partenaire associé {int}")
    public void userSelectsPartenaire(int index) {
        try {
            page.enterSelectionPartnerAssocie(index);
            Hooks.getExtentTest().log(Status.PASS, "User selects partenaire associé with index: " + index);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to select partenaire associé: "+e.getMessage());
        }
    }

    @When("the user enters Titre de remise {string}")
    public void userEntersDiscountTitle(String titre) {
        try {
            page.enterTitle(titre);
            Hooks.getExtentTest().log(Status.PASS, "User enters titre: " + titre);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to enter titre: "+e.getMessage());
        }
    }

    @When("the user enters Taux de remise {string}")
    public void userEntersTauxDiscount(String taux) {
        try {
            page.enterTauxDiscount(taux);
            Hooks.getExtentTest().log(Status.PASS, "User enters Taux de remise: " + taux);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to enter Taux de remise: "+e.getMessage());
        }
    }

    @When("the user enters Description {string}")
    public void userEntersDescription(String description) {
        try {
            page.enterDescription(description);
            Hooks.getExtentTest().log(Status.PASS, "User enters description: " + description);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to enter description: "+e.getMessage());
        }
    }

    @When("the user selects Type de remise {int}")
    public void userSelectsDiscountType(int index) {
        try {
            page.enterDiscountType(index);
            Hooks.getExtentTest().log(Status.PASS, "User selects type de remise with index: " + index);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to select type de remise: "+e.getMessage());
        }
    }

    @When("the user enters date debut {string}")
    public void userEntersStartDate(String date) {
        try {
            page.enterStartDate(date);
            Hooks.getExtentTest().log(Status.PASS, "User enters date de debut: " + date);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to enter phone number: "+e.getMessage());
        }
    }
    @When("the user clicks on enregistrer remise button")
    public void userClicksOnAddbutton() {
        try {
            page.enregistrerButton();
            Hooks.getExtentTest().log(Status.PASS, "User clicks on enregistrer button");
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to click on enregistrer button: "+e.getMessage());
        }
    }

    @Then("le remise est ajouté avec succès")
    public void successMessage() {
        try {
            // L'attente est gérée dans getSuccessMessage(), le sleep n'est donc pas indispensable
            String successMessage = page.getSuccessMessage();
            Assertions.assertTrue(successMessage.contains("La remise a été ajoutée avec succès."),
                    "Expected success message not found. Actual message: " + successMessage);
            Hooks.getExtentTest().log(Status.PASS, "Zone manager created successfully: " + successMessage);
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

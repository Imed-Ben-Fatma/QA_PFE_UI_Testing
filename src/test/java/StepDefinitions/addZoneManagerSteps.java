package StepDefinitions;

import base.TestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.loginPage;
import com.aventstack.extentreports.Status;


public class addZoneManagerSteps extends TestBase {

    private pages.addZoneManager page;

    public addZoneManagerSteps(){
        // Initialize loginPage with the WebDriver managed by TestBase
        this.page = new pages.addZoneManager(TestBase.getDriver());
    }


    @When("the user clicks on chef de zone")
    public void userEntersZoneManagerSection() {
        try {
            page.zoneManagerButton();
            Hooks.getExtentTest().log(Status.PASS, "User clicks on chef de zone");
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to click on the chef de zone button");
        }
    }

    @When("the user clicks on ajoute button")
    public void userClickOnAjouteButton() {
        try {
            page.addZoneManagerButton();
            Hooks.getExtentTest().log(Status.PASS, "User clicks on ajoute button");
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to click on ajoute button");
        }
    }

    /* Photo Section
    @When("the user clicks on photo section")
    public void userClicksOnPhotoSection() {
        try {
            page.photoSectionButton();
            Hooks.getExtentTest().log(Status.PASS, "User clicks on photo section");
        } catch (Exception e) {
            addFailure("Failed to click on photo section");
        }
    }
*/
    // Information Section
    @When("the user clicks on information section")
    public void userClicksOnInformationSection() {
        try {
            page.InformationSectionButton();
            Hooks.getExtentTest().log(Status.PASS, "User clicks on information section");
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to click on information section:"+e.getMessage());
        }
    }

    @When("the user selects status {int}")
    public void userSelectsStatus(int index) {
        try {
            page.enterSatus(index);
            Hooks.getExtentTest().log(Status.PASS, "User selects status with index: " + index);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to select status: "+e.getMessage());
        }
    }

    @When("the user enters nom {string}")
    public void userEntersNom(String nom) {
        try {
            page.enterNom(nom);
            Hooks.getExtentTest().log(Status.PASS, "User enters nom: " + nom);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to enter nom: "+e.getMessage());
        }
    }

    @When("the user enters prenom {string}")
    public void userEntersPrenom(String prenom) {
        try {
            page.enterPrenom(prenom);
            Hooks.getExtentTest().log(Status.PASS, "User enters prenom: " + prenom);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to enter prenom: "+e.getMessage());
        }
    }

    @When("the user enters date de naissance {string}")
    public void userEntersDateNaissance(String date) {
        try {
            page.enterDateNaissance(date);
            Hooks.getExtentTest().log(Status.PASS, "User enters date de naissance: " + date);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to enter date de naissance: "+e.getMessage());
        }
    }

    @When("the user selects sexe {int}")
    public void userSelectsSexe(int index) {
        try {
            page.enterSexe(index);
            Hooks.getExtentTest().log(Status.PASS, "User selects sexe with index: " + index);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to select sexe: "+e.getMessage());
        }
    }

    @When("the user enters phone number {string}")
    public void userEntersPhoneNumber(String phoneNumber) {
        try {
            page.enterPhoneNumber(phoneNumber);
            Hooks.getExtentTest().log(Status.PASS, "User enters phone number: " + phoneNumber);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to enter phone number: "+e.getMessage());
        }
    }

    @When("the user enters email {string}")
    public void userEntersEmail(String email) {
        try {
            page.enterEmail(email);
            Hooks.getExtentTest().log(Status.PASS, "User enters email: " + email);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to enter email: "+e.getMessage());
        }
    }

    // Address Section
    @When("the user clicks on address section")
    public void userClicksOnAddressSection() {
        try {
            page.adressButton();
            Hooks.getExtentTest().log(Status.PASS, "User clicks on address section");
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to click on address section: "+e.getMessage());
        }
    }

    @When("the user selects governorate {int}")
    public void userSelectsGovernorate(int index) {
        try {
            page.enterGovernorate(index);
            Hooks.getExtentTest().log(Status.PASS, "User selects governorate with index: " + index);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to select governorate: "+e.getMessage());
        }
    }

    @When("the user selects ville {int}")
    public void userSelectsVille(int index) {
        try {
            page.enterVille(index);
            Hooks.getExtentTest().log(Status.PASS, "User selects ville with index: " + index);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to select ville: "+e.getMessage());
        }
    }

    @When("the user enters adresse {string}")
    public void userEntersAdresse(String adresse) {
        try {
            page.enterAdresse(adresse);
            Hooks.getExtentTest().log(Status.PASS, "User enters adresse: " + adresse);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to enter adresse: "+e.getMessage());
        }
    }

    @When("the user enters GPS coordinates {string}")
    public void userEntersGPS(String gps) {
        try {
            page.enterGPS(gps);
            Hooks.getExtentTest().log(Status.PASS, "User enters GPS coordinates: " + gps);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to enter GPS coordinates: "+e.getMessage());
        }
    }

    // Contact and Details Section
    @When("the user clicks on contact and details section")
    public void userClicksOnContactAndDetailsSection() {
        try {
            page.contactAndDetailesButton();
            Hooks.getExtentTest().log(Status.PASS, "User clicks on contact and details section");
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to click on contact and details section: "+e.getMessage());
        }
    }

    @When("the user enters date debut contrat {string}")
    public void userEntersDateDebutContrat(String date) {
        try {
            page.enterDateDebutContrat(date);
            Hooks.getExtentTest().log(Status.PASS, "User enters date debut contrat: " + date);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to enter date debut contrat: "+e.getMessage());
        }
    }

    @When("the user enters date fin contrat {string}")
    public void userEntersDateFinContrat(String date) {
        try {
            page.enterDateFinContrat(date);
            Hooks.getExtentTest().log(Status.PASS, "User enters date fin contrat: " + date);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to enter date fin contrat: "+e.getMessage());
        }
    }

    @When("the user uploads contrat PDF")
    public void userUploadsContratPDF() {
        try {
            page.enterContratPDF();
            Hooks.getExtentTest().log(Status.PASS, "User uploads contrat PDF");
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to upload contrat PDF: "+e.getMessage());
        }
    }

    @When("the user clicks on enregistrer button")
    public void userClicksOnEnregistrerButton() {
        try {
            page.enregistrerButton();
            Hooks.getExtentTest().log(Status.PASS, "User clicks on enregistrer button");
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to click on enregistrer button: "+e.getMessage());
        }
    }

    @When("the user clicks on annuler button")
    public void userClicksOnAnnulerButton() {
        try {
            page.annulerButton();
            Hooks.getExtentTest().log(Status.PASS, "User clicks on annuler button");
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to click on annuler button: "+e.getMessage());
        }
    }
  /*  @Then("le chef de zone est ajouté avec succès")
    public void userSeesLoginFailureMessage() {

        try {
            Thread.sleep(800);
            String failureMessage = page.getSuccessMessage();
            Assertions.assertTrue(failureMessage.contains("Le chef de zone a été ajouté avec succès."),
                    "Expected failure message not found");
            Hooks.getExtentTest().log(Status.PASS, "Zone manager created ");
        } catch (Throwable t) {
            addFailure("created message not displayed or incorrect / "+t.getMessage());
        }

    }*/

    @Then("le chef de zone est ajouté avec succès")
    public void userSuccessMessage() {
        try {
            // L'attente est gérée dans getSuccessMessage(), le sleep n'est donc pas indispensable
            String successMessage = page.getSuccessMessage();
            Assertions.assertTrue(successMessage.contains("Le chef de zone a été ajouté avec succès."),
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

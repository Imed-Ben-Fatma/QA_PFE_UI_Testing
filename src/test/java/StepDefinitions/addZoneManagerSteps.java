package StepDefinitions;

import base.TestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import com.aventstack.extentreports.Status;
import pages.zoneManager;


public class addZoneManagerSteps extends TestBase {

    private final zoneManager page;

    public addZoneManagerSteps(){
        // Initialize loginPage with the WebDriver managed by TestBase
        this.page = new zoneManager(TestBase.getDriver());
    }


    @When("the user navigates to the Zone Manager section")
    public void userEntersZoneManagerSection() {
        try {
            page.zoneManagerButton();
            Hooks.getExtentTest().log(Status.PASS, "User clicks on chef de zone");
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to click on the chef de zone button");
        }
    }

    @When("clicks the \"Add\" button")
    public void userClickOnAjouteButton() {
        try {
            page.addZoneManagerButton();
            Hooks.getExtentTest().log(Status.PASS, "User clicks on ajoute button");
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to click on ajoute button");
        }
    }

    // Photo Section
    @When("selects the \"Photos\" section")
    public void userClicksOnPhotoSection() {
        try {
            page.photoSectionButton();
            Hooks.getExtentTest().log(Status.PASS, "User clicks on photo section");
        } catch (Exception e) {
            addFailure("Failed to click on photo section");
        }
    }

    @When("upload the profile photo of zone manager {string}")
    public void userUploadProfilePhoto(String profilePhoto) {
        try {
           // page.enterProfilePhoto();
            page.uploadProfilePhoto(profilePhoto);
            Hooks.getExtentTest().log(Status.PASS, "User upload profile photo");
        } catch (Exception e) {
            addFailure("Failed to upload profile photo: "+ e.getMessage() );
        }
    }

    @When("upload the cover photo of zone manager {string}")
    public void userUploadCoverPhoto(String coverPhoto) {
        try {
            page.enterCoverPhoto(coverPhoto);
            Hooks.getExtentTest().log(Status.PASS, "User upload cover photo");
        } catch (Exception e) {
            addFailure("Failed to upload cover photo");
        }
    }


    // Information Section
    @When("selects the \"Information\" section")
    public void userClicksOnInformationSection() {
        try {
            page.InformationSectionButton();
            Hooks.getExtentTest().log(Status.PASS, "User clicks on information section");
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to click on information section:"+e.getMessage());
        }
    }

    @When("selects status {int}")
    public void userSelectsStatus(int index) {
        try {
            page.enterSatus(index);
            Hooks.getExtentTest().log(Status.PASS, "User selects status with index: " + index);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to select status: "+e.getMessage());
        }
    }

    @When("enters the last name {string}")
    public void userEntersNom(String nom) {
        try {
            page.enterNom(nom);
            Hooks.getExtentTest().log(Status.PASS, "User enters nom: " + nom);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to enter nom: "+e.getMessage());
        }
    }

    @When("enters the first name {string}")
    public void userEntersPrenom(String prenom) {
        try {
            page.enterPrenom(prenom);
            Hooks.getExtentTest().log(Status.PASS, "User enters prenom: " + prenom);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to enter prenom: "+e.getMessage());
        }
    }

    @When("enters the date of birth {string}")
    public void userEntersDateNaissance(String date) {
        try {
            page.enterDateNaissance(date);
            Hooks.getExtentTest().log(Status.PASS, "User enters date de naissance: " + date);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to enter date de naissance: "+e.getMessage());
        }
    }

    @When("selects gender {int}")
    public void userSelectsSexe(int index) {
        try {
            page.enterSexe(index);
            Hooks.getExtentTest().log(Status.PASS, "User selects sexe with index: " + index);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to select sexe: "+e.getMessage());
        }
    }

    @When("enters the phone number {string}")
    public void userEntersPhoneNumber(String phoneNumber) {
        try {
            page.enterPhoneNumber(phoneNumber);
            Hooks.getExtentTest().log(Status.PASS, "User enters phone number: " + phoneNumber);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to enter phone number: "+e.getMessage());
        }
    }

    @When("enters the email {string}")
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
    @When("proceeds to the \"Address\" section")
    public void userClicksOnAddressSection() {
        try {
            page.adressButton();
            Hooks.getExtentTest().log(Status.PASS, "User clicks on address section");
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to click on address section: "+e.getMessage());
        }
    }

    @When("selects governorate {int}")
    public void userSelectsGovernorate(int index) {
        try {
            page.enterGovernorate(index);
            Hooks.getExtentTest().log(Status.PASS, "User selects governorate with index: " + index);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to select governorate: "+e.getMessage());
        }
    }

    @When("selects city {int}")
    public void userSelectsVille(int index) {
        try {
            page.enterVille(index);
            Hooks.getExtentTest().log(Status.PASS, "User selects ville with index: " + index);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to select ville: "+e.getMessage());
        }
    }

    @When("enters the address {string}")
    public void userEntersAdresse(String adresse) {
        try {
            page.enterAdresse(adresse);
            Hooks.getExtentTest().log(Status.PASS, "User enters adresse: " + adresse);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to enter adresse: "+e.getMessage());
        }
    }

    @When("inputs GPS coordinates {string}")
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
    @When("moves to the \"Contact and Details\" section")
    public void userClicksOnContactAndDetailsSection() {
        try {
            page.contactAndDetailesButton();
            Hooks.getExtentTest().log(Status.PASS, "User clicks on contact and details section");
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to click on contact and details section: "+e.getMessage());
        }
    }

    @When("sets the contract start date to {string}")
    public void userEntersDateDebutContrat(String date) {
        try {
            page.enterDateDebutContrat(date);
            Hooks.getExtentTest().log(Status.PASS, "User enters date debut contrat: " + date);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to enter date debut contrat: "+e.getMessage());
        }
    }

    @When("sets the contract end date to {string}")
    public void userEntersDateFinContrat(String date) {
        try {
            page.enterDateFinContrat(date);
            Hooks.getExtentTest().log(Status.PASS, "User enters date fin contrat: " + date);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to enter date fin contrat: "+e.getMessage());
        }
    }

    @When("upload the contract PDF file {string}")
    public void userUploadsContratPDF(String fileName) {
        try {
            page.enterContratPDF(fileName);
            Hooks.getExtentTest().log(Status.PASS, "User upload contrat PDF");
            Thread.sleep(1000);
        } catch (Exception e) {
            addFailure("Failed to upload contrat PDF: "+e.getMessage());
        }
    }

    @When("clicks the \"Save\" button")
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

    @Then("the zone manager is successfully added")
    public void successMessage() {
        try {
            // L'attente est gérée dans getSuccessMessage(), le sleep n'est donc pas indispensable
            Thread.sleep(200);
            String successMessage = page.getSuccessMessage();
            Assertions.assertTrue(successMessage.contains("Le chef de zone a été ajouté avec succès."),
                    "Expected success message not found. Actual message: " + successMessage);
            Hooks.getExtentTest().log(Status.PASS, "Zone manager created successfully: " + successMessage);
        } catch (Throwable t) {
            addFailure("Success message not displayed or incorrect / " + t.getMessage());
        }
    }

    @Then("an error message \"Email already exists\" is displayed, and the zone manager is not added")
    public void filedMessage() {
        try {
            // L'attente est gérée dans getSuccessMessage(), le sleep n'est donc pas indispensable
            String filedMessage = page.getFiledMessage();
            Assertions.assertTrue(filedMessage.contains("Cette adresse email est déjà utilisée."),
                    "Expected success message not found. Actual message: " + filedMessage);
            Hooks.getExtentTest().log(Status.PASS, "failed to create Zone manager: "+filedMessage);
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

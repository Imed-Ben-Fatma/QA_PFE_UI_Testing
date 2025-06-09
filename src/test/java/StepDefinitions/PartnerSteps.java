package StepDefinitions;

import base.TestBase;
import com.aventstack.extentreports.Status;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.partner;



public class PartnerSteps extends TestBase {

    private final partner page;

    public PartnerSteps(){
        // Initialize loginPage with the WebDriver managed by TestBase
        this.page = new partner(TestBase.getDriver());
    }


    @When("the user navigates to the partner And Announcer section")
    public void userPartnerAndAnnouncerSection() {
        try {
            page.partnerAndAnnouncerSectionButton();
            Hooks.getExtentTest().log(Status.PASS, "User clicks on partner And Announcer section button");
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to click on the partner And Announcer section button");
        }
    }


    @When("the user navigates to the partner section")
    public void userEntersPartnerSection() {
        try {
            page.partnerSectionButton();
            Hooks.getExtentTest().log(Status.PASS, "User clicks on partner section button");
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to click on the partner section button");
        }
    }

    @When("clicks the \"Add\" button of partner")
    public void userClickOnAjouteButton() {
        try {
            page.addPartnerButton();
            Hooks.getExtentTest().log(Status.PASS, "User clicks on add button");
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to click on add button");
        }
    }

  // Information Section
    @When("selects the \"Information\" section of partner")
    public void userClicksOnInformationSection() {
        try {
            page.InformationSectionButton();
            Hooks.getExtentTest().log(Status.PASS, "User clicks on information section");
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to click on information section:"+e.getMessage());
        }
    }

    @When("enters the Project Name of partner {string}")
    public void userEntersProjectName(String nom) {
        try {
            page.enterNomProjet(nom);
            Hooks.getExtentTest().log(Status.PASS, "User enters Project Name: " + nom);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to enter Project Name: "+e.getMessage());
        }
    }
    @When("selects Partner Announcer or no {int}")
    public void userSelectsAnnouncerOrNo(int index) {
        try {
            page.enterAnnouncer(index);
            Hooks.getExtentTest().log(Status.PASS, "User selects Announcer or no: " + index);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to select Announcer or no: "+e.getMessage());
        }
    }
    @When("enters the description of partner {string}")
    public void userEntersDescription(String description) {
        try {
            page.enterDescription(description);
            Hooks.getExtentTest().log(Status.PASS, "User enters description: ");
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to enter description: "+e.getMessage());
        }
    }

    @When("enters the Company Name of partner {string}")
    public void userEntersCompanyName(String name) {
        try {
            page.enterNomSociete(name);
            Hooks.getExtentTest().log(Status.PASS, "User enters Company Name: " + name);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to enter Company Name: "+e.getMessage());
        }
    }

    @When("enters the phone number of partner {string}")
    public void userPhoneNumber(String phone) {
        try {
            page.enterTelNum(phone);
            Hooks.getExtentTest().log(Status.PASS, "User enters phone number: " + phone);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to enter phone number: "+e.getMessage());
        }
    }

    @When("selects Project Category of partner {int}")
    public void userSelectsProjectCategory(int index) {
        try {
            page.enterCategoieProjet(index);
            Hooks.getExtentTest().log(Status.PASS, "User selects Project Category with index: " + index);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to select Project Category: "+e.getMessage());
        }
    }

    @When("selects Account Status of partner {int}")
    public void userSelectsAccountStatus(int index) {
        try {
            page.enterStatutCompte(index);
            Hooks.getExtentTest().log(Status.PASS, "User selects Account Status with index: " + index);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to select Account Status: "+e.getMessage());
        }
    }

    @When("selects Project type brand of partner {int}")
    public void userSelectsTypeBrand(int index) {
        try {
            page.enterMarqueType(index);
            Hooks.getExtentTest().log(Status.PASS, "User selects type brand of partner with index: " + index);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to select type brand of partner: "+e.getMessage());
        }
    }

    @When("selects Project type of partner {int}")
    public void userSelectsTypePartner(int index) {
        try {
            page.enterPartnerType(index);
            Hooks.getExtentTest().log(Status.PASS, "User selects type of partner with index: " + index);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to select type of partner: "+e.getMessage());
        }
    }
    @When("enters the responsible first name of partner {string}")
    public void userEntersResponsibleFirstName(String name) {
        try {
            page.enterNomResponsable(name);
            Hooks.getExtentTest().log(Status.PASS, "User enters responsible first name: " + name);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to enter responsible first name: "+e.getMessage());
        }
    }

    @When("enters the responsible last name of partner {string}")
    public void userEntersResponsibleLastName(String name) {
        try {
            page.enterPrenomResponsable(name);
            Hooks.getExtentTest().log(Status.PASS, "User enters responsible last name: " + name);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to enter responsible last name: "+e.getMessage());
        }
    }

    @When("enters the responsible phone number of partner {string}")
    public void userEntersResponsiblePhoneNumber(String phone) {
        try {
            page.enterTelNumResponsable(phone);
            Hooks.getExtentTest().log(Status.PASS, "User enters responsible phone number: " + phone);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to enter responsible phone number: "+e.getMessage());
        }
    }

    @When("enters the email of partner {string}")
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
    @When("selects the \"Coordonnees\" section of partner")
    public void userClicksOnCoordonneesSection() {
        try {
            page.coordonneesButton();
            Hooks.getExtentTest().log(Status.PASS, "User clicks on Coordonnees section");
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to click on Coordonnees section: "+e.getMessage());
        }
    }

    @When("enters the Website of partner {string}")
    public void userEntersWebsite(String link) {
        try {
            page.enterSiteWeb(link);
            Hooks.getExtentTest().log(Status.PASS, "User enters WebSite of partner: " + link);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to enter WebSite of partner: "+e.getMessage());
        }
    }

    @When("enters the facebook of partner {string}")
    public void userEntersFacebook(String link) {
        try {
            page.enterFacebook(link);
            Hooks.getExtentTest().log(Status.PASS, "User enters facebook of partner: " + link);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to enter facebook of partner: "+e.getMessage());
        }
    }

    @When("enters the instagram of partner {string}")
    public void userEntersInstagram(String link) {
        try {
            page.enterInstagram(link);
            Hooks.getExtentTest().log(Status.PASS, "User enters instagram of partner: " + link);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to enter instagram of partner: "+e.getMessage());
        }
    }

    @When("enters the LinkedIn of partner {string}")
    public void userEntersLinkedIn(String link) {
        try {
            page.enterLinkedIn(link);
            Hooks.getExtentTest().log(Status.PASS, "User enters LinkedIn of partner: " + link);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to enter LinkedIn of partner: "+e.getMessage());
        }
    }


    @When("selects governorate of partner {int}")
    public void userSelectsGovernorate(int index) {
        try {
            page.enterGovernorate(index);
            Hooks.getExtentTest().log(Status.PASS, "User selects governorate with index: " + index);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to select governorate: "+e.getMessage());
        }
    }

    @When("selects city of partner {int}")
    public void userSelectsVille(int index) {
        try {
            page.enterVille(index);
            Hooks.getExtentTest().log(Status.PASS, "User selects ville with index: " + index);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to select ville: "+e.getMessage());
        }
    }

    @When("enters the address of partner {string}")
    public void userEntersAdresse(String adresse) {
        try {
            page.enterAdresse(adresse);
            Hooks.getExtentTest().log(Status.PASS, "User enters adresse: " + adresse);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to enter adresse: "+e.getMessage());
        }
    }

    @When("inputs GPS coordinates of partner {string}")
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
    @When("moves to the \"Contact and Details\" section of partner")
    public void userClicksOnContactAndDetailsSection() {
        try {
            page.contactAndDetailesButton();
            Hooks.getExtentTest().log(Status.PASS, "User clicks on contact and details section");
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to click on contact and details section: "+e.getMessage());
        }
    }

    @When("sets the contract start date of partner {string}")
    public void userEntersDateDebutContrat(String date) {
        try {
            page.enterDateDebutContrat(date);
            Hooks.getExtentTest().log(Status.PASS, "User enters date debut contrat: " + date);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to enter date debut contrat: "+e.getMessage());
        }
    }


    @When("sets the contract end date of partner {string}")
    public void userEntersDateFinContrat(String date) {
        try {
            page.enterDateFinContrat(date);
            Hooks.getExtentTest().log(Status.PASS, "User enters date fin contrat: " + date);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to enter date fin contrat: "+e.getMessage());
        }
    }
    @When("selects Cumulative Discounts ok")
    public void userClicksselectsCumulativeDiscountsOk() {
        try {
            page.checkBoxOuiCumulativeDiscounts();
            Hooks.getExtentTest().log(Status.PASS, "User clicks on Cumulative Discounts Ok");
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to click on Cumulative Discounts Ok: " + e.getMessage());
        }
    }

    @When("upload the contract PDF file or partner {string}")
    public void userUploadsContratPDF(String fileName) {
        try {
            page.enterContratPDF(fileName);
            Hooks.getExtentTest().log(Status.PASS, "User uploads contrat PDF");
            Thread.sleep(1000);
        } catch (Exception e) {
            addFailure("Failed to upload contrat PDF: "+e.getMessage());
        }
    }

    @When("selects Tax identification type of partner {int}")
    public void userSelectsTaxType(int index) {
        try {
            page.enterTypeIdFiscale(index);
            Hooks.getExtentTest().log(Status.PASS, "User selects Tax identification type with index: " + index);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to Tax identification type: "+e.getMessage());
        }
    }

    @When("enters the Tax identification number of partner {string}")
    public void userEntersTaxNumber(String number) {
        try {
            page.enterNumberIdFiscale(number);
            Hooks.getExtentTest().log(Status.PASS, "User enters Tax identification number: " + number);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to enter Tax identification number: "+e.getMessage());
        }
    }

    @When("selects Vehicle 1 Type of partner {int}")
    public void userSelectsVehicleType1(int index) {
        try {
            page.enterTypeVechile1(index);
            Hooks.getExtentTest().log(Status.PASS, "User selects Vehicle 1 Type with index: " + index);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to Vehicle 1 Type: "+e.getMessage());
        }
    }


    @When("selects Vehicle 1 brand of partner {int}")
    public void userSelectsVehicleBrand1(int index) {
        try {
            page.enterMarqueVechile1(index);
            Hooks.getExtentTest().log(Status.PASS, "User selects Vehicle 1 brand with index: " + index);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to Vehicle 1 Brand: "+e.getMessage());
        }
    }

    @When("clicks the \"add Vehicle\" button")
    public void userClicksOnAddVehicleButton() {
        try {
            page.addVechileButton();
            Hooks.getExtentTest().log(Status.PASS, "User clicks on add Vehicle button");
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to click on add Vehicle button: "+e.getMessage());
        }
    }

    @When("selects Vehicle 2 Type of partner {int}")
    public void userSelectsVehicleType2(int index) {
        try {
            page.enterTypeVechile2(index);
            Hooks.getExtentTest().log(Status.PASS, "User selects Vehicle 2 Type with index: " + index);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to Vehicle 2 Type: "+e.getMessage());
        }
    }


    @When("selects Vehicle 2 brand of partner {int}")
    public void userSelectsVehicleBrand2(int index) {
        try {
            page.enterMarqueVechile2(index);
            Hooks.getExtentTest().log(Status.PASS, "User selects Vehicle 2 brand with index: " + index);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to Vehicle 2 Brand: "+e.getMessage());
        }
    }
        //----------------day1-------------------
        @When("selects Working Day 1 of partner {int}")
        public void userSelectsWorkingDay1(int index) {
            try {
                page.enterjour1(index);
                Hooks.getExtentTest().log(Status.PASS, "User selects Working Day 1 with index: " + index);
                Thread.sleep(200);
            } catch (Exception e) {
                addFailure("Failed to Working Day 1: "+e.getMessage());
            }
        }

        @When("enters the start Hour day 1 of partner {string}")
        public void userEntersStartHourDay1(String hour) {
            try {
                page.enterOuvertureHeureJour1(hour);
                Hooks.getExtentTest().log(Status.PASS, "User enters Hour: " + hour);
                Thread.sleep(200);
            } catch (Exception e) {
                addFailure("Failed to enter Hour: "+e.getMessage());
            }
        }

        @When("enters the start Min day 1 of partner {string}")
        public void userEntersStartMinDay1(String min) {
            try {
                page.enterOuvertureMinJour1(min);
                Hooks.getExtentTest().log(Status.PASS, "User enters Min: " + min);
                Thread.sleep(200);
            } catch (Exception e) {
                addFailure("Failed to enter Min: "+e.getMessage());
            }
        }

        @When("enters the end Hour day 1 of partner {string}")
        public void userEntersEndHourDay1(String hour) {
            try {
                page.enterFermetureHeureJour1(hour);
                Hooks.getExtentTest().log(Status.PASS, "User enters Hour: " + hour);
                Thread.sleep(200);
            } catch (Exception e) {
                addFailure("Failed to enter Hour: "+e.getMessage());
            }
        }

        @When("enters the end Min day 1 of partner {string}")
        public void userEntersEndMinDay1(String min) {
            try {
                page.enterFermetureMinJour1(min);
                Hooks.getExtentTest().log(Status.PASS, "User enters Min: " + min);
                Thread.sleep(200);
            } catch (Exception e) {
                addFailure("Failed to enter Min: "+e.getMessage());
            }
        }
    //----------------day2-------------------
    @When("clicks the \"add day\" button")
    public void userClicksOnAddDayButton() {
        try {
            page.addJourButton();
            Hooks.getExtentTest().log(Status.PASS, "User clicks on add Day button");
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to click on add day button: "+e.getMessage());
        }
    }

    @When("selects Working Day 2 of partner {int}")
    public void userSelectsWorkingDay2(int index) {
        try {
            page.enterjour2(index);
            Hooks.getExtentTest().log(Status.PASS, "User selects Working Day 2 with index: " + index);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to Working Day 1: "+e.getMessage());
        }
    }

    @When("enters the start Hour day 2 of partner {string}")
    public void userEntersStartHourDay2(String hour) {
        try {
            page.enterOuvertureHeureJour2(hour);
            Hooks.getExtentTest().log(Status.PASS, "User enters Hour: " + hour);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to enter Hour: "+e.getMessage());
        }
    }

    @When("enters the start Min day 2 of partner {string}")
    public void userEntersStartMinDay2(String min) {
        try {
            page.enterOuvertureMinJour2(min);
            Hooks.getExtentTest().log(Status.PASS, "User enters Min: " + min);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to enter Min: "+e.getMessage());
        }
    }

    @When("enters the end Hour day 2 of partner {string}")
    public void userEntersEndHourDay2(String hour) {
        try {
            page.enterFermetureHeureJour2(hour);
            Hooks.getExtentTest().log(Status.PASS, "User enters Hour: " + hour);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to enter Hour: "+e.getMessage());
        }
    }

    @When("enters the end Min day 2 of partner {string}")
    public void userEntersEndMinDay2(String min) {
        try {
            page.enterFermetureMinJour2(min);
            Hooks.getExtentTest().log(Status.PASS, "User enters Min: " + min);
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to enter Min: "+e.getMessage());
        }
    }

    @When("clicks the \"Save\" button of partner")
    public void userClicksOnEnregistrerButton() {
        try {
            page.enregistrerButton();
            Hooks.getExtentTest().log(Status.PASS, "User clicks on enregistrer button");
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to click on enregistrer button: "+e.getMessage());
        }
    }

    @When("the user clicks on annuler button of partner")
    public void userClicksOnAnnulerButton() {
        try {
            page.annulerButton();
            Hooks.getExtentTest().log(Status.PASS, "User clicks on annuler button");
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to click on annuler button: "+e.getMessage());
        }
    }

    @When("upload the profile photo of partner {string}")
    public void userUploadProfilePhoto(String profilePhoto) {
        try {
            // page.enterProfilePhoto();
            page.uploadProfilePhoto(profilePhoto);
            Hooks.getExtentTest().log(Status.PASS, "User upload profile photo");
        } catch (Exception e) {
            addFailure("Failed to upload profile photo: "+ e.getMessage() );
        }
    }

    @When("upload the cover photo of partner {string}")
    public void userUploadCoverPhoto(String coverPhoto) {
        try {
            page.enterCoverPhoto(coverPhoto);
            Hooks.getExtentTest().log(Status.PASS, "User upload cover photo");
            Thread.sleep(2000);
        } catch (Exception e) {
            addFailure("Failed to upload cover photo");
        }
    }

    @Then("the partner should be added successfully")
    public void successMessage() {
        try {
            // L'attente est gérée dans getSuccessMessage(), le sleep n'est donc pas indispensable
            String successMessage = page.getSuccessMessage();
            Assertions.assertTrue(successMessage.contains("Le partenaire a été ajouté avec succès."),
                    "Expected success message not found. Actual message: " + successMessage);
            Hooks.getExtentTest().log(Status.PASS, "Partner created successfully: " + successMessage);
        } catch (Throwable t) {
            addFailure("Success message not displayed or incorrect / " + t.getMessage());
        }
    }
    @Then("an error message Email already exists is displayed, and the partner is not added")
    public void filedMessage() {
        try {
            // L'attente est gérée dans getSuccessMessage(), le sleep n'est donc pas indispensable
            String filedMessage = page.getFiledMessage();
            Assertions.assertTrue(filedMessage.contains("Cet email est déjà utilisé !"),
                    "Expected unsuccess message not found. Actual message: " + filedMessage);
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

package StepDefinitions;
import base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import com.aventstack.extentreports.Status;
import pages.zoneManager;

public class consultZoneManager  extends TestBase  {
    private final zoneManager page;

    public consultZoneManager(){
        // Initialize with the WebDriver managed by TestBase
        this.page = new zoneManager(TestBase.getDriver());
    }




    @And("the list of zone managers is displayed")
    public void theListOfZoneManagersIsDisplayed() {
        try {
            String title = page.getTitleOfListZoneManagers();
            Assertions.assertTrue(title.contains("Liste des Chefs de Zone"),
                    "Expected title not found. Actual title: " + title);
            Hooks.getExtentTest().log(Status.PASS, "title of page display successfully: "+title);
        } catch (Exception e) {
            addFailure("Failed to display list of zone managers : "+e.getMessage());
        }
    }
    @And("the user selects the first zone manager")
    public void theUserSelectsTheFirstZoneManager() {
        try {
            page.detaillesFirstZoneManagerButton();
            Hooks.getExtentTest().log(Status.PASS, "User clicks on detailles Button");
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to click on annuler detailles Button: "+e.getMessage());
        }
    }

    @Then("the zone manager details were successfully consulted")
    public void theZoneManagerDetailsWereSuccessfullyConsulted() {
        try {
            String title = page.getTitleDetailsZoneManagersPage();
            Assertions.assertTrue(title.contains("Détatils de Chef de Zone"),
                    "Expected title of  page zone manager detail not found. Actual title: " + title);
            Hooks.getExtentTest().log(Status.PASS, "title of  page zone manager details display successfully:  : "+title);
        } catch (Exception e) {
            addFailure("Failed to display details of zone managers : "+e.getMessage());
        }
    }

    @When("the Basic Information section is displayed")
    public void theBasicInformationSectionIsDisplayed() {
        try {
            String title = page.getTitleBasicInformationSection();
            Assertions.assertTrue(title.contains("Informations sur le Chef de Zone"),
                    "Expected title of Basic Information section not found. Actual title: " + title);
            Hooks.getExtentTest().log(Status.PASS, "title of Basic Information section display successfully: "+title);
        } catch (Exception e) {
            addFailure("Failed to display Basic Information section : "+e.getMessage());
        }
    }

    @When("the Location section is displayed")
    public void theLocationSectionIsDisplayed() {
        try {
            String title = page.getTitleAdressSection();
            Assertions.assertTrue(title.contains("Adresse"),
                    "Expected title of Location section not found. Actual title: " + title);
            Hooks.getExtentTest().log(Status.PASS, "title of Location section display successfully: "+title);
        } catch (Exception e) {
            addFailure("Failed to display Location section : "+e.getMessage());
        }
    }

    @When("the page title is correct")
    public void thePageTitleIsCorrect() {
        try {
            String title = page.getTitleDetailsZoneManagersPage();
            Assertions.assertTrue(title.contains("Détatils de Chef de Zone"),
                    "Expected title of  page zone manager detail not found. Actual title: " + title);
            Hooks.getExtentTest().log(Status.PASS, "title of  page zone manager details display successfully:  : "+title);
        } catch (Exception e) {
            addFailure("Failed to display details of zone managers : "+e.getMessage());
        }
    }

    @When("the user clicks on Location button")
    public void clickOnLocationButton() {
        try {
            page.adressSectionButton();
            Hooks.getExtentTest().log(Status.PASS, "User clicks on Location Button");
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to click on Location Button: "+e.getMessage());
        }
    }

    @When("the user clicks on team button")
    public void clickOnTeamButton() {
        try {
            page.teamSectionButton();
            Hooks.getExtentTest().log(Status.PASS, "User clicks on Team Button");
            Thread.sleep(200);
        } catch (Exception e) {
            addFailure("Failed to click on Team Button: "+e.getMessage());
        }
    }
    @Then("the Team section is displayed")
    public void theTeamSectionIsDisplayed() {
        try {
            String title = page.getTitleTeamSection();
            Assertions.assertTrue(title.contains("Liste des Partenaires"),
                    "Expected title of Team section not found. Actual title: " + title);
            Hooks.getExtentTest().log(Status.PASS, "title of Basic Team display successfully");
        } catch (Exception e) {
            addFailure("Failed to display Team section : "+e.getMessage());
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

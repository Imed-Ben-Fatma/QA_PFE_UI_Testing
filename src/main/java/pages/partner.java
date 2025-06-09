package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class partner {

    private WebDriver driver;
    private WebDriverWait wait;

    // Constructor to initialize WebDriver and WebDriverWait
    public partner(WebDriver driver) {
        if (driver == null) throw new IllegalArgumentException("Driver cannot be null");
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void page() {
        driver.get("http://localhost:4200/zone-manager/new");
    }

//****************************************************
    public void partnerAndAnnouncerSectionButton() {
        WebElement Button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav/div/div/ng-scrollbar/div/mat-nav-list/jhi-app-nav-item[3]/a")));
        Button.click();
    }

    public void partnerSectionButton() {
        WebElement Button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav/div/div/ng-scrollbar/div/mat-nav-list/jhi-app-nav-item[3]/jhi-app-nav-item[1]/a")));
        Button.click();
    }

    public void addPartnerButton() {
        WebElement Button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-partner/mat-card[1]/mat-card-content/div[1]/div[3]/button[1]")));
        Button.click();
    }



    public void updatePartnerButton() {
        WebElement Button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
        Button.click();
    }


    public boolean listPartners() {
        WebElement listZoneManagers = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
        return listZoneManagers.isDisplayed();
    }

    public String getPageTitle() {
        WebElement pageTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
        return pageTitle.getText();
    }


    // *********************** photos Section ***********************
    public void photoSectionButton() {
        WebElement Button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-zone-manager-update/mat-card/mat-card-content/form/mat-tab-group/mat-tab-header/div[2]/div/div/div[1]")));
        Button.click();
    }

    public void uploadProfilePhoto(String fileName) {
        List<WebElement> inputs = driver.findElements(By.cssSelector("input[type='file'][accept='image/*']"));
        WebElement input = inputs.get(0);
        String projectPath = System.getProperty("user.dir");
        String fullPath = projectPath + "\\files\\images\\profile\\" + fileName;
        input.sendKeys(fullPath );  // C’est ici qu’on injecte le chemin du fichier
    }

    public void enterCoverPhoto(String fileName) {
        List<WebElement> inputs = driver.findElements(By.cssSelector("input[type='file'][accept='image/*']"));
        WebElement input = inputs.get(1);
        String projectPath = System.getProperty("user.dir");
        String fullPath = projectPath + "\\files\\images\\cover\\" + fileName;
        input.sendKeys(fullPath);
    }


    // *********************** information Section ***********************
    public void InformationSectionButton() {
        WebElement Button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-partner-update/mat-card/mat-card-content/form/mat-tab-group/mat-tab-header/div[2]/div/div/div[2]")));
        Button.click();
    }


    public void enterNomProjet(String nom) {
        WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-partner-update/mat-card/mat-card-content/form/mat-tab-group/div/mat-tab-body[2]/div/div/div[1]/div[1]/mat-form-field/div[1]/div/div[2]/input")));
        input.sendKeys(nom);
    }

    public void enterAnnouncer(int index) {
        WebElement matSelect = wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-partner-update/mat-card/mat-card-content/form/mat-tab-group/div/mat-tab-body[2]/div/div/div[1]/div[2]/mat-form-field/div[1]/div/div[2]/mat-select")));
        selectIndex(matSelect,index);
    }

    public void enterDescription(String description) {
        WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-partner-update/mat-card/mat-card-content/form/mat-tab-group/div/mat-tab-body[2]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/textarea")));
        input.sendKeys(description);
    }

    public void enterNomSociete(String nom) {
        WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-partner-update/mat-card/mat-card-content/form/mat-tab-group/div/mat-tab-body[2]/div/div/div[3]/div[1]/mat-form-field/div[1]/div/div[2]/input")));
        input.sendKeys(nom);
    }

    public void enterTelNum(String tel) {
        WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-partner-update/mat-card/mat-card-content/form/mat-tab-group/div/mat-tab-body[2]/div/div/div[3]/div[2]/mat-form-field/div[1]/div/div[2]/input")));
        input.sendKeys(tel);
    }

    public void enterCategoieProjet(int index) {
        WebElement matSelect = wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-partner-update/mat-card/mat-card-content/form/mat-tab-group/div/mat-tab-body[2]/div/div/div[4]/div[1]/mat-form-field/div[1]/div/div[2]/mat-select")));
        selectIndex(matSelect,index);
    }

    public void enterStatutCompte(int index) {
        WebElement matSelect = wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-partner-update/mat-card/mat-card-content/form/mat-tab-group/div/mat-tab-body[2]/div/div/div[4]/div[2]/mat-form-field/div[1]/div/div[2]/mat-select")));
        selectIndex(matSelect,index);
    }

    public void enterMarqueType(int index) {
        WebElement matSelect = wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-partner-update/mat-card/mat-card-content/form/mat-tab-group/div/mat-tab-body[2]/div/div/div[5]/div[1]/mat-form-field")));
        selectIndex(matSelect,index);
    }

    public void enterPartnerType(int index) {
        WebElement matSelect = wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-partner-update/mat-card/mat-card-content/form/mat-tab-group/div/mat-tab-body[2]/div/div/div[5]/div[2]/mat-form-field")));
        selectIndex(matSelect,index);
    }

    public void enterNomResponsable(String nom) {
        WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-partner-update/mat-card/mat-card-content/form/mat-tab-group/div/mat-tab-body[2]/div/div/div[6]/div[1]/mat-form-field/div[1]/div/div[2]/input")));
        input.sendKeys(nom);
    }

    public void enterPrenomResponsable(String prenom) {
        WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-partner-update/mat-card/mat-card-content/form/mat-tab-group/div/mat-tab-body[2]/div/div/div[6]/div[2]/mat-form-field/div[1]/div/div[2]/input")));
        input.sendKeys(prenom);
    }


    public void enterTelNumResponsable(String phoneNumber) {
        WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-partner-update/mat-card/mat-card-content/form/mat-tab-group/div/mat-tab-body[2]/div/div/div[7]/div[1]/mat-form-field/div[1]/div/div[2]/input")));
        input.sendKeys(phoneNumber);
    }

    public void enterEmail(String email) {
        WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-partner-update/mat-card/mat-card-content/form/mat-tab-group/div/mat-tab-body[2]/div/div/div[7]/div[2]/mat-form-field/div[1]/div/div[2]/input")));
        input.sendKeys(email);
    }
//---------------------------------------------------------------------
// *********************** Les coordonnées section ***********************
    public void coordonneesButton() {
        WebElement Button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-partner-update/mat-card/mat-card-content/form/mat-tab-group/mat-tab-header/div[2]/div/div/div[3]")));
        Button.click();
    }

    public void enterSiteWeb(String link) {
        WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-partner-update/mat-card/mat-card-content/form/mat-tab-group/div/mat-tab-body[3]/div/div[1]/div/div[1]/mat-form-field/div[1]/div/div[2]/input")));
        input.sendKeys(link);
    }

    public void enterFacebook(String link) {
        WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-partner-update/mat-card/mat-card-content/form/mat-tab-group/div/mat-tab-body[3]/div/div[1]/div/div[2]/mat-form-field/div[1]/div/div[2]/input")));
        input.sendKeys(link);
    }

    public void enterInstagram(String link) {
        WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-partner-update/mat-card/mat-card-content/form/mat-tab-group/div/mat-tab-body[3]/div/div[1]/div/div[3]/mat-form-field/div[1]/div/div[2]/input")));
        input.sendKeys(link);
    }

    public void enterLinkedIn(String link) {
        WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-partner-update/mat-card/mat-card-content/form/mat-tab-group/div/mat-tab-body[3]/div/div[1]/div/div[4]/mat-form-field/div[1]/div/div[2]/input")));
        input.sendKeys(link);
    }

    public void enterGovernorate(int index) {
        WebElement matSelect = wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-partner-update/mat-card/mat-card-content/form/mat-tab-group/div/mat-tab-body[3]/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select")));

        selectIndex(matSelect,index);
    }

    public void enterVille(int index) {
        WebElement matSelect = wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-partner-update/mat-card/mat-card-content/form/mat-tab-group/div/mat-tab-body[3]/div/div[3]/mat-form-field/div[1]/div/div[2]/mat-select")));

        selectIndex(matSelect,index);
    }

    public void enterZone(int index) {
        WebElement matSelect = wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-partner-update/mat-card/mat-card-content/form/mat-tab-group/div/mat-tab-body[3]/div/div[4]/mat-form-field/div[1]/div/div[2]/mat-select")));

        selectIndex(matSelect,index);
    }

    public void enterAdresse(String adresse) {
        WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-partner-update/mat-card/mat-card-content/form/mat-tab-group/div/mat-tab-body[3]/div/div[5]/div[1]/mat-form-field/div[1]/div/div[2]/input")));
        input.sendKeys(adresse);
    }

    public void enterGPS(String gps) {
        WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-partner-update/mat-card/mat-card-content/form/mat-tab-group/div/mat-tab-body[3]/div/div[5]/div[2]/mat-form-field/div[1]/div/div[2]/input")));
        input.sendKeys(gps);
    }

//---------------------------------------------------------------------
// *********************** Détails section ***********************

    public void contactAndDetailesButton() {
        WebElement Button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-partner-update/mat-card/mat-card-content/form/mat-tab-group/mat-tab-header/div[2]/div/div/div[4]")));
        Button.click();
    }

    public void enterDateDebutContrat(String date) {
        WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-partner-update/mat-card/mat-card-content/form/mat-tab-group/div/mat-tab-body[4]/div/div/div[1]/div[1]/mat-form-field/div[1]/div/div[2]/input")));
        // Efface le champ existant
        input.clear();
        // Sélectionne tout et efface au cas où clear ne fonctionnerait pas complètement
        input.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        input.sendKeys(Keys.DELETE);
        // Envoie la nouvelle date
        input.sendKeys(date);
    }

    public void enterDateFinContrat(String date) {
        WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-partner-update/mat-card/mat-card-content/form/mat-tab-group/div/mat-tab-body[4]/div/div/div[1]/div[2]/mat-form-field/div[1]/div/div[2]/input")));
        // Efface le champ existant
        input.clear();
        // Sélectionne tout et efface au cas où clear ne fonctionnerait pas complètement
        input.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        input.sendKeys(Keys.DELETE);
        // Envoie la nouvelle date
        input.sendKeys(date);

    }
    public void checkBoxOuiCumulativeDiscounts() {
        WebElement labelOui = wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("label[for='mat-radio-2-input']")));
        labelOui.click();
    }



    public void enterContratPDF(String fileName) {
        WebElement input = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-partner-update/mat-card/mat-card-content/form/mat-tab-group/div/mat-tab-body[4]/div/div/ngx-dropzone/input")));
        String projectPath = System.getProperty("user.dir");
        String fullPath = projectPath + "\\files\\pdf\\" + fileName;
        input.sendKeys(fullPath);
    }


    public void enterTypeIdFiscale(int index) {
        WebElement matSelect = wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-partner-update/mat-card/mat-card-content/form/mat-tab-group/div/mat-tab-body[4]/div/div/div[2]/div[1]/mat-form-field/div[1]/div/div[2]/mat-select")));

        selectIndex(matSelect,index);
    }

    public void enterNumberIdFiscale(String num) {
        WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-partner-update/mat-card/mat-card-content/form/mat-tab-group/div/mat-tab-body[4]/div/div/div[2]/div[2]/mat-form-field/div[1]/div/div[2]/input")));
        input.sendKeys(num);
    }

    public void enterTypeVechile1(int index) {
        WebElement matSelect = wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-partner-update/mat-card/mat-card-content/form/mat-tab-group/div/mat-tab-body[4]/div/div/div[3]/div/div[1]/div[1]/div[1]/mat-form-field/div[1]")));

        selectIndex(matSelect,index);
    }

    public void enterMarqueVechile1(int index) {
        WebElement matSelect = wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-partner-update/mat-card/mat-card-content/form/mat-tab-group/div/mat-tab-body[4]/div/div/div[3]/div/div[1]/div[1]/div[2]/mat-form-field/div[1]/div")));
        selectIndex(matSelect,index);
        try {
            // Option 1 : Cliquer sur le corps de la page pour fermer le dropdown
            driver.findElement(By.tagName("body")).click();
        } catch (Exception e) {
            // Option 2 : Forcer la fermeture via JavaScript si le clic échoue
            ((JavascriptExecutor) driver).executeScript("arguments[0].blur();", matSelect);
        }
    }

    public void addVechileButton() {
        WebElement Button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-partner-update/mat-card/mat-card-content/form/mat-tab-group/div/mat-tab-body[4]/div/div/div[3]/div/div[2]/button")));
        Button.click();
    }

    public void enterTypeVechile2(int index) {
        WebElement matSelect = wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-partner-update/mat-card/mat-card-content/form/mat-tab-group/div/mat-tab-body[4]/div/div/div[3]/div/div[1]/div[2]/div[1]/mat-form-field/div[1]/div/div[2]/mat-select")));

        selectIndex(matSelect,index);
    }

    public void enterMarqueVechile2(int index) {
        WebElement matSelect = wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-partner-update/mat-card/mat-card-content/form/mat-tab-group/div/mat-tab-body[4]/div/div/div[3]/div/div[1]/div[2]/div[2]/mat-form-field/div[1]/div/div[2]/mat-select")));

        selectIndex(matSelect,index);
        // 4. Fermer le dropdown en cliquant en dehors ou en utilisant JavaScript
        try {
            // Option 1 : Cliquer sur le corps de la page pour fermer le dropdown
            driver.findElement(By.tagName("body")).click();
        } catch (Exception e) {
            // Option 2 : Forcer la fermeture via JavaScript si le clic échoue
            ((JavascriptExecutor) driver).executeScript("arguments[0].blur();", matSelect);
        }
    }

    //---------------Jours et Heures de Travail--------------------
    public void enterjour1(int index) {
        WebElement matSelect = wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-partner-update/mat-card/mat-card-content/form/mat-tab-group/div/mat-tab-body[4]/div/div/div[4]/div/div[1]/mat-card/mat-card-content/div[2]/div[1]/mat-form-field/div[1]/div/div[2]/mat-select")));

        selectIndex(matSelect,index);
    }
    public void enterOuvertureHeureJour1(String h) {
        WebElement input = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-partner-update/mat-card/mat-card-content/form/mat-tab-group/div/mat-tab-body[4]/div/div/div[4]/div/div[1]/mat-card/mat-card-content/div[2]/div[2]/div/div[1]/div/mat-form-field[1]/div[1]/div/div[2]/input")));
        input.clear();
        input.sendKeys(h);
    }
    public void enterOuvertureMinJour1(String m) {
        WebElement input = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-partner-update/mat-card/mat-card-content/form/mat-tab-group/div/mat-tab-body[4]/div/div/div[4]/div/div[1]/mat-card/mat-card-content/div[2]/div[2]/div/div[1]/div/mat-form-field[2]/div[1]/div/div[2]/input")));
        input.clear();
        input.sendKeys(m);
    }

    public void enterFermetureHeureJour1(String h) {
        WebElement input = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-partner-update/mat-card/mat-card-content/form/mat-tab-group/div/mat-tab-body[4]/div/div/div[4]/div/div[1]/mat-card/mat-card-content/div[2]/div[2]/div/div[2]/div/mat-form-field[1]/div[1]/div/div[2]/input")));
        input.clear();
        input.sendKeys(h);
    }
    public void enterFermetureMinJour1(String m) {
        WebElement input = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-partner-update/mat-card/mat-card-content/form/mat-tab-group/div/mat-tab-body[4]/div/div/div[4]/div/div[1]/mat-card/mat-card-content/div[2]/div[2]/div/div[2]/div/mat-form-field[2]/div[1]/div/div[2]/input")));
        input.clear();
        input.sendKeys(m);
    }
    public void addJourButton() {
        WebElement Button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-partner-update/mat-card/mat-card-content/form/mat-tab-group/div/mat-tab-body[4]/div/div/div[4]/div/div[2]/button")));
        Button.click();
    }


    public void enterjour2(int index) {
        WebElement matSelect = wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-partner-update/mat-card/mat-card-content/form/mat-tab-group/div/mat-tab-body[4]/div/div/div[4]/div/div[2]/mat-card/mat-card-content/div[2]/div[1]/mat-form-field/div[1]/div/div[2]/mat-select")));

        selectIndex(matSelect,index);
    }
    public void enterOuvertureHeureJour2(String h) {
        WebElement input = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-partner-update/mat-card/mat-card-content/form/mat-tab-group/div/mat-tab-body[4]/div/div/div[4]/div/div[2]/mat-card/mat-card-content/div[2]/div[2]/div/div[1]/div/mat-form-field[1]/div[1]/div/div[2]/input")));
        input.clear();
        input.sendKeys(h);
    }
    public void enterOuvertureMinJour2(String m) {
        WebElement input = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-partner-update/mat-card/mat-card-content/form/mat-tab-group/div/mat-tab-body[4]/div/div/div[4]/div/div[2]/mat-card/mat-card-content/div[2]/div[2]/div/div[1]/div/mat-form-field[2]/div[1]/div/div[2]/input")));
        input.clear();
        input.sendKeys(m);
    }

    public void enterFermetureHeureJour2(String h) {
        WebElement input = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-partner-update/mat-card/mat-card-content/form/mat-tab-group/div/mat-tab-body[4]/div/div/div[4]/div/div[2]/mat-card/mat-card-content/div[2]/div[2]/div/div[2]/div/mat-form-field[1]/div[1]/div/div[2]/input")));
        input.clear();
        input.sendKeys(h);
    }
    public void enterFermetureMinJour2(String m) {
        WebElement input = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-partner-update/mat-card/mat-card-content/form/mat-tab-group/div/mat-tab-body[4]/div/div/div[4]/div/div[2]/mat-card/mat-card-content/div[2]/div[2]/div/div[2]/div/mat-form-field[2]/div[1]/div/div[2]/input")));
        input.clear();
        input.sendKeys(m);
    }


    //---------------------------------------------------------------------
    public void enregistrerButton() {
        WebElement Button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-partner-update/mat-card/mat-card-content/form/div/button[1]")));
        Button.click();
    }
    public void annulerButton() {
        WebElement Button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-partner-update/mat-card/mat-card-content/form/div/button[2]")));
        Button.click();
    }


    public String getSuccessMessage() {
        // Utilisation d'un locator relatif qui cible le composant du snack-bar
        By successMessageLocator = By.xpath("//mat-snack-bar-container//simple-snack-bar//div[contains(text(),'Le partenaire a été ajouté avec succès.')]");
        WebElement successMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(successMessageLocator));
        return successMessageElement.getText();
    }
    public String getFiledMessage() {
        // Utilisation d'un locator relatif qui cible le composant du snack-bar
        By successMessageLocator = By.xpath("//mat-snack-bar-container//simple-snack-bar//div[contains(text(),'Cet email est déjà utilisé !')]");
        WebElement successMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(successMessageLocator));
        return successMessageElement.getText();
    }

    public void selectIndex(WebElement matSelect,int index) {
        matSelect.click();

        // Attendre l’apparition des options
        List<WebElement> allOptions = wait.until(ExpectedConditions
                .visibilityOfAllElementsLocatedBy(By.cssSelector("mat-option")));

        if (index < 0 || index >= allOptions.size()) {
            throw new IllegalArgumentException("Index invalide : " + index);
        }

        // Cliquer sur l’option correspondant à l’index
        allOptions.get(index).click();
    }
}

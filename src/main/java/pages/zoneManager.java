package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class zoneManager {

    private WebDriver driver;
    private WebDriverWait wait;

    // Constructor to initialize WebDriver and WebDriverWait
    public zoneManager(WebDriver driver) {
        if (driver == null) throw new IllegalArgumentException("Driver cannot be null");
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void page() {
        driver.get("http://localhost:4200/zone-manager/new");
    }

//****************************************************
    public void addZoneManagerButton() {
        WebElement Button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-zone-manager/mat-card[1]/mat-card-content/div/div[3]/button[1]")));
        Button.click();
    }

    public void zoneManagerButton() {
        WebElement Button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav/div/div/ng-scrollbar/div/mat-nav-list/jhi-app-nav-item[2]/a")));
        Button.click();
    }

    public void updateZoneManagerButton() {
        WebElement Button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-zone-manager/mat-card[2]/mat-card-content/div/table/tbody/tr[1]/td[9]/a[2]")));
        Button.click();
    }


    public boolean listZoneManagers() {
        WebElement listZoneManagers = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-zone-manager/mat-card[2]")));
        return listZoneManagers.isDisplayed();
    }

    public String getPageTitle() {
        WebElement pageTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-zone-manager-update/mat-card-title")));
        return pageTitle.getText();
    }

    public void photoSectionButton() {
        WebElement Button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"mat-tab-label-1-0\"]")));
        Button.click();
    }
// *********************** information Section ***********************
    public void InformationSectionButton() {
        WebElement Button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-zone-manager-update/mat-card/mat-card-content/form/mat-tab-group/mat-tab-header/div[2]/div/div/div[2]")));
        Button.click();
    }

    public void enterSatus(int index) {
        WebElement matSelect = wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-zone-manager-update/mat-card/mat-card-content/form/mat-tab-group/div/mat-tab-body[2]/div/div/div[1]/div/mat-form-field/div[1]/div/div[2]/mat-select")));

        selectIndex(matSelect,index);
    }



    public void enterNom(String nom) {
        WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-zone-manager-update/mat-card/mat-card-content/form/mat-tab-group/div/mat-tab-body[2]/div/div/div[2]/div[1]/mat-form-field/div[1]/div/div[2]/input")));
        input.sendKeys(nom);
    }

    public void enterPrenom(String prenom) {
        WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-zone-manager-update/mat-card/mat-card-content/form/mat-tab-group/div/mat-tab-body[2]/div/div/div[2]/div[2]/mat-form-field/div[1]/div/div[2]/input")));
        input.sendKeys(prenom);
    }

    public void enterDateNaissance(String date) {
        WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-zone-manager-update/mat-card/mat-card-content/form/mat-tab-group/div/mat-tab-body[2]/div/div/div[3]/div[1]/mat-form-field/div[1]/div/div[2]/input")));
        input.sendKeys(date);
    }

    public void enterSexe(int index) {
        WebElement matSelect = wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-zone-manager-update/mat-card/mat-card-content/form/mat-tab-group/div/mat-tab-body[2]/div/div/div[3]/div[2]/mat-form-field/div[1]/div/div[2]/mat-select")));
        selectIndex(matSelect,index);
    }

    public void enterPhoneNumber(String phoneNumber) {
        WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-zone-manager-update/mat-card/mat-card-content/form/mat-tab-group/div/mat-tab-body[2]/div/div/div[4]/div[1]/mat-form-field/div[1]/div/div[2]/input")));
        input.sendKeys(phoneNumber);
    }

    public void enterEmail(String email) {
        WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-zone-manager-update/mat-card/mat-card-content/form/mat-tab-group/div/mat-tab-body[2]/div/div/div[4]/div[2]/mat-form-field/div[1]/div/div[2]/input")));
        input.sendKeys(email);
    }
//---------------------------------------------------------------------
// *********************** Les coordonnées section ***********************
    public void adressButton() {
        WebElement Button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-zone-manager-update/mat-card/mat-card-content/form/mat-tab-group/mat-tab-header/div[2]/div/div/div[3]")));
        Button.click();
    }

    public void enterGovernorate(int index) {
        WebElement matSelect = wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-zone-manager-update/mat-card/mat-card-content/form/mat-tab-group/div/mat-tab-body[3]/div/div/div[1]/mat-form-field/div[1]/div/div[2]/mat-select")));

        selectIndex(matSelect,index);
    }

    public void enterVille(int index) {
        WebElement matSelect = wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-zone-manager-update/mat-card/mat-card-content/form/mat-tab-group/div/mat-tab-body[3]/div/div/div[2]/mat-form-field/div[1]/div/div[2]/mat-select")));

        selectIndex(matSelect,index);
    }

    public void enterZone(int index) {
        WebElement matSelect = wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-zone-manager-update/mat-card/mat-card-content/form/mat-tab-group/div/mat-tab-body[3]/div/div/div[3]/mat-form-field/div[1]/div/div[2]/mat-select")));

        selectIndex(matSelect,index);
    }

    public void enterAdresse(String adresse) {
        WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-zone-manager-update/mat-card/mat-card-content/form/mat-tab-group/div/mat-tab-body[3]/div/div/div[4]/div[1]/mat-form-field/div[1]/div/div[2]/input")));
        input.sendKeys(adresse);
    }

    public void enterGPS(String gps) {
        WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-zone-manager-update/mat-card/mat-card-content/form/mat-tab-group/div/mat-tab-body[3]/div/div/div[4]/div[2]/mat-form-field/div[1]/div/div[2]/input")));
        input.sendKeys(gps);
    }

//---------------------------------------------------------------------

    public void contactAndDetailesButton() {
        WebElement Button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-zone-manager-update/mat-card/mat-card-content/form/mat-tab-group/mat-tab-header/div[2]/div/div/div[4]")));
        Button.click();
    }

    public void enterDateDebutContrat(String date) {
        WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-zone-manager-update/mat-card/mat-card-content/form/mat-tab-group/div/mat-tab-body[4]/div/div/div/div[1]/mat-form-field/div[1]/div/div[2]/input")));
        // Efface le champ existant
        input.clear();
        // Sélectionne tout et efface au cas où clear ne fonctionnerait pas complètement
        input.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        input.sendKeys(Keys.DELETE);
        // Envoie la nouvelle date
        input.sendKeys(date);
    }

    public void enterDateFinContrat(String date) {
        WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-zone-manager-update/mat-card/mat-card-content/form/mat-tab-group/div/mat-tab-body[4]/div/div/div/div[2]/mat-form-field/div[1]/div/div[2]/input")));
        // Efface le champ existant
        input.clear();
        // Sélectionne tout et efface au cas où clear ne fonctionnerait pas complètement
        input.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        input.sendKeys(Keys.DELETE);
        // Envoie la nouvelle date
        input.sendKeys(date);

    }

    public void enterContratPDF(String fileName) {
        WebElement input = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-zone-manager-update/mat-card/mat-card-content/form/mat-tab-group/div/mat-tab-body[4]/div/div/ngx-dropzone/input")));
        String projectPath = System.getProperty("user.dir");
        String fullPath = projectPath + "\\files\\pdf\\" + fileName;
        input.sendKeys(fullPath);
    }

//---------------------------------------------------------------------
    public void enregistrerButton() {
        WebElement Button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-zone-manager-update/mat-card/mat-card-content/form/div/button[1]")));
        Button.click();
    }
    public void annulerButton() {
        WebElement Button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-zone-manager-update/mat-card/mat-card-content/form/div/button[2]")));
        Button.click();
    }

    public String getSuccessMessage() {
        // Utilisation d'un locator relatif qui cible le composant du snack-bar
        By successMessageLocator = By.xpath("//mat-snack-bar-container//simple-snack-bar//div[contains(text(),'a été ajouté avec succès')]");
        WebElement successMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(successMessageLocator));
        return successMessageElement.getText();
    }

    public String getSuccessUpdateMessage() {
        // Utilisation d'un locator relatif qui cible le composant du snack-bar
        By successMessageLocator = By.xpath("//mat-snack-bar-container//simple-snack-bar//div[contains(text(),'Le chef de zone a été mis à jour avec succès.')]");
        WebElement successMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(successMessageLocator));
        return successMessageElement.getText();
    }

    public String getFiledMessage() {
        // Utilisation d'un locator relatif qui cible le composant du snack-bar
        By successMessageLocator = By.xpath("//mat-snack-bar-container//simple-snack-bar//div[contains(text(),'Cette adresse email est déjà utilisée.')]");
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

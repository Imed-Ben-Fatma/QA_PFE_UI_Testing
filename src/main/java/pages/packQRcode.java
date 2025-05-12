package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class packQRcode {

    private WebDriver driver;
    private WebDriverWait wait;

    // Constructor to initialize WebDriver and WebDriverWait
    public packQRcode(WebDriver driver) {
        if (driver == null) throw new IllegalArgumentException("Driver cannot be null");
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

//****************************************************


    public void PackSectionButton() {
        WebElement Button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav[1]/div/div/ng-scrollbar/div/mat-nav-list/jhi-app-nav-item[9]/a")));
        Button.click();
    }

    public void addPackButton() {
        WebElement Button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-pack/mat-card[1]/mat-card-content/div/div[3]/button[1]")));
        Button.click();
    }

    public boolean listPacks() {
        WebElement listZoneManagers = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-pack/mat-card[2]")));
        return listZoneManagers.isDisplayed();
    }
// *********************** information Section ***********************
    public void enterNumberPacks(String NumberOfPacks) {
        WebElement input = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-pack-update/mat-card/mat-card-content/div/div/form/div[1]/mat-form-field/div[1]/div/div[2]/input")));
        input.clear();
        input.sendKeys(NumberOfPacks);
    }

    public void enterNumberQRcodeOfPacks(String NumberOfQrCode) {
        WebElement input = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-pack-update/mat-card/mat-card-content/div/div/form/div[2]/mat-form-field/div[1]/div/div[2]/input")));
        input.clear();
        input.sendKeys(NumberOfQrCode);
    }

//---------------------------------------------------------------------
    public void enregistrerButton() {
        WebElement Button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-pack-update/mat-card/mat-card-content/div/div/form/div[3]/button[1]")));
        Button.click();
    }
    public void annulerButton() {
        WebElement Button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-pack-update/mat-card/mat-card-content/div/div/form/div[3]/button[2]")));
        Button.click();
    }

    public String getSuccessMessage() {
        // Utilisation d'un locator relatif qui cible le composant du snack-bar
        By successMessageLocator = By.xpath("//mat-snack-bar-container//simple-snack-bar//div[contains(text(),'Le pack a été ajouté avec succès.')]");
        WebElement successMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(successMessageLocator));
        return successMessageElement.getText();
    }
}

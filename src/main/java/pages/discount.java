package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class discount {

    private WebDriver driver;
    private WebDriverWait wait;

    // Constructor to initialize WebDriver and WebDriverWait
    public discount(WebDriver driver) {
        if (driver == null) throw new IllegalArgumentException("Driver cannot be null");
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void page() {
        driver.get("http://localhost:4200/discount");
    }

//****************************************************
    public void addDiscountButton() {
        WebElement Button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-discount/mat-card[1]/mat-card-content/div/div[3]/button[1]")));
        Button.click();
    }

    public void remiseAndOfferButton() {
        WebElement Button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav/div/div/ng-scrollbar/div/mat-nav-list/jhi-app-nav-item[6]/a")));
        Button.click();
    }


    public void discountSectionButton() {
        WebElement Button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav/div/div/ng-scrollbar/div/mat-nav-list/jhi-app-nav-item[6]/jhi-app-nav-item[2]")));
        Button.click();
    }


    public boolean listDiscount() {
        WebElement listZoneManagers = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-discount/mat-card[2]/mat-card-content/div")));
        return listZoneManagers.isDisplayed();
    }
// *********************** information Section ***********************
    public void enterSelectionMode(int index) {
        WebElement matSelect = wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-discount-update/mat-card/mat-card-content/form/div[1]/div/mat-form-field/div[1]/div/div[2]/mat-select")));

        selectIndex(matSelect,index);
    }

    public void enterSelectionPartnerAssocie(int index) {
        WebElement matSelect = wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-discount-update/mat-card/mat-card-content/form/div[2]/div/mat-form-field/div[1]/div/div[2]/mat-select")));

        selectIndex(matSelect,index);
    }

    public void enterSelectionProjectName(int index) {
        WebElement matSelect = wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-discount-update/mat-card/mat-card-content/form/div[2]/div/mat-form-field/div[1]/div/div[2]/mat-select")));

        selectIndex(matSelect,index);
    }



    public void enterTitle(String titre) {
        WebElement input = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-discount-update/mat-card/mat-card-content/form/div[3]/div[1]/mat-form-field/div[1]/div/div[2]/input")));
        input.sendKeys(titre);
    }

    public void enterTauxDiscount(String taux) {
        WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-discount-update/mat-card/mat-card-content/form/div[3]/div[2]/mat-form-field/div[1]/div/div[2]/input")));
        input.sendKeys(taux);
    }

    public void enterDescription(String description) {
        WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-discount-update/mat-card/mat-card-content/form/div[4]/mat-form-field/div[1]/div/div[2]/textarea")));
        input.sendKeys(description);
    }

    public void enterDiscountType(int index) {
        WebElement matSelect = wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-discount-update/mat-card/mat-card-content/form/div[5]/div[1]/mat-form-field/div[1]/div/div[2]/mat-select")));
        selectIndex(matSelect,index);
    }

    public void enterRenouvelable(int index) {
        WebElement matSelect = wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-discount-update/mat-card/mat-card-content/form/div[5]/div[2]/div/mat-form-field/div[1]/div/div[2]/mat-select")));
        selectIndex(matSelect,index);
    }

    public void enterStartDate(String date) {
        WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-discount-update/mat-card/mat-card-content/form/div[6]/div[1]/mat-form-field/div[1]/div/div[2]/input")));
        input.sendKeys(date);
    }

    public void enterEndDate(String date) {
        WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-discount-update/mat-card/mat-card-content/form/div[6]/div[2]/mat-form-field/div[1]/div/div[2]/input")));
        input.sendKeys(date);
    }
//---------------------------------------------------------------------
//---------------------------------------------------------------------
    public void enregistrerButton() {
        WebElement Button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-discount-update/mat-card/mat-card-content/form/div[7]/div/button[1]")));
        Button.click();
    }
    public void annulerButton() {
        WebElement Button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-app-full/span/mat-sidenav-container/mat-sidenav-content/div/main/jhi-discount-update/mat-card/mat-card-content/form/div[7]/div/button[2]")));
        Button.click();
    }

  /*  public String getSuccessMessage() {
        WebElement yourAccountTextElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/div/mat-snack-bar-container/div/div/div/div/simple-snack-bar/div[1]")));
        return yourAccountTextElement.getText();
    }
*/
    public String getSuccessMessage() {
        // Utilisation d'un locator relatif qui cible le composant du snack-bar
        By successMessageLocator = By.xpath("//mat-snack-bar-container//simple-snack-bar//div[contains(text(),'La remise a été ajoutée avec succès.')]");
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

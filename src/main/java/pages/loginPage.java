package pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginPage {

    private WebDriver driver;
    private WebDriverWait wait;

    // Constructor to initialize WebDriver and WebDriverWait
    public loginPage(WebDriver driver) {
        if (driver == null) throw new IllegalArgumentException("Driver cannot be null");
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void openLoginPage() {
        driver.get("http://localhost:4200/login");
    }

    public void enterEmail(String email) {
        WebElement emailInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mat-input-0")));
        emailInput.sendKeys(email);
    }

    public void enterPassword(String password) {
        WebElement passwordInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mat-input-1")));
        passwordInput.sendKeys(password);
    }

    public void submitLogin() {
        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/jhi-app/jhi-main/div/jhi-login/div/div/div[1]/div/div/div/form/button")));
        loginBtn.click();
    }

    public String getErrorMessage() {
        WebElement errorMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/mat-snack-bar-container/div/div/div/div/simple-snack-bar/div")));
        return errorMsg.getText();
    }

    public String getSuccessMessage() {
        WebElement yourAccountTextElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mat-snack-bar-container-live-0\"]/div/simple-snack-bar/div")));
        return yourAccountTextElement.getText();
    }
}

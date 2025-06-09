package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class logout {
    private WebDriver driver;
    private WebDriverWait wait;
    public logout(WebDriver driver) {
        if (driver == null) throw new IllegalArgumentException("Driver cannot be null");
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public void avatarBtn() {
        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@class='rounded-circle object-cover icon-35 profile-dd ng-star-inserted']")));
        loginBtn.click();
    }

    public void logoutBtn() {
        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h5[normalize-space()='Se Déconnecter']")));
        loginBtn.click();
    }

    public String getHomePageTitle() {
        WebElement title = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[@class='page-title m-0 f-s-18 f-w-600']")));
        return title.getText();
    }

    public String getLoginPageTitle() {
        WebElement title = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[@class='f-w-700 f-s-24 m-t-24 m-b-8']")));
        return title.getText();
    }
}

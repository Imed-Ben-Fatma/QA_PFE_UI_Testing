package base;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

    private static WebDriver driver;
    private static WebDriverWait wait;

    public static WebDriver getDriver() {
        return driver;
    }

    public static WebDriverWait getWait() {
        return wait;
    }


    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    public String captureScreenshot(String scenarioName) {
        // Définir le chemin du dossier pour stocker les captures d'écran
        String screenshotDir = "target/screenshots/";
        File directory = new File(screenshotDir);
        if (!directory.exists()) {
            directory.mkdirs(); // Créer le dossier si nécessaire
        }

        try {
            // Convertir WebDriver en instance de TakesScreenshot
            TakesScreenshot takesScreenshot = (TakesScreenshot) driver;

            // Capturer l'image sous forme de fichier
            File screenshotFile = takesScreenshot.getScreenshotAs(OutputType.FILE);

            // Générer un horodatage pour éviter les doublons
            String timestamp = new SimpleDateFormat("yyyyMMdd-HHmmss").format(new Date());

            // Créer le nom du fichier de capture
            String fileName = scenarioName + "-" + timestamp + ".png";
            File destinationFile = new File(screenshotDir + fileName);

            // Copier la capture dans le fichier cible
            FileUtils.copyFile(screenshotFile, destinationFile);

            // Afficher le chemin absolu de l'image (utile pour le débogage)
            System.out.println("Capture d'écran enregistrée à : " + destinationFile.getAbsolutePath());

            // Retourner un chemin relatif pour Extent Reports
            return "../screenshots/" + fileName;  // Retourne un chemin relatif
        } catch (IOException e) {
            // En cas d'erreur, afficher un message et retourner une chaîne vide
            System.err.println("Erreur lors de la capture d'écran : " + e.getMessage());
            return "";
        }
    }

    public static void tearDown() {
        if (driver != null) {
            driver.quit();
            driver=null;
        }
    }

}

package org.example.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.example.steps.GoogleSearchSteps;

@ExtendWith(SerenityJUnit5Extension.class)
public class GoogleSearchTest {

    @Managed(driver = "chrome")
    private WebDriver driver;

    @Steps
    private GoogleSearchSteps googleSearchSteps;

    @BeforeAll
    static void setupDriver() {
        WebDriverManager.chromedriver().setup(); // Descarga y configura automáticamente el WebDriver
    }

    @Test
    public void searchForTerm() {
        driver = new ChromeDriver(); // Inicia el driver antes de la prueba
        googleSearchSteps.openGoogle();
        googleSearchSteps.searchFor("Serenity BDD");
        googleSearchSteps.shouldSeeTitleContaining("Serenity BDD");
        driver.quit(); // Cierra el navegador después de la prueba
    }
}

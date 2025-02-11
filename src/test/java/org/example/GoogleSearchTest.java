package org.example;

//import net.serenitybdd.junit5.SerenityTest;
//import net.thucydides.core.annotations.Managed;
//import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;

/*@SerenityTest*/
@RunWith(SerenityRunner.class)
public class GoogleSearchTest {

    @Managed
    WebDriver driver;

    @Test
    public void searchInGoogle() {
        // Open Google
        driver.get("https://www.google.com");

        // Search for a term
        driver.findElement(By.name("q")).sendKeys("Serenity BDD\n");

        // Verify the title contains "Serenity BDD"
        assert driver.getTitle().contains("Serenity BDD");
    }

    @Managed(uniqueSession = true)
    WebDriver webdriver;

    @Test
    public void should_be_able_to_search_for_documents_on_the_internet() {
        webdriver.get("https://www.google.com");
        // ... tus pasos de prueba aquí
    }
}

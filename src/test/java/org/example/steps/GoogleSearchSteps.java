package org.example.steps;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GoogleSearchSteps extends UIInteractionSteps {

    @Step("Abrir Google")
    public void openGoogle() {
        openUrl("https://www.google.com");
    }

    @Step("Buscar el término '{0}'")
    public void searchFor(String term) {
        $(By.name("q")).sendKeys(term, Keys.ENTER);
    }

    @Step("Verificar que el título contiene '{0}'")
    public void shouldSeeTitleContaining(String term) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.titleContains(term));

        Assertions.assertTrue(
                getDriver().getTitle().contains(term),
                "El título de la página no contiene el término esperado: " + term
        );
    }
}

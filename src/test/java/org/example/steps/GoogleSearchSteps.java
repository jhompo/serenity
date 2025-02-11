package org.example.steps;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;
import org.openqa.selenium.Keys;

public class GoogleSearchSteps extends UIInteractionSteps {

    @Step("Abrir Google")
    public void openGoogle() {
        openUrl("https://www.google.com");
    }

    @Step("Buscar el término '{0}'")
    public void searchFor(String term) {
        $("[name='q']").sendKeys(term, Keys.ENTER);
    }

    @Step("Verificar que el título contiene '{0}'")
    public void shouldSeeTitleContaining(String term) {
        assert(getDriver().getTitle().contains(term));
    }
}
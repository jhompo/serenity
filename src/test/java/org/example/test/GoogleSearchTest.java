package org.example.test;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;


import org.example.steps.GoogleSearchSteps;


@ExtendWith(SerenityJUnit5Extension.class)
public class GoogleSearchTest {

    @Managed(driver = "chrome")
    private WebDriver driver;

    @Steps
    private GoogleSearchSteps googleSearchSteps;

    @Test
    public void searchForTerm() {
        googleSearchSteps.openGoogle();
        googleSearchSteps.searchFor("Serenity BDD");
        googleSearchSteps.shouldSeeTitleContaining("Serenity BDD");
    }
}
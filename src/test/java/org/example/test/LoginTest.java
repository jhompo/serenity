package org.example.test;

import org.example.steps.LoginSteps;
import net.serenitybdd.junit5.SerenityTest;
import org.junit.jupiter.api.Test;

@SerenityTest
public class LoginTest {

    private final LoginSteps loginSteps = new LoginSteps();

    @Test
    public void shouldLoginSuccessfully() {
        loginSteps.openLoginPage();
        loginSteps.enterCredentials();
        loginSteps.verifyHomePage();
    }
}
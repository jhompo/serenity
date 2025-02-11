package org.example.steps;

import net.thucydides.core.annotations.Step;

public class LoginSteps {

    @Step("El usuario está en la página de login")
    public void openLoginPage() {
        System.out.println("Abriendo página de login");
        // Aquí añadirías el código Selenium para abrir la página
    }

    @Step("Introduce el usuario y contraseña válidos")
    public void enterCredentials() {
        System.out.println("Introduciendo credenciales");
        // Aquí añadirías el código Selenium para completar el formulario
    }

    @Step("Debería ver la página principal")
    public void verifyHomePage() {
        System.out.println("Verificando página principal");
        // Aquí añadirías las aserciones necesarias
    }
}
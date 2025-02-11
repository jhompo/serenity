Feature: Login
  Scenario: Login con credenciales válidas
    Given que el usuario está en la página de login
    When introduce su usuario y contraseña válidos
    Then debería ver la página principal

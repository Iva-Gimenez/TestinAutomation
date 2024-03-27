package com.ibgimenez.opencart.stepDefinitions;

import com.ibgimenez.opencart.hooks.Hooks;
import com.ibgimenez.opencart.pages.HomePage;
import com.ibgimenez.opencart.pages.LoginPage;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.testng.Assert;

public class LoginDefinitions {
    private HomePage homePage;
    private LoginPage loginPage;
    public LoginDefinitions(){
        this.homePage = new HomePage(Hooks.getDriver());
        this.loginPage = new LoginPage(Hooks.getDriver());
    }
    @Dado("que el usuario ingresa a la página de login")
    public void queElUsuarioIngresaALaPáginaDeLogin() {
        Hooks.getDriver().get(Hooks.getProperty("url"));

        homePage.clickMyAccount();
        homePage.clickLoginDropdown();
    }

    @Cuando("el usuario se loguea con credenciales válidas")
    public void elUsuarioSeLogueaConCredencialesVálidas() {
        loginPage.login("ivagim@gmail.com","ivagim");
    }

    @Cuando("el usuario se loguea con credenciales inválidas")
    public void elUsuarioSeLogueaConCredencialesInválidas() {
        loginPage.login("matias2024@live.com","rrrr4125");
    }

    @Y("el usuario se loguea en la aplicacion")
    public void elUsuarioSeLogueaEnLaAplicacion() {
        homePage.clickMyAccount();
        homePage.clickLoginDropdown();

        loginPage.login(Hooks.getProperty("username"),Hooks.getProperty("password"));
    }

    @Entonces("se muestra un mensaje de error de credenciales")
    public void seMuestraUnMensajeDeErrorDeCredenciales() {
        Assert.assertTrue(loginPage.credentialsErrorIsDisplayed());
    }
}

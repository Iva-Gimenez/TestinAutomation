package com.ibgimenez.opencart.stepDefinitions;

import com.ibgimenez.opencart.hooks.Hooks;
import com.ibgimenez.opencart.pages.AccountPage;
import com.ibgimenez.opencart.pages.HomePage;
import com.ibgimenez.opencart.pages.MyAccountPage;
import com.ibgimenez.opencart.pages.RegisterPage;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.testng.Assert;

public class RegisterDefinitions {
    private HomePage homePage;
    private RegisterPage registerPage;
    private AccountPage accountPage;
    private MyAccountPage myAccountPage;
    public RegisterDefinitions(){
        this.accountPage = new AccountPage(Hooks.getDriver());
        this.homePage = new HomePage(Hooks.getDriver());
        this.registerPage = new RegisterPage(Hooks.getDriver());
    }

    @Dado("que el usuario ingresa a la página de registro")
    public void queElUsuarioIngresaALaPáginaDeRegistro() {
        Hooks.getDriver().get(Hooks.getProperty("url"));

        homePage.clickMyAccount();
        homePage.clickRegisterDropdown();
    }

    @Cuando("el usuario se registra con datos válidas")
    public void elUsuarioSeRegistraConDatosVálidas() {
        registerPage.completarFormulario("Irene","Montero","ger2024@gmail.com","1234567","5555");
    }

    @Entonces("el usuario se encuentra registrado")
    public void elUsuarioSeEncuentraRegistrado() {
        Assert.assertTrue(accountPage.titleIsDisplayed());
        Assert.assertTrue(accountPage.descriptionIsDisplayed());
    }

    @Cuando("el usuario se registra con datos inválidas")
    public void elUsuarioSeRegistraConDatosInválidas() {
        registerPage.completarFormulario("Irene","Sanchez","","777779","1234");
    }

    @Entonces("se muestra un mensaje de error de registro")
    public void seMuestraUnMensajeDeErrorDeRegistro() {
        Assert.assertTrue(registerPage.inputVacioIsDisplayed());
    }
}


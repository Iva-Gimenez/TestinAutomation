package com.ibgimenez.opencart.stepDefinitions;

import com.ibgimenez.opencart.hooks.Hooks;
import com.ibgimenez.opencart.pages.CarritoPage;
import com.ibgimenez.opencart.pages.HomePage;
import com.ibgimenez.opencart.pages.FavoritosPage; // Agrega la importación de FavoritosPage
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import org.testng.Assert;

public class CarrritoDefinitions {
    private HomePage homePage;
    private FavoritosPage favoritosPage; // Agrega la declaración de FavoritosPage
    private CarritoPage carritoPage;

    public CarrritoDefinitions(){
        this.carritoPage = new CarritoPage(Hooks.getDriver());
        this.homePage = new HomePage(Hooks.getDriver());
        this.favoritosPage = new FavoritosPage(Hooks.getDriver()); // Inicializa la instancia de FavoritosPage
    }

    @Cuando("el usuario agrega un producto al carrito")
    public void elUsuarioAgregaUnProductoAlCarrito() {
        favoritosPage.ingresarASeccionCamara();
        carritoPage.agregarUnProductoAlCarrito();
        carritoPage.ingresarACarrito();
    }

    @Entonces("se valida que se agrego un producto al carrito")
    public void seValidaQueSeAgregoUnProductoAlCarrito() {
        Assert.assertTrue(carritoPage.cameraInCartIsDisplayed());
    }
}

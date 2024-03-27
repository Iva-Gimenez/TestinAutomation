package com.ibgimenez.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarritoPage extends BasePage{
    private By textCanonCameraButton = By.xpath("//h4/a[text()=\"Canon EOS 5D\"]");
    private By titleSelect = By.id("input-option226");
    private By valueSelect = By.xpath("//option[@value=\"16\"]");
    private By buttonAdCarrito = By.id("button-cart");
    private By irCarrito = By.id("cart");
    private By verCarrito = By.xpath("//strong[text()=\" View Cart\"]");
    private By validoProducto = By.xpath("//td/small[text()=\"Select: Blue\"]");

    public CarritoPage(WebDriver driver) {
        super(driver);
    }
    public void agregarUnProductoAlCarrito(){
        click(textCanonCameraButton);
    }
    public void ingresarACarrito(){
        click(titleSelect);
        click(valueSelect);
        click(buttonAdCarrito);
        click(irCarrito);
        click(verCarrito);

    }
    public boolean cameraInCartIsDisplayed(){
        return isDisplayed(validoProducto);
    }

}

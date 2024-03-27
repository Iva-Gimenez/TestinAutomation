package com.ibgimenez.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FavoritosPage extends BasePage {
    private By cameraButton = By.xpath("//a[text()='Cameras']");
    private By favIcon = By.xpath("//button[@onclick=\"wishlist.add('30');\"]");
    private By wishlistButton = By.id("wishlist-total");
    private By canonCamera = By.xpath("//td[text()='Product 3']");

    public FavoritosPage(WebDriver driver) {
        super(driver);
    }

    public void ingresarASeccionCamara() {
        click(cameraButton);
    }

    public void agregarUnProductoAFav() {
        click(favIcon);
    }

    public void ingresarAFavoritos() {
        click(wishlistButton);
    }

    public boolean cameraInFavDisplayed() {
        return isDisplayed(canonCamera);
    }
}

package com.ibgimenez.opencart.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage{
    private By firstNameInput = By.id("input-firstname");
    private By lastNameInput = By.id("input-lastname");
    private By inputEmail = By.id("input-email");
    private By phoneInput = By.id("input-telephone");
    private By passwordInput = By.id("input-password");
    private By confirmPaswordInput = By.id("input-confirm");
    private By checkbox = By.name("agree");
    private By continueButton = By.xpath("//input[@value=\"Continue\"]");
    private By errorInputVacio = By.xpath("//div[text()=\"E-Mail Address does not appear to be valid!\"]");


    public RegisterPage(WebDriver driver) {
        super(driver);
    }
    public void completarFormulario(String firtName,
                              String lastName,
                              String email,
                              String phone,
                              String password){
        sendKeys(firstNameInput, firtName);
        sendKeys(lastNameInput, lastName);
        sendKeys(inputEmail, email);
        sendKeys(phoneInput, phone);
        sendKeys(passwordInput, password);
        sendKeys(confirmPaswordInput, password);
        click(checkbox);
        click(continueButton);
    }
    public boolean inputVacioIsDisplayed(){
        return isDisplayed(errorInputVacio);
    }

}

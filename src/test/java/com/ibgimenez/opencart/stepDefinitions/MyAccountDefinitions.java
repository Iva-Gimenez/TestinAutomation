package com.ibgimenez.opencart.stepDefinitions;

import com.ibgimenez.opencart.hooks.Hooks;
import com.ibgimenez.opencart.pages.MyAccountPage;
import io.cucumber.java.es.Entonces;
import org.testng.Assert;

public class MyAccountDefinitions {
    private MyAccountPage myAccountPage;
    public MyAccountDefinitions(){
        this.myAccountPage = new MyAccountPage(Hooks.getDriver());
    }

    @Entonces("el usuario se encuentra en su cuenta")
    public void elUsuarioSeEncuentraEnSuCuenta() {
        Assert.assertTrue(myAccountPage.titleIsDisplayed());
    }
}

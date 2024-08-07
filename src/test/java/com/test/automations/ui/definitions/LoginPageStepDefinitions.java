package com.test.automations.ui.definitions;

import com.test.automations.ui.models.login.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDefinitions {

    Settings settings;

    public LoginPageStepDefinitions(Settings settings){

        this.settings = settings;

    }

    LoginPage loginPage;

    @Given("User opens to saucelabs")
    public void userOpensSaucelabs(){

        loginPage = new LoginPage(settings.seleniumHandler.getWebDriver());
        settings.seleniumHandler.getUrl();

    }

    @When("^User sets (.*) as username$")
    public void useSetsUsername(String text){

        loginPage.setUsername(text);

    }

    @When("^User sets (.*) as password$")
    public void userSetsPassword(String text){

        loginPage.setPassword(text);

    }


    @And("User clicks login button")
    public void userClicksLoginButton() {

        loginPage.clickLoginButton();

    }

}

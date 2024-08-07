package com.test.automations.ui.models.login;

import com.test.automations.ui.models.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id = "user-name")
    private WebElement username;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    public void setUsername(String text){

        setTextbox(username,text);

    }

    public void setPassword(String text){

        setTextbox(password,text);

    }

    public void clickLoginButton(){

        clickWebElement(loginButton);

    }

}
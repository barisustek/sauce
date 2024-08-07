package com.test.automations.ui.models;

import com.test.automations.ui.handlers.SeleniumHandler;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage extends SeleniumHandler {

    public BasePage(WebDriver webDriver){

        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);

    }

}

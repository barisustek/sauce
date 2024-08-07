package com.test.automations.ui.definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    Settings settings;

    public Hooks(Settings settings){

        this.settings = settings;

    }

    @Before
    public void before(){

        settings.seleniumHandler.runSelenium();

    }

    @After
    public void after(){

        settings.seleniumHandler.stopSelenium();

    }

}

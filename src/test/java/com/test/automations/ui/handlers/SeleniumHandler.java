package com.test.automations.ui.handlers;

import com.test.automations.ui.exceptions.TestScenarioFailedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumHandler {

    protected WebDriver webDriver;
    private final ConfigHandler configHandler = new ConfigHandler();

    public void runSelenium(){

        selectBrowser();

    }

    public void stopSelenium(){

        webDriver.quit();

    }

    public WebDriver getWebDriver(){

        return this.webDriver;

    }

    public void getUrl(){

        this.webDriver.get(configHandler.getUrl());

    }

    public void clickWebElement(WebElement element){

        new WebDriverWait(webDriver,Duration.ofMillis(20000)).until(ExpectedConditions.visibilityOf(element));
        element.click();

    }

    public void setTextbox(WebElement element, String text){

        new WebDriverWait(webDriver,Duration.ofMillis(20000)).until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(text);

    }

    public void selectBrowser(){

        switch (configHandler.getBrowser()){

            case "chrome" ->{

                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--start-maximized");


                webDriver = new ChromeDriver(chromeOptions);
                webDriver.manage().timeouts().implicitlyWait(Duration.ofMillis(20000));


            }

            case "firefox" ->{

                //TODO : add firefox properties

            }

            default ->{throw  new TestScenarioFailedException();}

        }

    }

}

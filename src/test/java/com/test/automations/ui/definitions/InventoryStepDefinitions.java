package com.test.automations.ui.definitions;

import com.test.automations.ui.models.inventory.InventoryPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.sl.In;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class InventoryStepDefinitions {

    Settings settings;

    public InventoryStepDefinitions(Settings settings){

        this.settings = settings;

    }

    InventoryPage inventoryPage;

    @Then("Inventory item should be listed")
    public void inventoryItemShouldBeListed() {

        inventoryPage = new InventoryPage(settings.seleniumHandler.getWebDriver());
        Assertions.assertTrue(inventoryPage.isFirstInventoryItemDisplayed(),"Inventory is not listed");

    }

    @And("User clicks add to first add to cart button")
    public void userClicksAddToFirstAddToCartButton() {

        inventoryPage.clickAddToCardButton();

    }

    @And("^There should be (.*) item in the cart$")
    public void thereShouldBeItemInTheCart(String count) {

        Assertions.assertEquals(inventoryPage.getShoppingCartItemCount(),count,"Item count does not match");

    }

    @And("User clicks remove from cart button")
    public void userClicksRemoveFromCartButton() {

        inventoryPage.clickRemoveFromCart();

    }
}

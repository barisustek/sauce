package com.test.automations.ui.models.inventory;

import com.test.automations.ui.models.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class InventoryPage extends BasePage {

    public InventoryPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindAll({@FindBy(css = "button[id*='add-to-cart']")})
    private List<WebElement> addToCartButtons;

    @FindBy(css = "div.inventory_item")
    private WebElement inventoryItem;

    @FindBy(css = "span.shopping_cart_badge")
    private WebElement shoppingCartBadge;

    @FindAll({@FindBy(css = "button[id*='remove-sauce-labs']")})
    private List<WebElement> removeFromCartButtons;


    public void clickAddToCardButton(){

        clickWebElement(addToCartButtons.get(0));

    }

    public boolean isFirstInventoryItemDisplayed(){

        return inventoryItem.isDisplayed();

    }

    public String getShoppingCartItemCount(){

        return shoppingCartBadge.getText();

    }

    public void clickRemoveFromCart(){

        clickWebElement(removeFromCartButtons.get(0));

    }

}

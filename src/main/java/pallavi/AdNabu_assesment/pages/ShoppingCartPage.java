package pallavi.AdNabu_assesment.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage {
    private WebDriver driver;

    // Locators
    private By removeButton = By.id("removeButton");

    public ShoppingCartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickRemoveButton() {
        // Implementation to click "Remove" button
    }

    public boolean isShoppingCartEmpty() {
        // Implementation to check if the shopping cart is empty
        return true;
    }
}

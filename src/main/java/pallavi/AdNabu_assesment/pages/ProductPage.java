package pallavi.AdNabu_assesment.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    private WebDriver driver;

    // Locators
    private By BloomEarringsProduct = By.linkText("14k Wire Bloom Earrings ...");
    private By addtocart = By.xpath("//div[@id='shopify-section-cart-template']/div");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickBloomEarringsProduct() {
    	driver.findElement(BloomEarringsProduct).click();
    }
    public void clickaddtocart() {
    	driver.findElement(addtocart).click();
    }
}

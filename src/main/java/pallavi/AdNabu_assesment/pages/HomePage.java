package pallavi.AdNabu_assesment.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    // Locators
    private By catalogButton = By.xpath("//span[contains(.,'Catalog')]");
    private By searchInput = By.id("FilterTags");
    private By totalproductcount = By.xpath("//span[contains(.,'24 products')]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickcatalogButton() {
        driver.findElement(catalogButton).click();
    }
    
    public void enterSearchQuery() {
    	 driver.findElement(searchInput).click();
    }

    public void verifytotalproductcount() {
    	driver.findElement(totalproductcount).click();
    }
}

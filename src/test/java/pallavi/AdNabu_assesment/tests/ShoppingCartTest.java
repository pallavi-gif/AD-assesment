package pallavi.AdNabu_assesment.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.ExtentReportUtil;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pallavi.AdNabu_assesment.pages.ProductPage;
import pallavi.AdNabu_assesment.pages.ShoppingCartPage;


public class ShoppingCartTest {
    private WebDriver driver;
    private ProductPage productPage;
    private ShoppingCartPage shoppingCartPage;

    @BeforeClass
    
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Program Files/selenium-chrome/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        productPage = new ProductPage(driver);
        shoppingCartPage = new ShoppingCartPage(driver);
    }
    

    @Test
    public void testAddToCart() {
    	productPage.clickBloomEarringsProduct();
    	productPage.clickaddtocart();
    	Assert.assertTrue(driver.getTitle().contains("Rs. 46,000.00"));
    }

    @Test
    public void testRemoveFromCart() {
        // Implementation of test case 5
    }

    @Test
    public void testEmptyCart() {
        // Implementation of test case 6
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}

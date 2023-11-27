package pallavi.AdNabu_assesment.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.ExtentReportUtil;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;


import pallavi.AdNabu_assesment.pages.HomePage;


public class ProductSearchTest {
    private WebDriver driver;
    private HomePage homePage;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Program Files/selenium-chrome/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
    }

    @Test
    public void testProductSearchAllProducts() {
    	homePage.clickcatalogButton();
    	homePage.enterSearchQuery();
    	homePage.verifytotalproductcount();
    }

    @Test
    public void testProductSearchRoseGold() {
        // Implementation of test case 2
    }

    @Test
    public void testProductSearchWhiteGold() {
        // Implementation of test case 3
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}

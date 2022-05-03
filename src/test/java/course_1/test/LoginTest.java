package course_1.test;

import course_1.pages.HomePage;
import course_1.pages.LoginPage;
import course_1.pages.MainPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    public WebDriver driver;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void testLogin(){
        MainPage mainPage=new MainPage(driver);
        LoginPage loginPage = mainPage.openLogin();
        HomePage homePage = loginPage.login("standard_user", "secret_sauce");
        Assert.assertTrue(homePage.getText().contains("PRODUCTS"));
    }



    @After
    public void close() {
        if (driver != null) {
            driver.quit();
        }
    }


}

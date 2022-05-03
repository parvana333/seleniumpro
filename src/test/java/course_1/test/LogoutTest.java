package course_1.test;

import course_1.pages.HomePage;
import course_1.pages.LoginPage;
import course_1.pages.MainPage;
import course_1.pages.MenuPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoutTest {
    public WebDriver driver;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void testLogin(){
        HomePage homePage=new HomePage(driver);
        MenuPage menu = homePage.getMenu();
        LoginPage logout = menu.getLogout();
        Assert.assertTrue(logout.loginExist());
    }

    @After
    public void close() {
        if (driver != null) {
            driver.quit();
        }
    }
}

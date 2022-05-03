package course_1;



import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FirstSelenium {
    private  ChromeDriver driver;
    private WebDriverWait wait;


    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait=new WebDriverWait(driver,20);


    }

    private final By bodyLocator=By.tagName("body");
    private final By requestPassword=By.id("requestPassword");
    private final By accountLocator=By.id("account");
    private final By lastPage=By.id("confirmation");

    private void waitVisibilty(By locator){
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }
    private WebElement findElement(By locator){
        return this.driver.findElement(locator);
    }
    @Test
    public void testSomething(){
        this.driver.get("http://selenium.thinkcode.se/");
        waitVisibilty(bodyLocator);
        WebElement element = findElement(bodyLocator);
        waitVisibilty(requestPassword);
        WebElement hrefOfRequest = findElement(requestPassword);
        System.out.println(hrefOfRequest.getText());
        hrefOfRequest.click();

        waitVisibilty(accountLocator);
        WebElement accountRequest = findElement(accountLocator);
        accountRequest.sendKeys("111 \n");

        waitVisibilty(lastPage);
        WebElement passwordPage = findElement(lastPage);
        System.out.println(passwordPage.getText());
        Assert.assertTrue(passwordPage.getText().contains("111"));




    }


   @After
    public void close() {
        if (driver != null) {
            driver.quit();
        }
    }

}

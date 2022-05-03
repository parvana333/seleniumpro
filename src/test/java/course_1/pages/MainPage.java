package course_1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends PageBase {

    public MainPage(WebDriver driver){
        super(driver);
        driver.get("https://www.saucedemo.com/");
    }

    public LoginPage openLogin(){
        return new LoginPage(this.driver);
    }


}

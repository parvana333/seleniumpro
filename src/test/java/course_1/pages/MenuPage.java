package course_1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuPage extends PageBase{
    private By logout=By.xpath("//a[@id='logout_sidebar_link']");

    public MenuPage(WebDriver webDriver) {
        super(webDriver);
    }

    public LoginPage getLogout(){
        this.waitAndReturnElement(logout).click();
        return new LoginPage(this.driver);
    }
}

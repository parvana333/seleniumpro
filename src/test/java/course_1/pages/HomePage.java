package course_1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{

    private By dashboard=By.xpath("//div[@class='header_secondary_container']/span");
    private By menuBar=By.xpath("//div[@id='menu_button_container']/div/div/div[@class='bm-burger-button]/button']");

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }
    public String getText(){
        return this.waitAndReturnElement(dashboard).getText();
    }
    public MenuPage getMenu(){
        this.waitAndReturnElement(menuBar).click();
        return new MenuPage(this.driver);
    }

}

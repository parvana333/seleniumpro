package course_1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected By bodyBy = By.tagName("body");

    public PageBase(WebDriver webDriver){
        this.driver =webDriver;
        this.wait =new WebDriverWait(webDriver,20);
    }

    protected WebElement waitAndReturnElement(By locator){
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return this.driver.findElement(locator);
    }
    public String getBodyText(){
        WebElement webElement = this.waitAndReturnElement(bodyBy);
        return webElement.getText();
    }
}

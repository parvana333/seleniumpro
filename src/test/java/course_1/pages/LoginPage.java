package course_1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{
    private By loginMail=By.xpath("//div[@class='login-box']/form/div/input[@name='user-name']");
    private By loginPassword=By.xpath("//div[@class='login-box']/form/div/input[@name='password']");
    private By loginButton=By.xpath("//div[@class='login-box']/form/input[@name='login-button']");

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public HomePage login(String mail, String password){
        this.waitAndReturnElement(loginMail).sendKeys(mail);
        this.waitAndReturnElement(loginPassword).sendKeys(password);
        this.waitAndReturnElement(loginButton).click();
        return new HomePage(this.driver);
    }

    public boolean loginExist(){
        return this.waitAndReturnElement(loginButton).isDisplayed();
    }

}

package pages.medunna;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MedunnaSigninPage {

    @FindBy(xpath = "//input[@name='username']")
    public WebElement username;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@name='rememberMe']")
    public WebElement rememberMeButton;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

}

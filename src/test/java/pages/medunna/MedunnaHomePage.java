package pages.medunna;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MedunnaHomePage {

    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement accountMenu;

    @FindBy(id = "login-item")
    public WebElement loginItem;

}

package pages.medunna;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MedunnaAdminHomePage {

    @FindBy(id = "entity-menu")
    public WebElement itemsTitles;

    @FindBy(xpath = "//a[@class='dropdown-item']//*[.='Room']")
    public WebElement items_Room;

}

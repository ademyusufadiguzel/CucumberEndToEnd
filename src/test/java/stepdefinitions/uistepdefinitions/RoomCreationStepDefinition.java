package stepdefinitions.uistepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ConfigReader;
import utilities.Driver;

public class RoomCreationStepDefinition {

    @Given("kullanici {string} gider")
    public void kullanici_gider(String string) {
        Driver.getDriver().get(ConfigReader.getProperty(string));
    }
    @When("kullanici giris bilgilerini girer")
    public void kullanici_giris_bilgilerini_girer() {
        
    }
    @Then("items&titles paneline tiklar")
    public void items_titles_paneline_tiklar() {

    }
    @Then("room a tiklar")
    public void room_a_tiklar() {

    }
    @Then("create a new room buttonuna tiklar")
    public void create_a_new_room_buttonuna_tiklar() {

    }
    @Then("kullanici fieldslari doldurur")
    public void kullanici_fieldslari_doldurur() {

    }
    @Then("save buttonuna tiklar")
    public void save_buttonuna_tiklar() {

    }


}

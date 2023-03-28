package stepdefinitions.apistepdefinitions;

import io.cucumber.java.en.*;
import io.restassured.response.Response;
import pojos.Room;
import utilities.ObjectMapperUtils;

import static base_urls.MedunnaBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class RoomCreationStepDefs {

    Response response;
    Room expectedData;
    @Given("user sends post request for room data")
    public void user_sends_post_request_for_room_data() {
        spec.pathParams("first","api", "second","rooms");

        expectedData = new Room("Basic Room",299,1009,"TWIN",true);

        response = given(spec).body(expectedData).post("/{first}/{second}");
        response.prettyPrint();

    }
    @Then("user gets the room data and assert")
    public void user_gets_the_room_data_and_assert() {
        Room actualData = ObjectMapperUtils.convertJsonToJava(response.asString(), Room.class);
        System.out.println("actualData = " + actualData);

        assertEquals(201, response.statusCode());
        assertEquals(expectedData.getDescription(), actualData.getDescription());
        assertEquals(expectedData.getRoomNumber(), actualData.getRoomNumber());
        assertEquals(expectedData.getRoomType(), actualData.getRoomType());
        assertEquals(expectedData.getPrice(), actualData.getPrice());
        assertEquals(expectedData.getStatus(), actualData.getStatus());
    }

}

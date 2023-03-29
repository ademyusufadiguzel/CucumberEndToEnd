package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class AuthenticationMedunna {

    public static String generateToken(){
        String url = "https://medunna.com/api/authenticate";
        HashMap<String, Object> body = new HashMap<>();
        body.put("username", "batch_yuzuc");
        body.put("password", "Batch.103");
        body.put("rememberMe", true);
        Response response = given().contentType(ContentType.JSON).when().body(body).post(url);
        return response.jsonPath().getString("id_token");
    }

}

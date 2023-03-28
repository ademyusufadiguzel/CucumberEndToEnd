package base_urls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class MedunnaBaseUrl {

    public static RequestSpecification spec;

    public static void medunnaSetUp(){
        spec = new RequestSpecBuilder().addHeader("Authorization","Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJiYXRjaF95dXp1YyIsImF1dGgiOiJST0xFX0FETUlOIiwiZXhwIjoxNjgyNjIzMTYzfQ.0WbSIoPs-eqzfAl7qSKsBWLIu-UK0YNrhF_RG15zP6mzMcCYVYvxC49_Nvan3ZV-VGqC4bS43Uk2C7LFcpSXIw").setContentType(ContentType.JSON).setBaseUri("https://medunna.com").build();
    }

}

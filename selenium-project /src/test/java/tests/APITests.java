package tests;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class APITests {
    private String baseUrl = "https://www.saucedemo.com/";
    private String endpoint = "index.html";

    @Test
    public void makeSureThePageIsUp() {
        given().when().get(baseUrl + endpoint)
                .then().assertThat().statusCode(200);
    }


    @Test
    public void verifyURLContentType() {
        given().when().get(baseUrl + endpoint)
                .then().assertThat().contentType(ContentType.HTML);
    }

    @Test
    public void verifyInvalidURL() {
        endpoint = "@#$";
        given().when().get(baseUrl + endpoint)
                .then().assertThat().statusCode(404);
    }
}

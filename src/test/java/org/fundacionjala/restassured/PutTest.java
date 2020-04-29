package org.fundacionjala.restassured;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.reset;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class PutTest {

    public static final int EXPECTED_STATUS_CODE = 200;

    @Test
    public void givenPutUrlWhenRequestUpdatesPostThenCorrect() {
        reset();
        given()
                .pathParam("postId", 1)
                .with().body("{ \"id\" : 1, \"title\" : \"foo\", \"body\" : \"mine\", \"userId\" : 1 }")
                .when()
                .put("https://jsonplaceholder.typicode.com/posts/{postId}")
                .then()
                .assertThat()
                .statusCode(EXPECTED_STATUS_CODE);
    }

    @Test
    public void givenPutConfigWhenRequestUpdatesPostThenCorrect() {
        //given
        // API URL
        reset();
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
        //HTTP request
        RequestSpecification httpRequest = RestAssured
                .with()
                .body("{ \"id\" : 1, \"title\" : \"foo\", \"body\" : \"mine\", \"userId\" : 1 }")
                .header("Content-type", "application/json; charset=UTF-8");
        //when
        //Getting response
        Response response = httpRequest.request(Method.PUT, "/posts/{postId}", 1);
        int actualStatusCode = response.getStatusCode();
        //then
        assertEquals(actualStatusCode, EXPECTED_STATUS_CODE);
    }
}

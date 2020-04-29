package org.fundacionjala.restassured;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.reset;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class PostTest {

    public static final int EXPECTED_STATUS_CODE = 201;

    @Test
    public void givenPostUrlWhenRequestCreatesPostThenCorrect() {
        given()
                .body("{ \"title\" : \"foo\", \"body\" : \"mine\", \"userId\" : 1 }")
                .when()
                .post("https://jsonplaceholder.typicode.com/posts")
                .then()
                .assertThat()
                .statusCode(EXPECTED_STATUS_CODE);
    }

    @Test
    public void givenPostConfigWhenRequestCreatesPostThenCorrect() {
        //given
        // API URL
        reset();
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/posts";
        //HTTP request
        RequestSpecification httpRequest = RestAssured
                .with().body("{ \"title\" : \"foo\", \"body\" : \"mine\", \"userId\" : 1 }").header("Content-type",
                        "application/json; charset=UTF-8");
        //when
        //Getting response
        Response response = httpRequest.request(Method.POST);
        int actualStatusCode = response.getStatusCode();
        //then
        assertEquals(actualStatusCode, EXPECTED_STATUS_CODE);
    }
}

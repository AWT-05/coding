package org.fundacionjala.restassured;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.reset;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class DeleteTest {

    public static final int EXPECTED_STATUS_CODE = 200;

    @Test
    public void givenDeleteUrlWhenRequestDeletePostThenCorrect() {
        reset();
        given()
                .pathParam("postId", 1)
                .when()
                .delete("https://jsonplaceholder.typicode.com/posts/{postId}")
                .then()
                .assertThat()
                .statusCode(EXPECTED_STATUS_CODE);
    }

    @Test
    public void givenDeleteConfigWhenRequestDeletePostThenCorrect() {
        //given
        // API URL
        reset();
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
        //HTTP request
        RequestSpecification httpRequest = RestAssured.given();
        //when
        //Getting response
        Response response = httpRequest.request(Method.DELETE, "/posts/{postId}", 1);
        int actualStatusCode = response.getStatusCode();
        //then
        assertEquals(actualStatusCode, EXPECTED_STATUS_CODE);
    }
}

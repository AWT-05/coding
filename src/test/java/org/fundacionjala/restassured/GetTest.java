package org.fundacionjala.restassured;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasKey;
import static org.hamcrest.Matchers.hasSize;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GetTest {

    public static final int EXPECTED_STATUS_CODE = 200;
    public static final int EXPECTED_JSON_SIZE = 10;
    public static final int USER_ID = 3;

    @DataProvider(name = "userPosts")
    public static final Object[][] createPostTestData() {

        return new Object[][] {
                {1, 1},
                {2, 1}
        };
    }

    @Test(dataProvider = "userPosts")
    public void givenUrlWhenRequestPostGetsJsonValueThenCorrect(final int postId, final int userId) {
        given()
                .pathParam("postId", postId)
                .when()
                .get("https://jsonplaceholder.typicode.com/posts/{postId}")
                .then()
                .assertThat()
                .body("userId", equalTo(userId));
    }

    @Test
    public void givenUrlWhenRequestUsersThenCorrectSize() {
        get("https://jsonplaceholder.typicode.com/users")
                .then()
                .assertThat()
                .body("", hasSize(EXPECTED_JSON_SIZE));
    }

    @Test
    public void givenUrlWhenSuccessOnGetsResponseThenCorrect() {
        get("https://jsonplaceholder.typicode.com/users")
                .then()
                .assertThat()
                .statusCode(EXPECTED_STATUS_CODE);
    }

    @Test
    public void givenUrlWhenRequestUserZipcodeAndKeyExistsThenCorrect() {
        given()
                .pathParam("userId", USER_ID)
                .when()
                .get("https://jsonplaceholder.typicode.com/users/{userId}")
                .then()
                .assertThat()
                .body("address", hasKey("zipcode"));
    }

    @Test
    public void givenConfigWhenSuccessOnGetsResponseThenCorrect() {
        //given
        // API URL
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/users";
        //HTTP request
        RequestSpecification httpRequest = RestAssured.given();
        //when
        //Getting response
        Response response = httpRequest.request(Method.GET);
        int actualStatusCode = response.getStatusCode();
        //then
        assertEquals(actualStatusCode, EXPECTED_STATUS_CODE);
    }

    @Test
    public void givenGetUrlWhenRequestUserZipcodeThenCorrect() {
        given()
                .pathParam("userId", USER_ID)
                .when()
                .get("https://jsonplaceholder.typicode.com/users/{userId}")
                .then()
                .assertThat()
                .body("address.zipcode", equalTo("59590-4157"));
    }

}

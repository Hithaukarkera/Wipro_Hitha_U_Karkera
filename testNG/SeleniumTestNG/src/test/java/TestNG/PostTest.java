package TestNG;

import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;
 
public class PostTest {
 
    @Test
    public void createProductTest() {
 
        String requestBody = "{ \"title\": \"New Phone\", \"price\": 500 }";
 
        given()
            .contentType(ContentType.JSON)
            .body(requestBody)
        .when()
            .post("https://dummyjson.com/products/add")
        .then()
            .statusCode(201);
    }
}
package TestNG;

import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;
 
public class putTest {
 
    @Test
    public void updateProductTest() {
 
        String requestBody = "{ \"title\": \"Updated Phone\" }";
 
        given()
            .log().all()
            .contentType(ContentType.JSON)
            .body(requestBody)
        .when()
            .put("https://dummyjson.com/products/1")
        .then()
            .log().all()
            .statusCode(200);
    }
}
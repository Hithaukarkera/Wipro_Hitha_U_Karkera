package TestNG;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class APIExample {

    @BeforeClass
    public void setup() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
        System.setProperty("java.net.preferIPv4Stack", "true");
    }

    // 1️ GET ALL
    @Test(priority = 1)
    public void getAllUsers() {

        given()
        .when()
            .get("/users")
        .then()
            .statusCode(200)
            .log().all();
    }

    // 2️ GET SINGLE
    @Test(priority = 2)
    public void getSingleUser() {

        given()
        .when()
            .get("/users/1")
        .then()
            .statusCode(200)
            .body("id", equalTo(1))
            .log().all();
    }

    // 3️ POST
    @Test(priority = 3)
    public void createUser() {

        String requestBody = "{ \"name\": \"Hitha\", \"job\": \"QA\" }";

        given()
            .header("Content-Type", "application/json")
            .body(requestBody)
        .when()
            .post("/users")
        .then()
            .statusCode(201)
            .log().all();
    }

    // 4️ PUT
    @Test(priority = 4)
    public void updateUser() {

        String requestBody = "{ \"name\": \"Hitha U Karkera\", \"job\": \"Senior QA\" }";

        given()
            .header("Content-Type", "application/json")
            .body(requestBody)
        .when()
            .put("/users/1")
        .then()
            .statusCode(200)
            .log().all();
    }

    // 5️ DELETE
    @Test(priority = 5)
    public void deleteUser() {

        given()
        .when()
            .delete("/users/1")
        .then()
            .statusCode(200)
            .log().all();
    }
}
package org.studentapp.studentapp;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class GetStudent {
    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;
    @Test
    public void studentApp() {
        given()
                // When
                .when()
                .get("http://localhost:8080/student/list")
                // Then
                .then()
                .statusCode(200)
                .body("[3].programme", equalTo("Computer Science"));
    }
    @Test
    public void studentApp1() {
        given()
                // When
                .when()
                .get("http://localhost:8080/student/list")
                // Then
                .then()
                .statusCode(200)
                .body("[5].programme", equalTo("Disaster Management"))
                .body("[5].courses[0]", equalTo("Disaster Preparedness"));
    }
    @Test
    public void studentAdd2() {
        given()
                // When
                .when()
                .get("http://localhost:8080/student/list")
                // Then
                .then()
                .statusCode(200)
                .body("[1].firstName", equalTo("Murphy"));
    }
    @Test
    public void studentApp3() {
        given()
                // When
                .when()
                .get("http://localhost:8080/student/list")
                // Then
                .then()
                .statusCode(200)
                .body("[7].programme", equalTo("Law"));
    }
    @Test
    public void studentApp4() {
        given()
                // When
                .when()
                .get("http://localhost:8080/student/list")
                // Then
                .then()
                .statusCode(200)
                .body("[9].firstName", equalTo("Todd"))
                .body("[9].lastName", equalTo("Beck"));

    }

}

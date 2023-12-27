package org.studentapp.studentapp;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.equalTo;

public class Post {
    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;

    @Test
    public void postStudent(){
        // Given
        String data = "{\n" +
                "    \"firstName\": \"Khushbu\",\n" +
                "    \"lastName\": \"Patel\",\n" +
                "    \"email\": \"khush2808@gmail.com\",\n" +
                "    \"programme\": \"Software Testing\",\n" +
                "    \"courses\": [\n" +
                "        \"Java\",\n" +
                "        \"API\"\n" +
                "    ]\n" +
                "}";
        response = RestAssured.given().log().all()
                .contentType(ContentType.JSON)
                .when()
                .body(data)
                .post("http://localhost:8080/student");
        response.then().log().all().statusCode(201)
                .body("msg", equalTo("Student added"));
    }
    @Test
    public void postStudent1(){
        // Given
        String data = "{\n" +
                "    \"firstName\": \"Riddhesh\",\n" +
                "    \"lastName\": \"Patel\",\n" +
                "    \"email\": \"riddhesh@gmail.com\",\n" +
                "    \"programme\": \"Manual Testing\",\n" +
                "    \"courses\": [\n" +
                "        \"Java\",\n" +
                "        \"API\"\n" +
                "    ]\n" +
                "}";
        response = RestAssured.given().log().all()
                .contentType(ContentType.JSON)
                .when()
                .body(data)
                .post("http://localhost:8080/student");
        response.then().log().all().statusCode(201)
                .body("msg", equalTo("Student added"));
    }
    @Test
    public void postStudent2(){
        // Given
        String data = "{\n" +
                "    \"firstName\": \"Rushit\",\n" +
                "    \"lastName\": \"Patel\",\n" +
                "    \"email\": \"rush13@gmail.com\",\n" +
                "    \"programme\": \"Finance and Accounting\",\n" +
                "    \"courses\": [\n" +
                "        \"Accounts\",\n" +
                "        \"Economics\"\n" +
                "    ]\n" +
                "}";
        response = RestAssured.given().log().all()
                .contentType(ContentType.JSON)
                .when()
                .body(data)
                .post("http://localhost:8080/student");
        response.then().log().all().statusCode(201)
                .body("msg", equalTo("Student added"));
    }
    @Test
    public void postStudent3(){
        // Given
        String data = "{\n" +
                "    \"firstName\": \"Palak\",\n" +
                "    \"lastName\": \"Patel\",\n" +
                "    \"email\": \"palpatel@gmail.com\",\n" +
                "    \"programme\": \"Literature\",\n" +
                "    \"courses\": [\n" +
                "        \"English\",\n" +
                "        \"Literature\"\n" +
                "    ]\n" +
                "}";
        response = RestAssured.given().log().all()
                .contentType(ContentType.JSON)
                .when()
                .body(data)
                .post("http://localhost:8080/student");
        response.then().log().all().statusCode(201)
                .body("msg", equalTo("Student added"));
    }
    @Test
    public void postStudent4(){
        // Given
        String data = "{\n" +
                "    \"firstName\": \"Anjana\",\n" +
                "    \"lastName\": \"Patel\",\n" +
                "    \"email\": \"anjanapatel@gmail.com\",\n" +
                "    \"programme\": \"Home Science\",\n" +
                "    \"courses\": [\n" +
                "        \"Drawing\",\n" +
                "        \"Cooking\"\n" +
                "    ]\n" +
                "}";
        response = RestAssured.given().log().all()
                .contentType(ContentType.JSON)
                .when()
                .body(data)
                .post("http://localhost:8080/student");
        response.then().log().all().statusCode(201)
                .body("msg", equalTo("Student added"));
    }
}

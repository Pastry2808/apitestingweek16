package org.studentapp.studentapp;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class Patch {
    ValidatableResponse validatableResponse;
    RequestSpecification requestSpecification;
    ResponseSpecification responseSpecification;
    Response response;
    @Test
    public void updateUserBdd(){

        String jsonData = "{\n" +
                "    \"firstName\": \"Riddhesh\",\n" +
                "    \"email\": \"khushbu.dui@ultricessit.co.uk\"\n" +
                "}";
        given()
                .baseUri("http://localhost:8080/student/3")
                .contentType(ContentType.JSON)
                .body(jsonData)
                .when()
                .patch()
                .then().statusCode(200)
                .body("msg",equalTo("Updated"));
    }
    @Test
    public void updateUserBdd1(){

        String jsonData = "{\n" +
                "    \"firstName\": \"Riddhesh\",\n" +
                "    \"email\": \"khush.dui@ultricessit.co.uk\"\n" +
                "}";
        given()
                .baseUri("http://localhost:8080/student/4")
                .contentType(ContentType.JSON)
                .body(jsonData)
                .when()
                .patch()
                .then().statusCode(200)
                .body("msg",equalTo("Updated"));
    }
    @Test
    public void updateUserBdd2(){

        String jsonData = "{\n" +
                "    \"firstName\": \"Palakben\",\n" +
                "    \"email\": \"palakpatel@ultricessit.co.uk\"\n" +
                "}";
        given()
                .baseUri("http://localhost:8080/student/5")
                .contentType(ContentType.JSON)
                .body(jsonData)
                .when()
                .patch()
                .then().statusCode(200)
                .body("msg",equalTo("Updated"));
    }
    @Test
    public void updateUserBdd3(){

        String jsonData = "{\n" +
                "    \"firstName\": \"Rushitkumar\",\n" +
                "    \"email\": \"rushitpatel1302@hotmail.co.uk\"\n" +
                "}";
        given()
                .baseUri("http://localhost:8080/student/6")
                .contentType(ContentType.JSON)
                .body(jsonData)
                .when()
                .patch()
                .then().statusCode(200)
                .body("msg",equalTo("Updated"));
    }
    @Test
    public void updateUserBdd4(){

        String jsonData = "{\n" +
                "    \"firstName\": \"Anju\",\n" +
                "    \"email\": \"anjupatel@ultricessit.co.uk\"\n" +
                "}";
        given()
                .baseUri("http://localhost:8080/student/7")
                .contentType(ContentType.JSON)
                .body(jsonData)
                .when()
                .patch()
                .then().statusCode(200)
                .body("msg",equalTo("Updated"));
    }
}

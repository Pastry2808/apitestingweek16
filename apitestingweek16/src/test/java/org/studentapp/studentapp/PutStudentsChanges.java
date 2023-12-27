package org.studentapp.studentapp;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class PutStudentsChanges {
    ValidatableResponse validatableResponse;
    RequestSpecification requestSpecification;
    ResponseSpecification responseSpecification;
    Response response;
    @Test
    public void updateEmployeeBdd() {

        String jsonData = "{\n" +
                "    \"id\": 3,\n" +
                "    \"firstName\": \"Khush\",\n" +
                "    \"lastName\": \"Patel\",\n" +
                "    \"email\": \"tincidunt.dui@ultricessit.co.uk\",\n" +
                "    \"programme\": \"Computer Science\",\n" +
                "    \"courses\": [\n" +
                "        \"Calculus\",\n" +
                "        \"Algorithms\",\n" +
                "        \"Software Development\",\n" +
                "        \"Ethics\"\n" +
                "    ]\n" +
                "}";

        RestAssured.baseURI = "http://localhost:8080/student/3";

        //create request specification
        requestSpecification = given();

        requestSpecification.contentType(ContentType.JSON);

        requestSpecification.body(jsonData);

        response = requestSpecification.put();

        System.out.println(response.prettyPrint());

        validatableResponse = response.then().log().all();

        validatableResponse.statusCode(200);
        validatableResponse.body("msg", equalTo("Student Updated"));
    }
    @Test
    public void updateEmployeeBdd1() {

        String jsonData = "{\n" +
                "    \"id\": 4,\n" +
                "    \"firstName\": \"Rids\",\n" +
                "    \"lastName\": \"Patel\",\n" +
                "    \"email\": \"tincidunt.duirids@ultricessit.co.uk\",\n" +
                "    \"programme\": \"Computer Science\",\n" +
                "    \"courses\": [\n" +
                "        \"Calculus\",\n" +
                "        \"Algorithms\",\n" +
                "        \"Software Development\",\n" +
                "        \"Ethics\"\n" +
                "    ]\n" +
                "}";

        RestAssured.baseURI = "http://localhost:8080/student/4";

        //create request specification
        requestSpecification = given();

        requestSpecification.contentType(ContentType.JSON);

        requestSpecification.body(jsonData);

        response = requestSpecification.put();

        System.out.println(response.prettyPrint());

        validatableResponse = response.then().log().all();

        validatableResponse.statusCode(200);
        validatableResponse.body("msg", equalTo("Student Updated"));
    }
    @Test
    public void updateEmployeeBdd2() {

        String jsonData = "{\n" +
                "    \"id\":5,\n" +
                "    \"firstName\": \"Rush\",\n" +
                "    \"lastName\": \"Patel\",\n" +
                "    \"email\": \"rush1302@gmail.com\",\n" +
                "    \"programme\": \"Business\",\n" +
                "    \"courses\": [\n" +
                "        \"Accounts\",\n" +
                "        \"Management\",\n" +
                "        \"Personality Development\",\n" +
                "        \"Ethics\"\n" +
                "    ]\n" +
                "}";

        RestAssured.baseURI = "http://localhost:8080/student/5";

        //create request specification
        requestSpecification = given();

        requestSpecification.contentType(ContentType.JSON);

        requestSpecification.body(jsonData);

        response = requestSpecification.put();

        System.out.println(response.prettyPrint());

        validatableResponse = response.then().log().all();

        validatableResponse.statusCode(200);
        validatableResponse.body("msg", equalTo("Student Updated"));
    }
    @Test
    public void updateEmployeeBdd3() {

        String jsonData = "{\n" +
                "    \"id\": 6,\n" +
                "    \"firstName\": \"Pal\",\n" +
                "    \"lastName\": \"Patel\",\n" +
                "    \"email\": \"palpatel@ultricessit.co.uk\",\n" +
                "    \"programme\": \"MBA\",\n" +
                "    \"courses\": [\n" +
                "        \"Business Management\",\n" +
                "        \"Human Resources\",\n" +
                "        \"Finance\",\n" +
                "        \"Information Techonolgy\"\n" +
                "    ]\n" +
                "}";

        RestAssured.baseURI = "http://localhost:8080/student/6";

        //create request specification
        requestSpecification = given();

        requestSpecification.contentType(ContentType.JSON);

        requestSpecification.body(jsonData);

        response = requestSpecification.put();

        System.out.println(response.prettyPrint());

        validatableResponse = response.then().log().all();

        validatableResponse.statusCode(200);
        validatableResponse.body("msg", equalTo("Student Updated"));
    }
    @Test
    public void updateEmployeeBdd4() {

        String jsonData = "{\n" +
                "    \"id\": 7,\n" +
                "    \"firstName\": \"Anjana\",\n" +
                "    \"lastName\": \"Patel\",\n" +
                "    \"email\": \"tincidunt.duianjana@ultricessit.co.uk\",\n" +
                "    \"programme\": \"Home Science\",\n" +
                "    \"courses\": [\n" +
                "        \"Cooking\",\n" +
                "        \"Art\",\n" +
                "        \"Behavioural Development\",\n" +
                "        \"Physical Education\"\n" +
                "    ]\n" +
                "}";

        RestAssured.baseURI = "http://localhost:8080/student/7";

        //create request specification
        requestSpecification = given();

        requestSpecification.contentType(ContentType.JSON);

        requestSpecification.body(jsonData);

        response = requestSpecification.put();

        System.out.println(response.prettyPrint());

        validatableResponse = response.then().log().all();

        validatableResponse.statusCode(200);
        validatableResponse.body("msg", equalTo("Student Updated"));
    }

}

package org.studentapp.bestbuyapi;

import io.restassured.RestAssured;
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
    public void patchProducts() {

        String jsonData = "{\n" +
                "  \"name\": \"string\",\n" +
                "  \"type\": \"string\",\n" +
                "  \"price\": 0,\n" +
                "  \"shipping\": 0,\n" +
                "  \"upc\": \"string\",\n" +
                "  \"description\": \"string\",\n" +
                "  \"manufacturer\": \"string\",\n" +
                "  \"model\": \"string\",\n" +
                "  \"url\": \"string\",\n" +
                "  \"image\": \"string\"\n" +
                "}";

        RestAssured.baseURI = "http://localhost:3030/products/9999686";

        //create request specification
        requestSpecification = given();

        requestSpecification.contentType(ContentType.JSON);

        requestSpecification.body(jsonData);

        response = requestSpecification.patch();

        System.out.println(response.prettyPrint());

        validatableResponse = response.then();

        validatableResponse.statusCode(200);

        validatableResponse.body("name", equalTo("string"));

    }
    @Test
    public void patchStores() {

        String jsonData = "{\n" +
                "  \"name\": \"string\",\n" +
                "  \"type\": \"string\",\n" +
                "  \"address\": \"string\",\n" +
                "  \"address2\": \"string\",\n" +
                "  \"city\": \"string\",\n" +
                "  \"state\": \"string\",\n" +
                "  \"zip\": \"string\",\n" +
                "  \"lat\": 0,\n" +
                "  \"lng\": 0,\n" +
                "  \"hours\": \"string\",\n" +
                "  \"services\": {}\n" +
                "}";

        RestAssured.baseURI = "http://localhost:3030/stores/8925";

        //create request specification
        requestSpecification = given();

        requestSpecification.contentType(ContentType.JSON);

        requestSpecification.body(jsonData);

        response = requestSpecification.patch();

        System.out.println(response.prettyPrint());

        validatableResponse = response.then();

        validatableResponse.statusCode(200);

        validatableResponse.body("name", equalTo("string"));

    }
    @Test
    public void patchServices() {

        String jsonData = "{\n" +
                "  \"name\": \"string\"\n" +
                "}";

        RestAssured.baseURI = "http://localhost:3030/services/25";

        //create request specification
        requestSpecification = given();

        requestSpecification.contentType(ContentType.JSON);

        requestSpecification.body(jsonData);

        response = requestSpecification.patch();

        System.out.println(response.prettyPrint());

        validatableResponse = response.then();

        validatableResponse.statusCode(200);

        validatableResponse.body("name", equalTo("string"));

    }
    @Test
    public void patchCategories() {

        String jsonData = "{\n" +
                "  \"name\": \"string\",\n" +
                "  \"id\": \"string\"\n" +
                "}";

        RestAssured.baseURI = "http://localhost:3030/categories/abcat0010000";

        //create request specification
        requestSpecification = given();

        requestSpecification.contentType(ContentType.JSON);

        requestSpecification.body(jsonData);

        response = requestSpecification.patch();

        System.out.println(response.prettyPrint());

        validatableResponse = response.then();

        validatableResponse.statusCode(200);

        validatableResponse.body("name", equalTo("string"));
    }
}

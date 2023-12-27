package org.studentapp.bestbuyapi;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Delete {
    RequestSpecification requestSpecification;
    Response response;
    ResponseSpecification responseSpecification;
    ValidatableResponse validatableResponse;
    @Test
    public void deleteProducts(){
        RestAssured.baseURI ="http://localhost:3030/products/9999689";
        requestSpecification = given();
        response=requestSpecification.delete();
        System.out.println(response.prettyPrint());
        validatableResponse = response.then();
        validatableResponse.statusCode(200);
    }
    @Test
    public void deleteStores(){
        RestAssured.baseURI ="http://localhost:3030/stores/8925";
        requestSpecification = given();
        response=requestSpecification.delete();
        System.out.println(response.prettyPrint());
        validatableResponse = response.then();
        validatableResponse.statusCode(200);
    }
    @Test
    public void deleteServices(){
        RestAssured.baseURI ="http://localhost:3030/services/25";
        requestSpecification = given();
        response=requestSpecification.delete();
        System.out.println(response.prettyPrint());
        validatableResponse = response.then();
        validatableResponse.statusCode(200);
    }
    @Test
    public void deleteCategories(){
        RestAssured.baseURI ="http://localhost:3030/categories/abcat0010000";
        requestSpecification = given();
        response=requestSpecification.delete();
        System.out.println(response.prettyPrint());
        validatableResponse = response.then();
        validatableResponse.statusCode(200);
    }
}

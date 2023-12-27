package org.studentapp.bestbuyapi;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Get {
    ValidatableResponse validatableResponse;
    RequestSpecification requestSpecification;
    ResponseSpecification responseSpecification;
    Response response;
    @Test
    public void getProducts() {
        //If you don’t want to use ValidatableResponse for the assertion,
        // you can use Response from io.restassured .response to get the status code and status line,
        // which are asserted using JUnit.Assert.
        RestAssured.baseURI = "http://localhost:3030/products/43900";

        //create a request specification
        requestSpecification = RestAssured.given();

        //calling method
        response = requestSpecification.get();

        //print response
        System.out.println(response.prettyPrint());

        // Get status line
        String statusLine = response.getStatusLine();
        Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");

        // Get status code
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);
    }
    @Test
    public void getStores() {
        //If you don’t want to use ValidatableResponse for the assertion,
        // you can use Response from io.restassured .response to get the status code and status line,
        // which are asserted using JUnit.Assert.
        RestAssured.baseURI = "http://localhost:3030/stores/4";

        //create a request specification
        requestSpecification = RestAssured.given();

        //calling method
        response = requestSpecification.get();

        //print response
        System.out.println(response.prettyPrint());

        // Get status line
        String statusLine = response.getStatusLine();
        Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");

        // Get status code
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);
    }
    @Test
    public void getServices() {
        //If you don’t want to use ValidatableResponse for the assertion,
        // you can use Response from io.restassured .response to get the status code and status line,
        // which are asserted using JUnit.Assert.
        RestAssured.baseURI = "http://localhost:3030/services/5";

        //create a request specification
        requestSpecification = RestAssured.given();

        //calling method
        response = requestSpecification.get();

        //print response
        System.out.println(response.prettyPrint());

        // Get status line
        String statusLine = response.getStatusLine();
        Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");

        // Get status code
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);
    }
    @Test
    public void getCategories() {
        //If you don’t want to use ValidatableResponse for the assertion,
        // you can use Response from io.restassured .response to get the status code and status line,
        // which are asserted using JUnit.Assert.
        RestAssured.baseURI = "http://localhost:3030/categories/abcat0010000";

        //create a request specification
        requestSpecification = RestAssured.given();

        //calling method
        response = requestSpecification.get();

        //print response
        System.out.println(response.prettyPrint());

        // Get status line
        String statusLine = response.getStatusLine();
        Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");

        // Get status code
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);
    }
    @Test
    public void getUtilitiesVersion() {
        //If you don’t want to use ValidatableResponse for the assertion,
        // you can use Response from io.restassured .response to get the status code and status line,
        // which are asserted using JUnit.Assert.
        RestAssured.baseURI = "http://localhost:3030/version";

        //create a request specification
        requestSpecification = RestAssured.given();

        //calling method
        response = requestSpecification.get();

        //print response
        System.out.println(response.prettyPrint());

        // Get status line
        String statusLine = response.getStatusLine();
        Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");

        // Get status code
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);
    }
    @Test
    public void getUtilitiesHealthCheck() {
        //If you don’t want to use ValidatableResponse for the assertion,
        // you can use Response from io.restassured .response to get the status code and status line,
        // which are asserted using JUnit.Assert.
        RestAssured.baseURI = "http://localhost:3030/healthcheck";

        //create a request specification
        requestSpecification = RestAssured.given();

        //calling method
        response = requestSpecification.get();

        //print response
        System.out.println(response.prettyPrint());

        // Get status line
        String statusLine = response.getStatusLine();
        Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");

        // Get status code
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);
    }
}

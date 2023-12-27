package org.studentapp.studentapp;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Delete {
    @Test // delete above id
    public void verifyNewStudentInfoDeletedByID() {
        given()
                .pathParam("id", 103)
                .when()
                .delete("http://localhost:8080/student/{id}")
                .then()
                .statusCode(204);
    }
    @Test
    public void verifyStudentInfoDeleted() {
        given()
                .pathParam("id", 103)
                .when()
                .get("http://localhost:8080/student/{id}")
                .then().statusCode(404);
    }
    @Test // delete above id
    public void verifyNewStudentInfoDeletedByID1() {
        given()
                .pathParam("id", 104)
                .when()
                .delete("http://localhost:8080/student/{id}")
                .then()
                .statusCode(204);
    }
    @Test
    public void verifyStudentInfoDeleted1() {
        given()
                .pathParam("id", 104)
                .when()
                .get("http://localhost:8080/student/{id}")
                .then().statusCode(404);
    }
    @Test // delete above id
    public void verifyNewStudentInfoDeletedByID2() {
        given()
                .pathParam("id", 105)
                .when()
                .delete("http://localhost:8080/student/{id}")
                .then()
                .statusCode(204);
    }
    @Test
    public void verifyStudentInfoDeleted2() {
        given()
                .pathParam("id", 105)
                .when()
                .get("http://localhost:8080/student/{id}")
                .then().statusCode(404);
    }
    @Test // delete above id
    public void verifyNewStudentInfoDeletedByID3() {
        given()
                .pathParam("id", 106)
                .when()
                .delete("http://localhost:8080/student/{id}")
                .then()
                .statusCode(204);
    }
    @Test
    public void verifyStudentInfoDeleted3() {
        given()
                .pathParam("id", 106)
                .when()
                .get("http://localhost:8080/student/{id}")
                .then().statusCode(404);
    }
    @Test // delete above id
    public void verifyNewStudentInfoDeletedByID4() {
        given()
                .pathParam("id", 107)
                .when()
                .delete("http://localhost:8080/student/{id}")
                .then()
                .statusCode(204);
    }
    @Test
    public void verifyStudentInfoDeleted4() {
        given()
                .pathParam("id", 107)
                .when()
                .get("http://localhost:8080/student/{id}")
                .then().statusCode(404);
    }
}

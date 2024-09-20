package org.example.api;

import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.apache.http.HttpStatus;
import org.example.api.models.Unicorn;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;


public class HomeWorkTests {

    @BeforeAll
    public static void setupTests() {
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
        RestAssured.baseURI = "https://crudcrud.com/api/6dd61bdca6e04ca3b84ff0ea908c2896";
    }

    @Test
    public void createUnicorn() {

        Unicorn unicorn = new Unicorn("asd", "Red");

        UnicornRequests.createUnicorn(unicorn.toJson());

    }

    @Test
    public void deleteUnicorn() {

        String id = UnicornRequests.createUnicorn("\n" + "{\n" + "  \"name\": \"asd\",\n" + "  \"tailColor\": \"Red\"\n" + "}");
        UnicornRequests.deleteUnicorn(id);

        given().get("/unicorn/" + id).then().assertThat().statusCode(HttpStatus.SC_NOT_FOUND);
    }

    @Test
    public void changeTailColor() {

        String id = UnicornRequests.createUnicorn("\n" + "{\n" + "  \"name\": \"asd\",\n" + "  \"tailColor\": \"Red\"\n" + "}");

        UnicornRequests.updateTailColor(id, "{\n" + "  \"tailColor\": \"Yellow\"\n" + "}");

        String tailColor = given().get("/unicorn/" + id).then().extract().path("tailColor");

        Assertions.assertEquals("Yellow", tailColor);
    }
}

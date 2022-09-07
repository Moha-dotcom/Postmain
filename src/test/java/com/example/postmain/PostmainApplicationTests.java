package com.example.postmain;

//import io.restassured.RestAssured;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.response.Response;
//import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;



@SpringBootTest
class PostmainApplicationTests {
    private static final Logger LOG = LoggerFactory.getLogger(PostmainApplication.class);


    @Test

    public void testUserClass() throws IOException {
//        String url = "http://localhost:8080/home/users";
//        String url1 = "http://localhost:8080/home/users/7";
//
//
//        String body = "{" +
//                "\"firstName\": \"Jack\", " +
//                "\"lastName\": \"Preacher\", " +
//                "\"username\": \"jacK923\", " +
//                "\"email\": \"jacK923@gmail.com\" }";
//
//
//
//        Response getRespose = RestAssured
//                .given()
//                .spec(getRequestSpecification())
//                .get(url)
//                .thenReturn();
//
//
////         Response postResponse = RestAssured.given().header("accept", "application/json")
////                .header("content-type", "application/json")
////                .body(body)
////                 .post(url)
////                 .andReturn();
////
//        assertEquals(getRespose.getStatusCode(), 200, "http status code");
//
//        LOG.info("response body => {}", getRespose.getBody().prettyPrint());
//
//
//
//    }
//
//
//    public RequestSpecification getRequestSpecification() {
//
//        LOG.info("Step - 1 : Create RequestSpecification using  RequestSpecBuilder ");
//        RequestSpecBuilder builder = new RequestSpecBuilder();
//
//        builder.setBaseUri ("http://localhost:8080/home/");
//        builder.setBasePath ("/users");
////        builder.addQueryParam("first_name", "John");
//
//        RequestSpecification requestSpec = builder.build();
//        return requestSpec;
    }
//






    }

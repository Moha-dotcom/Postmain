package com.example.postmain;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import static org.testng.Assert.assertEquals;

@SpringBootTest
class PostmainApplicationTests {
    private static final Logger LOG = LoggerFactory.getLogger(PostmainApplication.class);


//    @Test
//
//    public void fileUpload() throws IOException {
//        String url = "http://localhost:8080/home/users/upload";
//
//        File file = new File("user.json");
//
//
//
//        Response response = RestAssured
//                .given()
//                .multiPart("file", file)
//                .log().all()
//                .post(url)
//                .thenReturn();
//
//        assertEquals(response.getStatusCode(), 201, "http status code");
//
//        LOG.info("response body => {}", response.getBody().prettyPrint());
//
//
//
//    }







    }

package kr.ac.kopo.ctc.kopo36.board.controller;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SampleAssuredControllerTest {

    @LocalServerPort
    int port;

    @BeforeEach
    void setUp() {
        RestAssured.port = port;
        RestAssured.baseURI = "http://localhost";
    }

    @Test
    void testGetUserById() {
        given().pathParam("id", 4)
                .when()
                .get("/sample/selectOne?id={id}")
                .then()
                .statusCode(200)
                .body("id", equalTo(4))
                .body("title", equalTo("t1"));
    }
}

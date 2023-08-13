package ru.netology.rest1;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanTest {
    @Test
    void shouldTest() {
        // Given - When - Then
// Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .body("some data") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when()
                .post("/post")
//// Проверки
                .then()
                .statusCode(200)
                .body("data", equalTo("data"))
        ;
//        given()
//                .baseUri("https://postman-echo.com")
//                .contentType("text/plain; charset=UTF-8")
//                .body("дата")
//                .when()
//                .post("/post")
//                .then()
//                .statusCode(200)
//                .body("data", equalTo("дата"))
//        ;
    }
}



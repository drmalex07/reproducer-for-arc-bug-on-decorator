package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class FooResourceTest {

    @Test
    public void test1() {
        given()
          .when().get("/foo")
          .then()
             .statusCode(200)
             .body(is("Hello from RESTEasy Reactive"));
    }
    
    @Test
    public void test2() {
        given()
          .when()
          .param("id", "123")
          .get("/foo/find-by-id")
          .then()
             .statusCode(200);
    }

}
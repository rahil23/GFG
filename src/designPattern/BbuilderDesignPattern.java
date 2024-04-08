package designPattern;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.requestSpecification;

public class BbuilderDesignPattern {
    RequestSpecification spec;
    ResponseSpecification responseSpec;
    public RequestSpecification createRequestSecification(String contentType,String queryParam)
    {
      spec = new RequestSpecBuilder()
                .setBasePath("hi")
        .setContentType(contentType)
                .addQueryParam("param",queryParam)
                .build();
        return spec;
    }

   /* public void callAPi()
    {
       spec = createRequestSecification("application/json","123");
       given()
               .spec(requestSpecification)
               .when()
               .get("/posts")
               .then()
               .assertThat()
               .statusCode(200);
    }*/

}

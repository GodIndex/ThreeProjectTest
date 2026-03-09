package api;

import io.opentelemetry.api.internal.ApiUsageLogger;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.codehaus.groovy.tools.shell.util.Logger;
import org.json.JSONObject;
import org.junit.jupiter.api.*;
import specs.TypeCodeSpecs;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.*;
import static io.restassured.http.ContentType.JSON;

import static org.hamcrest.Matchers.*;



public class TypeCodeApiTr extends TypeCodeSpecs {


    @Tags(

            {@Tag("TYPECODEJSONPLACEHOLDER"), @Tag("API")}


    )
    @DisplayName("Post Body")
    @Test

    void TypeCodeBodyPost()
    {

        JSONObject requestBody = new JSONObject();

        requestBody.put("title", "JSONObject");
        requestBody.put("body", "Body create post");
        requestBody.put("userId", 4630118);


         given(GoTypeCodeSpec)
                .contentType(JSON) /// Указываем, что отправляем JSON
                .body(requestBody.toString())/// Передаем тело запроса как строку (toString()), полученную из JSONObject


                .when()
                .post(baseURI)


                .then()
                .statusCode(201)///  201 = Created
                .log().status()
                .body("userId", equalTo(4630118));


    }




    @Disabled
    @DisplayName("PUT")
    @Test
    void TypeCodePut() {

        JSONObject putRequestBody = new JSONObject();
        /*.*/
        putRequestBody.put("title", "Storm");
        putRequestBody.put("userId", 1234);
        putRequestBody.put("body", "valid");
        /*.*/


        given(GoTypeCodeSpec)

                .body(putRequestBody)
                .when()
                .put("https://jsonplaceholder.typicode.com/posts/1")
                .then()
                .log().body();


    }
    @Disabled
    @Test
    void GetPost() {
        given(GoTypeCodeSpec)
                .when()
                .get("https://jsonplaceholder.typicode.com/posts/1")
                .then()
                .log().all();

    }



}

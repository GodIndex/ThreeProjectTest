package api;

import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import specs.TypeCodeSpecs;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class TypeCodeApiTr extends TypeCodeSpecs {


    @DisplayName("Запрос с указанным body")
    @Test

    void TypeCodeBodyPost()
    {

        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "First JSONObject");
        requestBody.put("body", "Body create post");
        requestBody.put("userId", 3322);



        given(GoTypeCodeSpec)
                .contentType(ContentType.JSON) /// Указываем, что отправляем JSON
                .body(requestBody.toString()) /// Передаем тело запроса как строку (toString()), полученную из JSONObject
                .when()
                .post(baseURI)
                .then()
                .statusCode(201) ///  201 = Created
                .log().status()
                .body("userId", equalTo(3322));





    }



}

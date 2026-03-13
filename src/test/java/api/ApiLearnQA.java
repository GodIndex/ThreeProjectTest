package api;

import org.json.JSONObject;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.http.ContentType.JSON;
import static org.hamcrest.Matchers.is;

public class ApiLearnQA {



    @BeforeAll
    public static void SetUpaLearnAPI() {

        String userId = "156605";
        baseURI = "https://playground.learnqa.ru/api/user/" + userId;

    }



@Test
    public void APILearnTests() {


        /// Место для post создания


              given()
                      .when()
                      .contentType(JSON)
                      .get(baseURI)
                      .then().log().body()

                      .body("username", is("HatreDS"));


                /// .extract(): Позволяет извлечь что-то из ответа (например, тело, заголовок, статус-код).
                /// .body(): Указывает, что мы хотим извлечь тело ответа.
                /// .as(UserResponse.class): Rest Assured преобразует JSON-тело ответа в объект типа UserResponse.
                /// Он ищет поля в JSON, чьи имена совпадают с именами полей в POJO (или их геттерами/сеттерами).



    }
}










package specs;

import io.qameta.allure.Allure;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.BeforeAll;

import static io.restassured.RestAssured.filters;
import static io.restassured.RestAssured.with;

public class SpecsHhApiGo {

    @BeforeAll
    public static void SetUpAPI() {
        RestAssured.baseURI = "https://api.hh.ru/employers";
    }

    ///  Спецификации к апи тесту

 public static RequestSpecification RequestGoTestSpec = with()

         .contentType(ContentType.JSON)
         .queryParam("only_with_vacancies", true)
         .queryParam("text", "QA")
         .queryParam("per_page", 6);

}


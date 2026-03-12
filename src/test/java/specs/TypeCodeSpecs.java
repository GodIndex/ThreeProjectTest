package specs;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.junit.jupiter.api.BeforeAll;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.with;
import static io.restassured.http.ContentType.JSON;

public class TypeCodeSpecs {

    @BeforeAll
    public static void SetUpTypeCodeAPI() {

        baseURI = "https://jsonplaceholder.typicode.com/posts/";

    }



    public static RequestSpecification GoTypeCodeSpec = with()


            .log().uri()
            .log().body()
            .log().headers()
            .contentType(JSON);
}





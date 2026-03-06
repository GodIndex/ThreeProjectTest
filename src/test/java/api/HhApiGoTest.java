package api;

import org.junit.jupiter.api.*;
import specs.SpecsHhApiGo;

import static io.opentelemetry.api.internal.ApiUsageLogger.log;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static specs.SpecsHhApiGo.RequestGoTestSpec;


public class HhApiGoTest extends SpecsHhApiGo {


    private final static int StaticNumberPerPage = 6;
    private final static String FirstIdCompany = "8881860";


    @Disabled
    @Test
    public void InfoEmployers() {

          given(RequestGoTestSpec) /// 1 /// Подготовка и одновременно начало синтаксиса теста (инициализация начального состояния системы)
                /// Передать header, body и другие параметры (валидные) для теста



                   .when() /// 2 /// Выполнение HTTP-запроса (GET, POST, PUT, DELETE и т.д.)

                .log().uri() /// Аннотация логирования (all, status, body, uri)
                .get(baseURI)


                   .then() /// 3 /// Описывает ожидаемый результат или проверки
                ///  Верификация ответа и проверки статус-кода ответа, тела ответа, заголовков

                .log().status()
                .body("per_page" , is(StaticNumberPerPage))
                   .body("page", is(0))
                   .body("logo_urls", not(hasItem(true))).body("logo_urls", not(hasItem(false)))
                   .body("name", not(hasItem(true))).body("name", not(hasItem(false)))
                   .body("items[1].name", is("Ecom.tech"))
                   .body("items[0].id", is(FirstIdCompany))
                   .statusCode(200)

                  .log().headers()
                  .log().body();











    }

}




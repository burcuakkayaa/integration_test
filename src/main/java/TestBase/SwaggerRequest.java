package TestBase;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import utils.Constant;

public class SwaggerRequest {


    public RequestSpecification getRequest() {

        return RestAssured.given().contentType("application/json").baseUri(Constant.endpoint + "/api/swagger.json");
    }
}

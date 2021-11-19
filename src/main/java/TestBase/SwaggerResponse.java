package TestBase;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class SwaggerResponse {

    public Response getResponse(RequestSpecification requestSpecification) {

        return requestSpecification.get();
    }
}

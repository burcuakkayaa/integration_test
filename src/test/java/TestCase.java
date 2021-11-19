import TestBase.SwaggerRequest;
import TestBase.SwaggerResponse;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class TestCase {

    private SwaggerRequest swaggerRequest = new SwaggerRequest();
    private SwaggerResponse swaggerResponse = new SwaggerResponse();

    @Test
    public void integrationTest() {

        Response response = swaggerResponse.getResponse(swaggerRequest.getRequest());

        response.prettyPrint();

        response.then().assertThat().statusCode(200);

    }
}

package stepDefinitions;

import Resources.ApiResources;
import Resources.TestDataBuild;
import Resources.Utils;
import io.cucumber.java.en.Given;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import java.io.IOException;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Warehousedefinition extends Utils {
	
	RequestSpecification res;
	Response response;
	static String warehouse_id;
	TestDataBuild data = new TestDataBuild();
	
	
	@Given("Add warehouse payload")
	public void add_warehouse_payload() throws IOException {
	    res = given().spec(requestSpecification());
	}
	@When("user calls {string} with the {string} http request")
	public void user_calls_with_the_http_request(String resource, String method) {
		ApiResources resourceApi = ApiResources.valueOf(resource);
		if(method.equalsIgnoreCase("post")) {
		response = res.body(data.addWarehousePayload())
				.when()
				.post(resourceApi.getResource())
				.then().spec(responseSpecification()).extract().response();
		warehouse_id = getJsonPath(response, "id");
		}
		if(method.equalsIgnoreCase("get")) {
			response = res.param("id", warehouse_id).when().get(resourceApi.getResource());
		}
		
	}
	@Then("API call is success with status code {int}")
	public void api_call_is_success_with_status_code(Integer statuscode) {
		assertEquals(response.getStatusCode(), (int)statuscode);
	}

}

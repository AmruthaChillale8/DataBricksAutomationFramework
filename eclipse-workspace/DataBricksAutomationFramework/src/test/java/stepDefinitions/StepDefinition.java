package stepDefinitions;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import java.io.IOException;
import Resources.ApiResources;
import Resources.TestDataBuild;
import Resources.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class StepDefinition extends Utils {
	
	RequestSpecification res;
	Response response;
	TestDataBuild data = new TestDataBuild();
	static String tokenid;
	
	
	@Given("Add token payload")
	public void add_token_payload() throws IOException {
		res = given().spec(requestSpecification());
		
	}
	@When("user calls {string} with {string} http request")
	public void user_calls_with_http_request(String resource, String method) throws IOException {
		ApiResources resourceApi = ApiResources.valueOf(resource);
		if(method.equalsIgnoreCase("post")) {
		response = res.body(data.addTokenPayload())
				.when()
				.post(resourceApi.getResource())
				.then().spec(responseSpecification()).extract().response();
		tokenid = getJsonPath(response, "token_info.token_id");
		
		}
		if(method.equalsIgnoreCase("get")) {
			res.when().get(resourceApi.getResource());
		}
		if(method.equalsIgnoreCase("delete")) {
			
			 res.body("{ \"token_id\": \""+tokenid+"\" }").when().post(resourceApi.getResource());
		}
	}
	
	
	@Then("the API call is success with status code {int}")
	public void the_api_call_is_success_with_status_code(Integer statuscode) {
	  assertEquals(response.getStatusCode(), (int)statuscode);
	}
	


}

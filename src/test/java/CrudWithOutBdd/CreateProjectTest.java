package CrudWithoutBdd;

import org.json.simple.JSONObject;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateProjectTest {
	
	@Test
	
	public void CreateProjectTest()
	{
		
		//Step 1: Create pre conditions
		JSONObject jObj= new JSONObject();
		jObj.put("createdBy", "Raghu-RD");
		jObj.put("projectName", "Amdocs");
		jObj.put("status", "Created");
		jObj.put("teamSize", 10);
		
		RequestSpecification req = RestAssured.given();
		req.body(jObj);
		req.contentType(ContentType.JSON);
		
		//Step 2: execute action
		Response resp = req.post("http://localhost:8084/addProject");
		
		//Step 3: Validate the response
		ValidatableResponse validate = resp.then();
		validate.log().all();
		

	}

}

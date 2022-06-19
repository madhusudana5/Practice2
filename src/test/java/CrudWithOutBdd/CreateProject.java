package CrudWithOutBdd;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateProject
{
	@Test
	public void  createProjectTest()
	{
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "ARM");
		jobj.put("projectName", "Amdocs");
		jobj.put("status", "Ongoing");
		jobj.put("teamSize", 18);
		
		RequestSpecification req = RestAssured.given();
		req.body(jobj);
		req.contentType(ContentType.JSON);
		
		Response resp = req.post("http://localhost:8084/addProject");
		
		ValidatableResponse validate = resp.then();
		validate.log().all();
		
		
	}	
}

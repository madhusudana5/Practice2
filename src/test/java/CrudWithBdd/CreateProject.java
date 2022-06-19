package CrudWithBdd;

import static org.junit.Assert.assertThat;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProject 
{
	@Test
	public void  createProjectTest()
	{
	
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "ARM1");
		jobj.put("projectName", "Amdocs1");
		jobj.put("status", "Created");
		jobj.put("teamSize", 18);
		
		//Preconditions
		given()
		.body(jobj)
		.contentType(ContentType.JSON)
		
		//Actions
		.when()
		.post("http://localhost:8084/addProject")
		
		//Validations
		.then()
		.assertThat().statusCode(201)
		.log().all();
		
		
	}		
		
}

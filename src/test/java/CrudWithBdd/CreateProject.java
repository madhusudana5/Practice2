package CrudWithBdd;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProject {

	@Test
	
	public void CreateProjectTest()
	{
		JSONObject jObj= new JSONObject();
		jObj.put("createdBy", "Raghu-RD");
		jObj.put("projectName", "Infosys");
		jObj.put("status", "Created");
		jObj.put("teamSize", 10);
		
		given()  //pre-conditions
		.body(jObj)
		.contentType(ContentType.JSON)
		
		.when()  //actions
		.post("http://localhost:8084/addProject")
		
		.then()  //validataion
		.assertThat().statusCode(201)
		.log().all();
		
	}

}

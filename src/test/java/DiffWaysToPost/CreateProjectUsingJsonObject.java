package DiffWaysToPost;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class CreateProjectUsingJsonObject {
	
	@Test
	
	public void CreateProjectUsingJsonObjectTest()
	{
		JSONObject jObj= new JSONObject();
		jObj.put("createdBy", "Raghu-RD");
		jObj.put("projectName", "Wipro");
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

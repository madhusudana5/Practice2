package CrudWithoutBdd;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class UpdateProject {
	
	@Test
	
	 public void updateProjectTest()
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
		
		req.put("http://localhost:8084/Project/TY_PROJ_812");
		req.then().log().all();
	 }

}

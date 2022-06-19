package CrudWithBdd;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class UpdateProject {
	
	@Test
	
	public void UpdateProjectRest()
	{
		
		
		baseURI = "http://localhost:8084";
		
		Random ran = new Random();
		int randomnum = ran.nextInt(500);
	
		JSONObject jObj= new JSONObject();
		jObj.put("createdBy", "Raghu-RD");
		jObj.put("projectName", "Infosys");
		jObj.put("status", "Created");
		jObj.put("teamSize", 10);
		
		given()   //pre-conditions
		.body(jObj)
		.contentType(ContentType.JSON)
		
		.when()  //actions
		.put("/projects/TY_PROJ_812" +randomnum)
		
		.then()  //validataion
		.assertThat().statusCode(200)
		.log().all();
	}

}

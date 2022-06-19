package DiffWaysToPost;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import pojoclass.ProjectLibrary;

import static io.restassured.RestAssured.*;

public class CreateProjectUsingpojo {
	
	@Test
	
	public void CreateProjectUsingpojoTest()
	{
		
		baseURI = "http://localhost:8084";
		
		//create data
		ProjectLibrary pLib = new ProjectLibrary("King","RCB", "created", 18);
		given()  //pre-conditions
		.body(pLib)
		.contentType(ContentType.JSON)
		
		.when()  //actions
		.post("/addProject")
		
		.then()  //validataion
		.assertThat().statusCode(201)
		.log().all();
	}

}

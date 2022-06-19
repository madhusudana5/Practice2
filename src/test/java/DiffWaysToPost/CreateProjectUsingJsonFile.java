package DiffWaysToPost;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class CreateProjectUsingJsonFile {
	
	@Test
	
	public void CreateProjectUsingJsonFileTest()
	{
		baseURI = "http://localhost:8084";
		
		//create data
		File file = new File(".\\requestbody.json");
		
		given()  //pre-conditions
		.body(file)
		.contentType(ContentType.JSON)
		
		.when()
		.post("/addProject")
		
		.then()
		.assertThat().statusCode(201)
		.log().all();
	}

}

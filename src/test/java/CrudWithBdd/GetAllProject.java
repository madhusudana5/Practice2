package CrudWithBdd;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class GetAllProject {
	
	@Test
	
	public void GetAllProjectTest()
	{
		baseURI = "http://localhost:8084";
		
		when()  //actions
		.get("/projects")
		
		.then()  //validataion
		.assertThat().statusCode(200)
		.assertThat().contentType(ContentType.JSON)
		.log().all();		
	}

}

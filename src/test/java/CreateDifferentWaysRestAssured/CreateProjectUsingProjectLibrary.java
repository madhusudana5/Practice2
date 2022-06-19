package CreateDifferentWaysRestAssured;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import PojoClass.ProjectLibrary;
import io.restassured.http.ContentType;

public class CreateProjectUsingProjectLibrary 
{
@Test
public void createProjectUsingProjectLibrary()
{
	baseURI = "http://localhost";
	 port = 8084;	
	 
	 //Creat Data
	ProjectLibrary pl = new ProjectLibrary("ARM567", "Bosh891", "Created", 20);
	
	 //Preconditions
		given()
		.body(pl)
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

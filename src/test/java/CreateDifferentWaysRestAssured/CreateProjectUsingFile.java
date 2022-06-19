package CreateDifferentWaysRestAssured;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;

public class CreateProjectUsingFile
{
@Test
public void CreateProjectUsingFile()
{
	baseURI = "http://localhost";
	 port = 8084;
	 
	 //Create a data
	 File fle = new File(".\\requestData.jason");
	 
	       //Preconditions
			given()
			.body(fle)
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

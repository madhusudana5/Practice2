package CreateDifferentWaysRestAssured;

import java.util.HashMap;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class CreateProjectUsingHashmap
{@Test
public void createProjectUsingHashmap()
{
		baseURI = "http://localhost";
		 port = 8084;
		 
	//Creat data
  HashMap map = new HashMap();
  map.put("createdBy", "ARM789");
  map.put("projectName", "Amdocs879");
  map.put("status", "Ongoing");
  map.put("teamSize", 18);
  
  //Preconditions
	given()
	.body(map)
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

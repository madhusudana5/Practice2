package RequestChaining;

import org.testng.annotations.Test;

import GenericUtility.JavaUtility;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import pojoclass.ProjectLibrary;

public class CreateProjectAndGetProject
{
  @Test
  public void createProjectAndGetProjectTest()
  {
	  baseURI = "http://localhost:8084";
	  
	  JavaUtility jlib = new JavaUtility();
	  
	  ProjectLibrary plib = new ProjectLibrary("madhusudana", "Accenture", "Created", 20);
	  
	  //Step 2 : Capture the response
	  Response resp = given()
			           .body(plib)
			           .contentType(ContentType.JSON)
			           .when()
			           .post("/addProject");
	  
	  //Step 3 : Store that responsible in a variable
	  String proid = resp.jsonPath().get("projectId");
	  System.out.println(proid);
	  
	  //Step 4 : use the response variable in another request - get()
	  given()
	  .pathParam("pid", proid)
	  .when()
	  .get("/projects/{pid}")
	  .then()
	  .assertThat().statusCode(200).log().all();
	  
	  //Step 5 : Delete the same project - delete()
	  when()
	   .delete("/projects/"+proid)
	   .then().assertThat().statusCode(204).log().all();
  }
  
}

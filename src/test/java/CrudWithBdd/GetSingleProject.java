package CrudWithBdd;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;

public class GetSingleProject
{
	public void getSingleProject()
	{
	 baseURI = "http://localhost";
	 port = 8084;
	 
	 when()
	  .get("projects/TY_PROJ_809")
	  
	 .then()
	   .assertThat().statusCode(200)
	   .assertThat().contentType(ContentType.JSON)
	 .log().all();
	 
	}
}

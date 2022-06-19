package CrudWithBdd;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class GetallProjectTest
{
@Test
public void getallProjectTest()
{

	 baseURI = "http://localhost";
	 port = 8084;
	 
	 when()
	  .get("projects")
	  
	 .then()
	   .assertThat().statusCode(200)
	   .assertThat().contentType(ContentType.JSON)
	 .log().all();
	 
	}

}

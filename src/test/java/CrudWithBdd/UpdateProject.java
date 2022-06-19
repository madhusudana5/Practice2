package CrudWithBdd;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class UpdateProject
{
@Test
public void updateProject()
{
	baseURI = "http://localhost";
	 port = 8084;
	 
	 Random ran = new Random();
	 int ramint = ran.nextInt();
	 
	 JSONObject jobj = new JSONObject();
		jobj.put("projectName", "ARM" +ramint);
		
		
		given()
		.body(jobj)
		.contentType(ContentType.JSON)
		
		.when()
		 .put("projects/TY_PROJ_809")
		 
		 .then()
		 .assertThat().statusCode(200)
		 .log().all();
}
}

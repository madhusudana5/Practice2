package CrudWithBdd;

<<<<<<< HEAD
import static org.junit.Assert.assertThat;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProject 
{
	@Test
	public void  createProjectTest()
	{
	
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "ARM1");
		jobj.put("projectName", "Amdocs1");
		jobj.put("status", "Created");
		jobj.put("teamSize", 18);
		
		//Preconditions
		given()
		.body(jobj)
		.contentType(ContentType.JSON)
		
		//Actions
		.when()
		.post("http://localhost:8084/addProject")
		
		//Validations
		.then()
		.assertThat().statusCode(201)
		.log().all();
		
		
	}		
		
=======
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProject {

	@Test
	
	public void CreateProjectTest()
	{
		JSONObject jObj= new JSONObject();
		jObj.put("createdBy", "Raghu-RD");
		jObj.put("projectName", "Infosys");
		jObj.put("status", "Created");
		jObj.put("teamSize", 10);
		
		given()  //pre-conditions
		.body(jObj)
		.contentType(ContentType.JSON)
		
		.when()  //actions
		.post("http://localhost:8084/addProject")
		
		.then()  //validataion
		.assertThat().statusCode(201)
		.log().all();
		
	}

>>>>>>> branch 'master' of https://github.com/madhusudana5/Practice2.git
}

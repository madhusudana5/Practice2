package CrudWithoutBdd;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetAllProject {

	@Test
	
	public void GetAllProjectTest()
	{
		  Response resp = RestAssured.get("http://localhost:8084/projects");
		  resp.then().log().all();
	}
}

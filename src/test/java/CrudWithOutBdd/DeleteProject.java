package CrudWithoutBdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteProject {

	@Test
	
	public void DeleteProjectTest()
	{
		Response req = RestAssured.delete("http://localhost:8084/Project/TY_PROJ_812");
		req.then().log().all();
		
	}
}

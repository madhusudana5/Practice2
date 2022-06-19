package CrudWithOutBdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetAllProjectTest 
{
@Test
public void getAllProjectTest()
{
	Response resp = RestAssured.get("http://localhost:8084/projects");
	resp.then().log().all();
	}


}

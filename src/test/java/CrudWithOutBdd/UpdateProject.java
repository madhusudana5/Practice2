package CrudWithOutBdd;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateProject
{
	@Test
	public void  UpdateProject()
	{
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "ARM");
		jobj.put("projectName", "Amdocs");
		jobj.put("status", "Ongoing");
		jobj.put("teamSize", 18);
		
		RequestSpecification req = RestAssured.given();
		req.body(jobj);
		req.contentType(ContentType.JSON);
		
		Response resp = req.put("http://localhost:8084/projects/TY_PROJ_809");
		resp.then().log().all();
}
}

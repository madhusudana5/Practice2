package CrudWithOutBdd;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteProjects
{
	public void DeleteProjects()
	{
		Response resp = RestAssured.delete("http://localhost:8084/projects/TY_PROJ_809");
		resp.then().log().all();
		System.out.println(resp.getStatusCode());
		System.out.println(resp.getContentType());
		System.out.println(resp.getTime());
		System.out.println(resp.getSessionId());
	}
}

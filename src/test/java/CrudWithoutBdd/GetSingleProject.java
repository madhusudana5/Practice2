package CrudWithoutBdd;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class GetSingleProject {
	
	@Test
	
	public void GetSingleProjectTest()
	{
		String expdata = "Raghu";
		Response resp = RestAssured.get("http://localhost:8084/projects/TY_PROJ_812");
		resp.then().log().all();
		String actdata = resp.jsonPath().get("createdBy");
		Assert.assertEquals(expdata, actdata);
		
	}

}

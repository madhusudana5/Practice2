package ResponseValidation;

import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class StaticResponse {
	
	@Test
	
	public void StaticResponseTest()
	{
		baseURI = "http://localhost:8084";
		
		String expdata = "TY_PROJ_1003";
		
		//step 2: create the request
		
		Response resp = when()
				.get("./projects");
		
		//Step 3: validate the response
		
		String actdata = resp.jsonPath().get("[2].projectId");
		System.out.println(actdata);
		
		
		Assert.assertEquals(expdata, actdata);
		
		resp.then().log().all();				  			
	}
}

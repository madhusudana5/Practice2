package ResponseValidation;

import static io.restassured.RestAssured.*;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.response.Response;

	public class DynamicResponse {

	@Test

	public void DynamicResponseTest() 
	{
		baseURI = "http://localhost:8084";
		
		String expdata = "TY_PROJ_1003";
		
		//create request
		Response resp = when()
				.get("./projects");
		
		//capture the response
		boolean flag = false;
		
		List<String> list = resp.jsonPath().get("projectId");
		for(String actdata:list)
		{
			if(actdata.equals(expdata))
			{
				System.out.println(actdata);
				flag = true; //flag rising
				break;
			}
		}
		if(flag)
		{
			resp.then().log().all();
		}
		else
		{
			System.out.println("No data matching");
		}
	}
}
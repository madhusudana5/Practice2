package CrudWithOutBdd;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetSingleProject
{
@Test
public void getSingleProject()
{
	String expdata = "ARM";
	
	Response resp = RestAssured.get("http://localhost:8084/projects/datamegeena24");
	resp.then().log().all();
	
	 String actdata = resp.jsonPath().get("createdBy");
	 System.out.println(actdata);
	 
	 Assert.assertEquals(expdata, actdata);
	 
}



}

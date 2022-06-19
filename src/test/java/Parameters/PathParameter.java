package Parameters;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;


public class PathParameter
{
	
     @Test
	
    public void PathParameterTest()
	{
		baseURI = "http://localhost:8084";
		
		given()
		.pathParam("pid", "TY_PROJ_812")
		
		.when()
		.get("/Projects/{pid}")
		
		.then().log().all();
		
	}

}

package CrudWithBdd;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class GetSingleProject {
	
	@Test
	
	public void GetSingleProjectTest()
	{
		baseURI = "http://localhost:8084";
			
		when()  //actions
		.get("/projects/TY_PROJ_812")
		
		.then()  //validataion
		.assertThat().statusCode(200)
		.log().all();
	}

}

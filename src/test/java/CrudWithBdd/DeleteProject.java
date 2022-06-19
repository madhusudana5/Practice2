package CrudWithBdd;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class DeleteProject {
	
	@Test
	
	public void DeleteProjectTest()
	{
		baseURI = "http://localhost:8084";
			
		when()  //actions
		.delete("/projects/TY_PROJ_812")
		
		.then()  //validataion
		.assertThat().statusCode(204)
		.log().all();
	}
	

}

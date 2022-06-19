package Parameters;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class FormParameter {
	
	@Test
	
	public void FormParameterTest()
	{
		
		given()
			.formParam("createdBy", "maxi")
			.formParam("projectName", "TYSS123")
			.formParam("status", "on Going")
			.formParam("teamSize", 455)
		.when()
			.post("http://localhost:8084/addProject")
			.then().assertThat().statusCode(201).log().all();
	}

}

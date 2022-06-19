package ResponseValidation;

import static io.restassured.RestAssured.*;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import GenericUtility.JavaUtility;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojoclass.ProjectLibrary;

public class ResponseTimeValidation {
	
	@Test
	
	public void ResponseTimeValidationTest()
	{
		baseURI = "http://localhost:8084";
		
		JavaUtility jLib = new JavaUtility();
		
		//create data
		ProjectLibrary pLib = new ProjectLibrary("ABD", "xylem-"+jLib.getrandomnum(), "completed", 45);
		
		Response resp = given()
				.body(pLib)
				.contentType(ContentType.JSON)
		
		.when()
		 .post("/addProject");
		
		System.out.println(resp.getTime());
		
		resp.then().assertThat().time(Matchers.lessThan(1000L));	
	}

}

package DiffWaysToPost;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class CreateProjectUsingMap {
	
	@Test
	
	public void CreateProjectUsingMapTest()
	{
		baseURI = "http://localhost:8084";
		
		// Hashmap map = new Hashmap;
		// map.put("name", "Raghu");
		// map.put("id", "TY123");
		
		
		//create data
		HashMap map = new HashMap();
		map.put("createdBy", "Raghuu");
		map.put("projectName", "TCS");
		map.put("status", "ongoing");
		map.put("teamSize", "34");
		
		given()  //pre-conditions
		.body(map)
		.contentType(ContentType.JSON)
		
		.when()  //actions
		.post("/addProject")
		
		.then()  //validataion
		.assertThat().statusCode(201)
		.log().all();
	}

}

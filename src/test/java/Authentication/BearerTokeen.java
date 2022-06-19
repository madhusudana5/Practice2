package Authentication;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class BearerTokeen 
{
	@Test
	public void bearerTokeenTest()
	{
		//ghp_9CG9yDHiIVeTvpZI54FiPh3k9nyZbo0etMCk
		//baseuri : https://api.github.com
		//endpoint : /user/repos
		//http method used - post()
		
		baseURI = "http://localhost:8084";
		
		JSONObject jobj = new JSONObject();
		jobj.put("name", "SDET34BearerRest");
		
		given()
		 .body(jobj)
		 .auth()
		 .oauth2("ghp_9CG9yDHiIVeTvpZI54FiPh3k9nyZbo0etMCk")
		 
		  .when()
		  .post("/user/repos")
		  
		  .then()
		    .assertThat().statusCode(201)
		    .log().all();
		
		
	}
	
	

}

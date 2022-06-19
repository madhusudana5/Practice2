package Authentication;

import static io.restassured.RestAssured.baseURI;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class Oauth2Authentication 
{
	@Test
	public void Oauth2Authentication()
	{

	//Client ID:	SDET-34B9
	//Client Secret	:e0ce9132a6890f1b2b3b263579f41c9b
	//Redirect URI:	http://govindayanamaha.com
	//authentication:	http://coop.apps.symfonycasts.com/token
		
		baseURI = "http://coop.apps.symfonycasts.com";
		
	    Response resp = given()
			.formParam("client_id", "SDET-34B9")
			.formParam("client_secret", "e0ce9132a6890f1b2b3b263579f41c9b")
			.formParam("grant_type", "client_credentials")
			.formParam("redirect_uri ", "http://govindayanamaha.com")
			.formParam("code", "authorization code")
			.when()
			.post("/token");
	    
	    resp.then().log().all();//---> result--->access_token
	
	String token = resp.jsonPath().get("access_token");
	System.out.println(token);
	
	//Stage 2 : Utilize the access token
	//Endpoint - /api/{USER_ID}/eggs-count -> to collect the eggs
	
	given()
	  .auth()
	  .oauth2(token)
	  .pathParam("User Id", 3453)
	  .when()
	    .post("/api/{USER_ID}/eggs-count")
	    .then()
	    .log().all();
	
	}
}

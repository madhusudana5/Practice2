package RsponseValiation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PojoClass.ProjectLibrary;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ResponseTimeValidation 
{

	@Test
	public void responseTimeValidationTest()
	{
		baseURI = "http://localhost";
		port = 8084;	
		
		String expData = "datamegeena342";
		
		//Step 2 : Execute the request
	      Response resp = when()
		   .get("/projects");
	      
	     //Steep 3 :Validate the response
	      String actData = resp.jsonPath().get("[1].projectId");
	      System.out.println(actData);
	      
	      Assert.assertEquals(expData,actData);
	      
	      resp.then().log().all();
		 
		}

	}	 
	
	


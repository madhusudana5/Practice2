package serializationdeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoclass.EmployeeDetails;

public class Deserialization {
	
	@Test
	
	public void DeserializationTest() throws JsonParseException, JsonMappingException, IOException
	{
		
		//Step 1: Create a object of ObjectMapper
		ObjectMapper omap = new ObjectMapper();
		
		//Step 2: Read the value from file using readvalue()
		EmployeeDetails emp = omap.readValue(new File("./file.json"), EmployeeDetails.class);
		
		//Step 3: Access the value using getters
		System.out.println(emp.getEname());
		System.out.println(emp.getEid());
		System.out.println(emp.getPhoneno());
		System.out.println(emp.getEmail());
	}

}

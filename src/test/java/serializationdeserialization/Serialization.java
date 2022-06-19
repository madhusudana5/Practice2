package serializationdeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoclass.EmployeeDetails;

public class Serialization {
	
	@Test
	
	public void SerializationTest() throws JsonGenerationException, JsonMappingException, IOException
	{
		
		//Step 1: Create a object for pojo class
		EmployeeDetails pobj = new EmployeeDetails("Raghu", "ty333", 7019, "rag@ty.in");
		
		//step 2: Create a object for mapper class
		ObjectMapper omap = new ObjectMapper();
		
		//Step 3: Use Writevalue method
		omap.writeValue(new File("./file.json"), pobj);
	}
}

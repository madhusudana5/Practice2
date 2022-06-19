package serializationdeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoclass.EmployeeDetailswithArray;

public class SerializationWithArray {
	
	@Test
	
	public void SerializationWithArrayTest() throws JsonGenerationException, JsonMappingException, IOException {
		
		int[] phoneno = {1234,2345};
		String[] email = {"raghu@ty.in","vk@ty.in"};
	 
		//Step 1: Create a object for pojo class
		EmployeeDetailswithArray emp =new EmployeeDetailswithArray("virat","Rcb18", phoneno, email);
		
		//step 2: Create a object for mapper class
		ObjectMapper omap = new ObjectMapper();
		
		//Step 3: Use Writevalue method
		omap.writeValue(new File("./employeedetailsarray.json"), emp);
	}

}

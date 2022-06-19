package serializationdeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoclass.EmployeeDetailswithObject;
import pojoclass.Spouse;

public class SerializationWithObject {
	
	@Test
	
	public void SerializationWithObjectTest() throws JsonGenerationException, JsonMappingException, IOException
	{
		int[]  phonenum = {1234, 765};
		Spouse sp = new Spouse("Deepika", "Accenture", 5432);
		
		//step 1: create obj of pojo
		EmployeeDetailswithObject emp = new EmployeeDetailswithObject("RD", "TY123", phonenum, sp);
		
		//step 2: create obj of object mapper
		ObjectMapper map = new ObjectMapper();
		
		//step 3: write values into json file
		map.writeValue(new File("./empdetailswithobj.json"), emp);
	}

}

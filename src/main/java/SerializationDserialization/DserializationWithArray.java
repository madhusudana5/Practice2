package SerializationDserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoClass.EmployDetailsWithArray;
import PojoClass.EmployeeDetails;

public class DserializationWithArray 
{
	@Test
	public void deserializationWithArrayTest() throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper omp = new ObjectMapper();
		EmployDetailsWithArray emp = omp.readValue(new File("./emp.json"),EmployDetailsWithArray.class);
		
		System.out.println(emp.geteName());
		System.out.println(emp.geteId());
		System.out.println(emp.getePhone());
		System.out.println(emp.getEmail());
	}
	}



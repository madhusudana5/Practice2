package SerializationDserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoClass.EmployDetailsWithArray;
import PojoClass.EmployeeDetails;

public class SerializatonWithArray 
{
	@Test
	public void seerializationWithArrayTest() throws JsonGenerationException, JsonMappingException, IOException 
	{
		int [] ePhone= {1234,5678};
		
		
		EmployDetailsWithArray emp = new EmployDetailsWithArray("madhusudana", "TY123", ePhone, "arm@gmail.com");
		ObjectMapper om = new ObjectMapper();
		om.writeValue(new File("./emp.json"),emp);

	}
	}



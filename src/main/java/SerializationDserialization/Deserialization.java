package SerializationDserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoClass.EmployeeDetails;

public class Deserialization
{
@Test
public void deserializationTest() throws JsonParseException, JsonMappingException, IOException
{
	ObjectMapper omp = new ObjectMapper();
	EmployeeDetails emp = omp.readValue(new File("./emp.json"),EmployeeDetails.class);
	
	System.out.println(emp.geteName());
	System.out.println(emp.geteId());
	System.out.println(emp.getePhone());
	System.out.println(emp.getEmail());
}
}

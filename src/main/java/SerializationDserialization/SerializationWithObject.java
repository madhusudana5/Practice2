package SerializationDserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoClass.EmployDetailsWithArray;
import PojoClass.EmployeeDetailsWithObject;
import PojoClass.Spouse;

public class SerializationWithObject 
{
	@Test
	public void seerializationWithObjectTest() throws JsonGenerationException, JsonMappingException, IOException 
	{
		
		
		
		EmployeeDetailsWithObject eobj = new EmployeeDetailsWithObject("madhusudana","TY123", 1234, "arm.gmail.com");
		ObjectMapper om1 = new ObjectMapper();
		om1.writeValue(new File("./emp.json"),eobj);
		
		Spouse sp=new Spouse("abcd","TY456",1234789);
		ObjectMapper om2 = new ObjectMapper();
		om2.writeValue(new File("./sp.json"),eobj);
		

	}
}

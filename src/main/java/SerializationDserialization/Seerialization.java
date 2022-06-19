package SerializationDserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoClass.EmployeeDetails;

public class Seerialization
{
@Test
public void seerializationTest() throws JsonGenerationException, JsonMappingException, IOException 
{
	EmployeeDetails emp = new EmployeeDetails("madhusudana", "TY123", 1234, "madhu123@gmail");
	ObjectMapper om = new ObjectMapper();
	om.writeValue(new File("./emp.json"),emp);

}
}

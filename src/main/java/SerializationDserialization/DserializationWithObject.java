package SerializationDserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoClass.EmployDetailsWithArray;
import PojoClass.EmployeeDetailsWithObject;
import PojoClass.Spouse;

public class DserializationWithObject
{
	@Test
	public void deserializationWithObjectTest() throws JsonParseException, JsonMappingException, IOException
	{
	ObjectMapper omp = new ObjectMapper();
	EmployeeDetailsWithObject emp1 = omp.readValue(new File("./emp.json"),EmployeeDetailsWithObject.class);
	Spouse sp1 =omp.readValue(new File("./sp.json"),Spouse.class);;
	
	
	System.out.println(emp1.geteName());
	System.out.println(emp1.geteId());
	System.out.println(emp1.getePhone());
	System.out.println(emp1.getEmail());
	
	System.out.println(sp1.geteName());
	System.out.println(sp1.geteId());
	System.out.println(sp1.getePhone());
	
}
}


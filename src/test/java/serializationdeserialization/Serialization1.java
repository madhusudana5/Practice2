package serializationdeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoclass.EmployeeDetails1;
import pojoclass.Kid1;
import pojoclass.Kid2;
import pojoclass.Spouse1;

public class Serialization1 {
	
	@Test
	
	public void Serialization1() throws JsonGenerationException, JsonMappingException, IOException
	{
	
	String[] email= {"mns@gmail.com","mns@ty.com"};
	int[] phno= {123456,456789};
	Spouse1 sp=new Spouse1("smri", "ty01", "TYSS");
	Kid1 k1=new Kid1("mns1", "01");
	Kid2 k2=new Kid2("mns2", "02");
	
	
	EmployeeDetails1 pobj = new EmployeeDetails1("ram gopal verma", "tyss012", email, phno, sp, k1, k2);
	
	ObjectMapper omap=new ObjectMapper();
	
	omap.writeValue(new File("./objectoutput1.json"), pobj);
	
	}
}


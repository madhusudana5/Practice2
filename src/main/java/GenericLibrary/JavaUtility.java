package GenericLibrary;

import java.util.Random;

public class JavaUtility
{
public int getrandom()
{
	Random ram = new Random();
	 int ramint = ram.nextInt(100);
	 return ramint;
}
}

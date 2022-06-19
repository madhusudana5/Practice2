package GenericUtility;

import java.util.Random;

public class JavaUtility {
	
	public int getrandomnum()
	{
		Random ran = new Random();
		int randomnum = ran.nextInt(500);
		return randomnum;
	}
	

}

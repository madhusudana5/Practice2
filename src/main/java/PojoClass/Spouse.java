package PojoClass;

public class Spouse
{
	 //step1: create variable
	 String eName;
	 String eId;
	 int ePhone;
	 
	 
//step2:create constructor
	public Spouse(String eName, String eId, int ePhone) 
	{
		super();
		this.eName = eName;
		this.eId = eId;
		this.ePhone = ePhone;
	}
	
	public Spouse()
	{
		
	}
	

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteId() {
		return eId;
	}

	public void seteId(String eId) {
		this.eId = eId;
	}

	public int getePhone() {
		return ePhone;
	}

	public void setePhone(int ePhone) {
		this.ePhone = ePhone;
	}

	
	
}

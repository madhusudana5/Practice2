package PojoClass;

public class EmployDetailsWithArray
{
	String eName;
	String eId;
	int[] ePhone;
	String  email;
	
	
	public EmployDetailsWithArray(String eName, String eId, int[] ePhone, String email) {
		super();
		this.eName = eName;
		this.eId = eId;
		this.ePhone = ePhone;
		this.email = email;
	}
	
	public EmployDetailsWithArray() 
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

	public int[] getePhone() {
		return ePhone;
	}

	public void setePhone(int[] ePhone) {
		this.ePhone = ePhone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


}

package pojoclass;

public class EmployeeDetails {
	
	//Step 1: Declare the required fields globally 
	
	String ename;
	String eid;
	int phoneno;
	String email;
	
	//Step 2: Create a constructor to initialize
	
	public EmployeeDetails(String ename, String eid, int phoneno, String email) {
		
		this.ename = ename;
		this.eid = eid;
		this.phoneno = phoneno;
		this.email = email;
	}
	
	//used for deserialization - empty constructor is used to re-initialize the class
	
	public EmployeeDetails()
	{
		
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public int getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}

package pojoclass;

public class EmployeeDetailswithObject {
	String ename;
	String eid;
	int[] phoneno;
	Object spouse;
	
	//create constructor
	public EmployeeDetailswithObject(String ename, String eid, int[] phoneno, Object spouse) {
		super();
		this.ename = ename;
		this.eid = eid;
		this.phoneno = phoneno;
		this.spouse = spouse;
	}
	//Provide getters&setters method

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

	public int[] getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(int[] phoneno) {
		this.phoneno = phoneno;
	}

	public Object getSpouse() {
		return spouse;
	}

	public void setSpouse(Object spouse) {
		this.spouse = spouse;
	}
	
}

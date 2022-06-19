package pojoclass;

public class EmployeeDetailswithArray {

	String ename;
	String eid;
	int[] phoneno;
	String[] email;
	
	public EmployeeDetailswithArray(String ename, String eid, int[] phoneno, String[] email) {
		
		this.ename = ename;
		this.eid = eid;
		this.phoneno = phoneno;
		this.email = email;
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
	public int[] getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(int[] phoneno) {
		this.phoneno = phoneno;
	}
	public String[] getEmail() {
		return email;
	}
	public void setEmail(String[] email) {
		this.email = email;
	}
	
	
	
}

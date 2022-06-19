package pojoclass;

public class EmployeeDetails1 {
	String ename;
	String eid;
	String[] email;
	int[] phoneno;
	Object spouse1;
	Object kid1;
	Object kid2;
	public EmployeeDetails1(String ename, String eid, String[] email, int[] phoneno, Object spouse1, Object kid1,
			Object kid2) {
		super();
		this.ename = ename;
		this.eid = eid;
		this.email = email;
		this.phoneno = phoneno;
		this.spouse1 = spouse1;
		this.kid1 = kid1;
		this.kid2 = kid2;
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
	public String[] getEmail() {
		return email;
	}
	public void setEmail(String[] email) {
		this.email = email;
	}
	public int[] getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(int[] phoneno) {
		this.phoneno = phoneno;
	}
	public Object getSpouse1() {
		return spouse1;
	}
	public void setSpouse1(Object spouse1) {
		this.spouse1 = spouse1;
	}
	public Object getKid1() {
		return kid1;
	}
	public void setKid1(Object kid1) {
		this.kid1 = kid1;
	}
	public Object getKid2() {
		return kid2;
	}
	public void setKid2(Object kid2) {
		this.kid2 = kid2;
	}
	
}

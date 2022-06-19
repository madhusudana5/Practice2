package pojoclass;

public class Spouse1 {
	String ename;
	String eid;
	String company;
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
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Spouse1(String ename, String eid, String company) {
		super();
		this.ename = ename;
		this.eid = eid;
		this.company = company;
	}

}

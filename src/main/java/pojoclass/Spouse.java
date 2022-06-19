package pojoclass;

public class Spouse {
	String name;
	String cname;
	int phoneno;
	
	public Spouse(String name, String cname, int phoneno) {
		super();
		this.name = name;
		this.cname = cname;
		this.phoneno = phoneno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}
	

}

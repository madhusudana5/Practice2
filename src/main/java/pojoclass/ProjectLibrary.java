package pojoclass;

public class ProjectLibrary {
	
	String name;
	String company;
	String id;
	int teamsize;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getTeamsize() {
		return teamsize;
	}
	public void setTeamsize(int teamsize) {
		this.teamsize = teamsize;
	}
	public ProjectLibrary(String name, String company, String id, int teamsize) {
		super();
		this.name = name;
		this.company = company;
		this.id = id;
		this.teamsize = teamsize;
	}


}

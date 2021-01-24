package first.example.microservice1.info;

public class EmployeeData {
	private String name;
	private String domain;
	private String location;
	
	public EmployeeData(String name, String domain, String location) {
		this.name = name;
		this.domain = domain;
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	

}

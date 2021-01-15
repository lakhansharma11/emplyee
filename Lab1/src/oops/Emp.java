package oops;

public class Emp {
	private int emplid;
	private String name;
	
	public int getEmplid() {
		return emplid;
	}
	public void setEmplid(int emplid) {
		this.emplid = emplid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Emp(int emplid) {
		super();
		this.emplid = emplid;
	}
	@Override
	public String toString() {
		return "Emp [emplid=" + emplid + ", name=" + name + "]";
	}

	
	
	

}

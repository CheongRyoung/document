package q02.personSubClassCreate;

public class Faculty extends Employee {
	
	private String officeHours;
	private String rank;
	
	public Faculty(String name, String address, String phone, String email, int office, double salary
			, String officeHours, String rank) {
		super(name, address, phone, email, office, salary);
		this.officeHours = officeHours;
		this.rank = rank;
	}

	public String getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}
	@Override
	public String toString() {
		return ("name = " + getName() + ", address = " + getAddress() + ", phoneNo = " + getPhoneNo() + ", email = " + getEmail()
		+ ", office = " + getOffice() + ", salary = " + getSalary() + ", officeHours = " + getOfficeHours() + ", rank = " + getRank());
	}
}
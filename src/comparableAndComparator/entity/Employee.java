package comparableAndComparator.entity;

// Implementing Comparable
public class Employee implements Comparable<Employee>{
	private String name;
	private String phone;
	private int empId;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, String phone, int empId) {
		super();
		this.name = name;
		this.phone = phone;
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	// override toString method
	@Override
	public String toString() {
		return "Employee [name=" + name + ", phone=" + phone + ", empId=" + empId + "]";
	}
	
	
	// override compareTo method
	@Override
	public int compareTo(Employee o) {
		return this.empId - o.empId;
	}
	
	
}

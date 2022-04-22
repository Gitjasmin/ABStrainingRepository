package pack_employee;
import pack_employee.Salary;

public class Employee {
	
	private String firstName;
	private String lastName;
	private Salary salary;
	
	public Employee(){
		
		
	}
	public Employee(String firstName,String lastName,Salary salary){
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Salary getSalary() {
		return salary;
	}
	public void setSalary(Salary salary) {
		this.salary = salary;
	}
	
	
	
	

}

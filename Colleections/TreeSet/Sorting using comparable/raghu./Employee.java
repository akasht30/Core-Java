package org;



public class Employee implements Comparable{
	
	private Integer employeeId;
	private String employeeName;
	private Integer employeeSalary;
	public Employee(Integer employeeId, String employeeName, Integer employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Integer getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(Integer employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
	public int compareTo(Object obj) {
		if(obj instanceof Employee) {
			Employee emp = (Employee)obj;
			return this.employeeName.compareTo(emp.employeeName);
		}
		else if(obj instanceof Student) {
			Student std=(Student)obj;
			return this.employeeName.compareTo(std.getStudentName());
		}
		return 0;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}

	
}

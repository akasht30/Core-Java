package org;

import comparator.Employee;

public class Student implements Comparable{
	private Integer studentId;
	private String studentName;
	private Double studentPer;
	public Student(Integer studentId, String studentName, Double studentPer) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentPer = studentPer;
	}
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Double getStudentPer() {
		return studentPer;
	}
	public void setStudentPer(Double studentPer) {
		this.studentPer = studentPer;
	}
	
	
	public int compareTo(Object obj) {
		if(obj instanceof Employee) {
			Employee emp = (Employee)obj;
			return this.studentName .compareTo(emp.getEmployeeName());
		}
		else if(obj instanceof Student) {
			Student std=(Student)obj;
			return this.studentName.compareTo(std.getStudentName());
		}
		return 0;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentPer=" + studentPer + "]";
	}
	
}

package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("Display Student Name");

	}
	
	public void studentDept() {
		System.out.println("Display student Department");

	}
	
	public void studentId() {
		System.out.println("Display student ID number");

	}
	
	public static void main(String[] args) {
		Student std = new Student();
		
		std.collegeCode();
		std.collegeName();
		std.collegeRank();
		std.deptName();
		std.studentDept();
		std.studentId();
		std.studentName();
	}

}

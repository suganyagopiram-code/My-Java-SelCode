package org.department;

import org.college.College;

public class Department extends College{
	
	public void deptName() {
		System.out.println("Display Department Name");

	}
	
	public static void main(String[] args) {
		Department dp = new Department();
		dp.collegeCode();
		dp.collegeName();
		dp.collegeRank();
	}

}

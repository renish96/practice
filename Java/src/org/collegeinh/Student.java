package org.collegeinh;

public class Student extends College {
	private void studentName() {
		System.out.println("student name is rocky");
	}
	private void studentDept() {
		System.out.println("student dept is ECE");
	}
	private void studentId() {
		System.out.println("student id is 235476");
	}
	public static void main(String[] args) {
		Student k = new Student();
		k.collegeName();
		k.collegeCode();
		k.collegeRank();
		k.deptName();
		k.studentName();
		k.studentId();
		k.studentDept();
		k.hostelName();
	}
}

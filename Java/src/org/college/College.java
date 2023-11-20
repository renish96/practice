package org.college;

public class College {
	private void collegeName() {
		System.out.println("college name is kings college");
	}

	private void collegeCode() {
		System.out.println("college code is 0893");
	}

	private void collegeRank() {
		System.out.println("college rank is 45");
	}
	public static void main(String[] args) {
		College t = new College();
		t.collegeName();
		t.collegeCode();
		t.collegeRank();
		Student f = new Student();
		f.studentName();
		f.studentId();
		f.studentDept();
		Hostel n = new Hostel();
		n.hostelName();
		Dept j = new Dept();
		j.deptName();
	}
}

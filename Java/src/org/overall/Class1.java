package org.overall;

public class Class1 extends AbstractClass3 {
	public void teacherName() {
		System.out.println("teacher name is prabu");
		super.deptName();
		this.teacherId();

	}

	public void teacherId() {
		System.out.println("teacher id is 3432323");
		this.studentStreet();

	}

	public void studentStreet() {
		System.out.println("kumaran street");
		this.studentArea();

	}

	public void studentArea() {
		System.out.println("kk nagar");
		this.parentName();

	}

	public void parentName() {
		System.out.println("parent name is raj");
		this.parentOccupation();
	}

	public void parentOccupation() {
		System.out.println("parent occupation is agriculture");
		this.studentName();

	}

	public void studentName() {
		System.out.println("student name is ramesh");
		this.studentAge();

	}

	public void studentAge() {
		System.out.println("student age is 20");
		this.deptCode();

	}

	@Override
	public void deptCode() {
		System.out.println("dept code is 23446");
		this.collegeArea();

	}

	@Override
	public void collegeArea() {
		System.out.println("college area is tambaram");
		this.collegeCode();

	}

	@Override
	public void collegeCode() {
		System.out.println("college code is 7654");

	}

}

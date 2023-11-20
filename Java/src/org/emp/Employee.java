package org.emp;

public class Employee {
	private void empId() {
		System.out.println("emp id:12345");
	}

	private void empName() {
		System.out.println("emp name:saral");
	}

	private void empDob() {
		System.out.println("emp DOB:01-01-2001");
	}

	private void empPhone() {
		System.out.println("emp Phone:12345667890");
	}

	private void empEmail() {
		System.out.println("emp Email:agsfavc@hsaf.com");
	}

	private void empAddress() {
		System.out.println("emp Address:kadampuliyur");
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.empId();
		e.empName();
		e.empDob();
		e.empPhone();
		e.empEmail();
		e.empAddress();

	}

}

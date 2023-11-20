package org.polymorhoverload;

public class Employee {
	private void empId(int age) {
		System.out.println(age);

	}

	private void empId(int Id, long mobile) {
		System.out.println(Id + "\n" + mobile);

	}

	private void empId(float Mark, double salary) {
		System.out.println(Mark + "\n" + salary);

	}

	private void empId(char Grade, boolean a) {
		System.out.println(Grade + "\n" + a);
	}
     public static void main(String[] args) {
		Employee g = new Employee();
		g.empId(25);
		g.empId(23545, 8754687954l);
		g.empId(98.34f, 3256.342567d);
		g.empId('A', true);
	}
}

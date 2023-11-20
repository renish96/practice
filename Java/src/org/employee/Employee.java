package org.employee;

import org.company.Company;
import org.client.Client;
import org.project.Project;

public class Employee {
	private void empName() {
		System.out.println("employee name is navin");
	}

	public static void main(String[] args) {
		Employee s = new Employee();
		s.empName();
		Company r = new Company();
		r.companyName();
		Client d = new Client();
		d.clientName();
		Project g = new Project();
		g.projectName();
	}

}

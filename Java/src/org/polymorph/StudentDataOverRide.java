package org.polymorph;

public class StudentDataOverRide extends StudentData {
	@Override
	public void studentInfo(String Name) {
		System.out.println(Name);
		super.studentInfo("ram");
		this.studentInfo(765543);
	}

	@Override
	public void studentInfo(int id) {
		System.out.println(id);
		super.studentInfo(322556);
		this.studentInfo(7654321890l);

	}

	@Override
	public void studentInfo(long mobile) {
		System.out.println(mobile);
		super.studentInfo(9877654332l);
		this.studentInfo(94.67f);
	}

	@Override
	public void studentInfo(float mark) {
		System.out.println(mark);
		super.studentInfo(87.8f);
		this.studentInfo(67.87d);
	}

	@Override
	public void studentInfo(double overall) {
		System.out.println(overall);

		super.studentInfo(6.78d);
		this.studentInfo('S');
	}

	@Override
	public void studentInfo(char grade) {
		System.out.println(grade);
		super.studentInfo('A');
		this.studentInfo(false);
	}

	@Override
	public void studentInfo(boolean s) {
		System.out.println(s);
		super.studentInfo(true);
		this.studentInfo("ECE", 5433567);
	}

	@Override
	public void studentInfo(String dept, int deptid) {
		System.out.println(dept + "\n" + deptid);

		super.studentInfo("ECE", 5433567);
		this.studentInfo(600034, "Anna Nagar");
	}

	@Override
	public void studentInfo(long pin, String area) {
		System.out.println(pin + "\n" + area);
		super.studentInfo(6000023, "T.nagar");
		this.studentInfo(19, 43567899876323l);
	}

	@Override
	public void studentInfo(int age, long aadharno) {
		System.out.println(age + "\n" + aadharno);
		super.studentInfo(20, 2345432765478l);
	}

	public static void main(String[] args) {
		StudentDataOverRide k = new StudentDataOverRide();
		k.studentInfo("sita");

	}

}

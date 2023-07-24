package org.college;
public class College {
	private void collegeName() {
		System.out.println("SRM");
	}
    private void collegeCode() {
		System.out.println("8204");
	}
    private void collegeRank() {
		System.out.println("No.1");
	}
    public static void main(String[] args) {
		College c = new College();
		Student s = new Student();
		Hostel h = new Hostel();
		Dept d = new Dept();
		c.collegeName();
		c.collegeCode();
		c.collegeRank();
		s.studentName();
		s.studentDept();
		s.studentId();
		h.hostelName();
		d.deptName();
	}
}

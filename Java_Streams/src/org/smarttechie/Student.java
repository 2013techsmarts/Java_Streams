package org.smarttechie;

public class Student implements Comparable<Student> {

	private String rollNumber;

	private String studentName;

	private int totalMarks;

	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
	public String getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}
	@Override
	public int compareTo(Student stud) {
		if(this.totalMarks == stud.totalMarks)
			return 0;
		else
			return this.totalMarks > stud.totalMarks ? -1 : 1;
	}
	
	public String toString() {
		return "studentName = " + studentName;
	}
}

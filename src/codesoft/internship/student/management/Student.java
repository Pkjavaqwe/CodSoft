package codesoft.internship.student.management;

import java.io.Serializable;

public class Student implements Serializable {
	String studentName;
	int rollNo;
	String grade;
	public Student(String studentName, int rollNo) {
		
		this.studentName = studentName;
		this.rollNo = rollNo;
//		this.grade = grade;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", rollNo=" + rollNo +  "]";
	}
	
	

}

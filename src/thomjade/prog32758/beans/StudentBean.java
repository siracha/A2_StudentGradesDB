package thomjade.prog32758.beans;

import java.io.Serializable;
import java.util.ArrayList;

public class StudentBean implements Serializable {
	private String lName;
	private String fName;
	private int studentID;
	private ArrayList<GradeBean> grades;
	public StudentBean() {
		super();
		grades = new ArrayList<GradeBean>();
		setAssignments();
	}
	private void setAssignments() {
		GradeBean grade1 = new GradeBean("Quiz1",0.00);
		grades.add(grade1);
		GradeBean grade2 = new GradeBean("Quiz2",0.00);
		grades.add(grade2);
		GradeBean grade3 = new GradeBean("Quiz3",0.00);
		grades.add(grade3);
		GradeBean grade4 = new GradeBean("Quiz4",0.00);
		grades.add(grade4);
		GradeBean grade5 = new GradeBean("Assignment1",0.00);
		grades.add(grade5);
		GradeBean grade6 = new GradeBean("Assignment2",0.00);
		grades.add(grade6);
		GradeBean grade7 = new GradeBean("Assignment3",0.00);
		grades.add(grade7);
		GradeBean grade8 = new GradeBean("Midterm",0.00);
		grades.add(grade8);
		GradeBean grade9 = new GradeBean("Midterm",0.00);
		grades.add(grade9);
		GradeBean grade10 = new GradeBean("Final",0.00);
		grades.add(grade10);
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public ArrayList<GradeBean> getGrades() {
		return this.grades;
	}
	public void setGrade(String assignment, double grade) {
		GradeBean newGrade = new GradeBean();
		newGrade.setGrade(grade);
		newGrade.setAssignment(assignment);
		grades.add(newGrade);
	}
	
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentNumber) {
		this.studentID = studentNumber;
	}
	
	
}

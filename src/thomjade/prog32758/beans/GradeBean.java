package thomjade.prog32758.beans;

import java.io.Serializable;

public class GradeBean implements Serializable {

	private double grade;
	private String assignment;
	public GradeBean() {
		super();
	}
	
	public GradeBean( String assignment, double grade) {
		super();
		this.grade = grade;
		this.assignment = assignment;
	}

	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	public String getAssignment() {
		return assignment;
	}
	public void setAssignment(String assignment) {
		this.assignment = assignment;
	}
	
	
	

}

package thomjade.prog32758.list;

import java.util.ArrayList;

import thomjade.prog32758.beans.StudentBean;

public class StudentList {
	private ArrayList<StudentBean> students;

	public ArrayList<StudentBean> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<StudentBean> students) {
		this.students = students;
	}
	
	public void pushStudent(StudentBean newStudent) {
		this.students.add(newStudent);
	}
	public void popStudent(StudentBean newStudent) {
		this.students.remove(newStudent);
	}
	
	public StudentBean getStudent(int studentID) {
		StudentBean currentStudent = new StudentBean();
		for (StudentBean studentBean : students) {
			if (studentBean.getStudentID() == studentID) {
				currentStudent = studentBean;
			}
		}
		return currentStudent;
	}

}

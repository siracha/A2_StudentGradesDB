package thomjade.prog32758.Servlets;

import thomjade.prog32758.beans.GradeBean;
import thomjade.prog32758.beans.StudentBean;
import thomjade.prog32758.list.StudentList;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ModifyServlet
 */
@WebServlet("/ModifyServlet")
public class ModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		int studentNumber = Integer.parseInt((String)session.getAttribute("studentNumber"));
		ArrayList<StudentBean> list = (ArrayList<StudentBean>)session.getAttribute("studentList");
		GradeBean newGrade = new GradeBean();
		
		for (StudentBean studentToMod : list) {
			if (studentToMod.getStudentID() == studentNumber) {
				
				String assignment = "";
				double mark = 00;
				
				if (session.getAttribute("assignment") != null) {
					assignment = (String)session.getAttribute("assignment");
				}
				else assignment = "null";
				if (session.getAttribute("grade") != null) {
					mark = (double)session.getAttribute("grade");
				}
				else mark = 0;
				
				studentToMod.setGrade(assignment, mark);
				session.setAttribute("currentStudent", studentToMod);//add the student to modify to the session
			}
		}
		
		RequestDispatcher dispatch = request.getRequestDispatcher("Modified.jsp");
		dispatch.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

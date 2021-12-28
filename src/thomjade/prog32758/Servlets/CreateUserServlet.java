package thomjade.prog32758.Servlets;

import thomjade.prog32758.beans.StudentBean;
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
 * Servlet implementation class CreateUserServlet
 */
@WebServlet("/CreateUserServlet")
public class CreateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentBean kid = new StudentBean();
		HttpSession session = request.getSession();
		//String errors = "";
		
		kid.setfName(request.getParameter("fName") != null?request.getParameter("fName"):"null");//if there is a name
		kid.setlName(request.getParameter("lName")!= null?request.getParameter("lName"):"null");
		
		try {
			kid.setStudentID(Integer.parseInt((String)session.getAttribute("studentNumber")));
		}
		catch(NullPointerException e) {
			kid.setStudentID(0000);
		}
		
	
		
		ArrayList<StudentBean> ListOfStudents = (ArrayList<StudentBean>)session.getAttribute("studentList");
		ListOfStudents.add(kid);
		session.setAttribute("studentList", ListOfStudents);
		RequestDispatcher dispatch = request.getRequestDispatcher("Created.jsp");
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

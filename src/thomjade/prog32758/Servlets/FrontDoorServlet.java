package thomjade.prog32758.Servlets;

import java.io.IOException;
import java.util.ArrayList;

import thomjade.prog32758.beans.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FrontDoorServlet
 */
@WebServlet("/FrontDoorServlet")
public class FrontDoorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontDoorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		if(session.getAttribute("studentList")== null) {//if the student list does not exist
			
			ArrayList<StudentBean> students = new ArrayList<StudentBean>();
			session.setAttribute("studentList", students);
		}
		session.setAttribute("studentNumber", request.getParameter("studentNumber"));
		
		response.sendRedirect("intro.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

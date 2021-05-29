

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	
	
	
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Servlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		String op = request.getParameter("op");
		
		if (op.equals("Inscription")) {
        	RequestDispatcher disp = request.getRequestDispatcher("inscription.jsp");
			disp.forward(request, response);
        }
		
		
		if (op.equals("Connexion")) {
			
			RequestDispatcher disp = request.getRequestDispatcher("connexion.jsp");
			disp.forward(request, response);
			
        } 
		
		if (op.equals("Se connecter")) {
			
			RequestDispatcher disp = request.getRequestDispatcher("connexion.jsp");
			disp.forward(request, response);
			
        } 
		
		if (op.equals("S'inscrire")) {
			
			RequestDispatcher disp = request.getRequestDispatcher("inscription.jsp");
			disp.forward(request, response);
			
        } 
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
	}

}

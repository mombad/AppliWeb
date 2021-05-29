

import java.io.IOException;
import java.util.LinkedList;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Compte;
import entities.CompteEleve;
import entities.Requete;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Session")
public class Session extends HttpServlet {
	
	
	
	private static final long serialVersionUID = 1L;
	@EJB
	protected Facade facade;

    /**
     * Default constructor. 
     */
    public Session() {
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
		
		if (op.equals("Creer une requete")) {
			String mail = request.getParameter("op1");
			request.setAttribute("mail", mail);
			
        	RequestDispatcher disp = request.getRequestDispatcher("session.jsp");
			disp.forward(request, response);
        }
		
		
		if (op.equals("Envoyer")) {
			String mail = request.getParameter("op1");
			
			
			CompteEleve c = (CompteEleve) facade.findCompte(mail);
			/*if(c == null) {
				//response.getWriter().println(mail);
			}*/
			Requete req = new Requete();
			response.getWriter().println(" mail");
			facade.ajouterRequete(req, c);
			
			
			RequestDispatcher disp = request.getRequestDispatcher("accueil.jsp");
			disp.forward(request, response);
			
        } 
		
		if (op.equals("Lire les requetes")) {
			LinkedList<Requete> lr = facade.getRequetes();
			
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

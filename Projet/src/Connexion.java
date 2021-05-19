import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.CompteEleve;

@WebServlet("/Connexion")
public class Connexion extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Connexion() {
        // TODO Auto-generated constructor stub
    }
	
	//@EJB
	//private Facade facade = new Facade();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		
		String co = request.getParameter("co");
		
		if(co.contentEquals("Connexion")) {
			RequestDispatcher disp = request.getRequestDispatcher("index.html");
			disp.forward(request, response);
		}
		
		if(co.contentEquals("Inscription")) {
			String nom = request.getParameter("nom");
			String prenom = request.getParameter("prénom");
			String mail = request.getParameter("mail");
			String psw = request.getParameter("psw");
			CompteEleve c = new CompteEleve(nom,prenom,mail,psw);
			//facade.ajoutCompte(c);
			request.setAttribute("nom", nom);
			request.setAttribute("prénom", prenom);
			request.setAttribute("mail", mail);
			request.setAttribute("psw", psw);
			//request.setAttribute("compte", facade.consulterCompte(mail));
			RequestDispatcher disp = request.getRequestDispatcher("index.html");
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



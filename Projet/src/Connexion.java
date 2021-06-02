import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Compte;
import entities.CompteEleve;
import entities.CompteProfesseur;
import entities.Requete;


@WebServlet("/Connexion")
public class Connexion extends HttpServlet {

	/**
	 * 
	 */
	@EJB
	protected Facade facade;
	
	private static final long serialVersionUID = 1L;
	public Connexion() {
        // TODO Auto-generated constructor stub
    }
	
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		
		String co = request.getParameter("co");
		
		if(co.contentEquals("Connexion")) {
			String mail = request.getParameter("mail");
			String psw = request.getParameter("psw");
			Compte c = facade.checkCompte(mail,psw);
			if (c == null) {
				response.getWriter().println(": Ce compte n'existe pas.");
				RequestDispatcher disp = request.getRequestDispatcher("noAccount.jsp");
				disp.forward(request, response);
			} else {
				if (!c.getPassword().equals(psw)) {
					response.getWriter().println(": Le mot de passe ou l'adresse est incorrect.");
				}  else {	
					request.setAttribute("mail", mail);
					request.setAttribute("compte", facade.checkCompte(mail, psw));
					if(c instanceof CompteEleve) {
						RequestDispatcher disp = request.getRequestDispatcher("accueil.jsp");
						disp.forward(request, response);
					} else if(c instanceof CompteProfesseur) {
						RequestDispatcher disp = request.getRequestDispatcher("accueilprof.jsp");
						disp.forward(request, response);
					}
					
				}
			}
			
		}
		
		else if(co.contentEquals("Inscription")) {
			String nom = request.getParameter("nom");
			String prenom = request.getParameter("prénom");
			String mail = request.getParameter("mail");
			String psw = request.getParameter("psw");
			String statut = request.getParameter("select");
			
			if (nom == "" || prenom =="" || mail =="" || mail == "" || psw == "") {
				response.getWriter().println("Veuillez compléter tous les champs.");
			} else {
				if (statut.contentEquals("eleve")) {
					CompteEleve c = new CompteEleve(nom,prenom,mail,psw);
					facade.ajoutCompte(c);

					
				} else if (statut.contentEquals("professeur")) {
					CompteProfesseur c = new CompteProfesseur(nom,prenom,mail,psw);
					facade.ajoutCompte(c);

				}
			
				request.setAttribute("mail", mail);
				request.setAttribute("compte", facade.checkCompte(mail, psw));
				request.setAttribute("listeProf", facade.listeProf());
				if(statut.contentEquals("eleve")) {
					RequestDispatcher disp = request.getRequestDispatcher("accueil.jsp");
					disp.forward(request, response);
				} else {
					RequestDispatcher disp = request.getRequestDispatcher("accueilprof.jsp");
					disp.forward(request, response);
				}
				
			}
		}
		
		else if (co.equals("RetourConnexion")) {
			
			RequestDispatcher disp = request.getRequestDispatcher("connexion.jsp");
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



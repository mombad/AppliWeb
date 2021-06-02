

import java.io.IOException;
import java.util.Collection;
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
import entities.Discussion;
import entities.MessageTexte;
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
			String msg = request.getParameter("message");
			String sujet = request.getParameter("sujet");
			
			CompteEleve c = (CompteEleve) facade.findCompte(mail);
			/*if(c == null) {
				//response.getWriter().println(mail);
			}*/
			Requete req = new Requete();
			req.setMessage(msg);
			req.setSujet(sujet);
			request.setAttribute("mail", mail);
			
			response.getWriter().println(" mail");
			facade.ajouterRequete(req, c, mail);
			
			
			RequestDispatcher disp = request.getRequestDispatcher("accueil.jsp");
			disp.forward(request, response);
			
        } 
		
		if (op.equals("Mes requetes")) {
			CompteEleve cEleve = (CompteEleve) facade.findCompte(request.getParameter("op1"));
			
			request.setAttribute("requetes", facade.getRequetesCompte(cEleve));
			RequestDispatcher disp = request.getRequestDispatcher("listeRequetes.jsp");
			disp.forward(request, response);
			
			
        }
		
		if (op.equals("toutes les requetes")) {
			String mail = request.getParameter("op1");
			request.setAttribute("mail", mail);
			
			request.setAttribute("requetes", facade.getRequetes());
			RequestDispatcher disp = request.getRequestDispatcher("listeRequetes.jsp");
			disp.forward(request, response);
			
			
        }
		
		if (op.equals("Discussions")) {
			String mail = request.getParameter("op1");
			request.setAttribute("mail", mail);
			Compte c = facade.findCompte(mail);	
			request.setAttribute("discussions", facade.getDiscussions(c));
			RequestDispatcher disp = request.getRequestDispatcher("listeDiscussions.jsp");
			disp.forward(request, response);
			
			
        }
		
		if (op.equals("Deconnexion")) {
			
			request.setAttribute("requetes", facade.getRequetes());
			RequestDispatcher disp = request.getRequestDispatcher("index.html");
			disp.forward(request, response);
			
			
        }
		
		if (op.equals("creer une discussion")) {
			
			Collection <Compte> participants = new LinkedList <Compte>();
			String mailEleve = request.getParameter("requete");
			Compte cible = facade.findCompte(mailEleve);
			Compte currentAccount = facade.findCompte(request.getParameter("mail"));
			participants.add(cible);
			participants.add(currentAccount);
			Discussion d = new Discussion(participants);
			
			facade.createDiscussion(d);
			request.setAttribute("mail", request.getParameter("mail"));
			
			request.setAttribute("discussion", d);
			request.setAttribute("id", d.getNum());
			RequestDispatcher disp = request.getRequestDispatcher("message.jsp");
			disp.forward(request, response);
			
		}
		if(op.contentEquals("consulter")) {
			String id = request.getParameter("num");
			int num = Integer.valueOf(id);
			Discussion d = facade.findDiscussion(num);
			String mail = request.getParameter("mail");
			request.setAttribute("mail", mail);
			request.setAttribute("id", num);
			request.setAttribute("discussion", d);
			
			RequestDispatcher disp = request.getRequestDispatcher("message.jsp");
			disp.forward(request, response);
		}
		
		if(op.contentEquals("send")) {
			String id = request.getParameter("id");
			int num = Integer.valueOf(id);
			Discussion d = facade.findDiscussion(num);

			String msg = request.getParameter("msg");
			String mail = request.getParameter("mail");
			request.setAttribute("mail", mail);
			Compte c = facade.findCompte(mail);
			MessageTexte m = new MessageTexte(c,d,msg);
			facade.ajouterMessage(d, m);
			request.setAttribute("id", num);
			request.setAttribute("discussion", d);
			
			RequestDispatcher disp = request.getRequestDispatcher("message.jsp");
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

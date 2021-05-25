import java.util.Collection;
import java.util.LinkedList;

import javax.ejb.Singleton;
import javax.persistence.*;
import entities.*;
@Singleton
public class Facade {

	@PersistenceContext
	private EntityManager em;
	
	public void ajoutCompte(Compte c) {
		em.persist(c);
	}
	
	public Collection <Compte> listeProf(){
		TypedQuery <Compte>req = em.createQuery("select c from Compte c", Compte.class);
		return req.getResultList();
	}
	
	public Compte checkCompte(String mail,String psw) {
		Compte c = null;
		try {
			TypedQuery <Compte>c1 = em.createQuery("select c from Compte c where mail = " +"'" + mail + "'", Compte.class);
			c =  c1.getSingleResult();
			if (psw == c.getPassword()) {
				return c;
			}
			return c;
		} catch (Exception e) {
			return null;
		}
		
	}
	
	public Compte findCompte(String mail) {
		Compte c = null;
		try {
			TypedQuery <Compte>c1 = em.createQuery("select c from Compte c where mail = " +"'" + mail + "'", Compte.class);
			c =  c1.getSingleResult();
			
			return c;
		} catch (Exception e) {
			return null;
		}
		
	}
	
	public void ajouterRequete(Requete requete, CompteEleve compte) {
		if(compte.getRequetes().isEmpty()) {
			compte.setRequetes(new LinkedList<Requete>());
		}
		compte.getRequetes().add(requete);
	}
	
}

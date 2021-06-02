import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

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
	
	public void ajoutRequete(Requete r) {
		em.persist(r);
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
	
	public void ajouterRequete(Requete requete, CompteEleve compte, String mail) {
		Compte c = em.find(Compte.class, mail);
		requete.setCompte(c);
		
		this.ajoutRequete(requete);
		
	}
	
	public void createDiscussion(Discussion d){
		em.persist(d);
		
	}
	public void deleteRequete(int id_requete) {
		Requete r = em.find(Requete.class, id_requete);
		em.remove(r);
		
	}
	public Collection <Discussion> getDiscussions(Compte c){
		return c.getDiscussions();
	}
	public Discussion findDiscussion(int id) {
		Discussion d = em.find(Discussion.class, id);
		return d;
	
	}
	public void ajouterMessage(Discussion d, MessageTexte m ) {
		em.persist(m);
		d.getMessages().add(m);
		em.merge(d);
	}
	
	public Collection<Requete> getRequetes() {
			TypedQuery<Requete> ls = em.createQuery("select r from Requete r", Requete.class);
			
			
			return ls.getResultList();
	}
	
	public Collection<Requete> getRequetesCompte(CompteEleve c){
		return c.getRequetes();
	}
	
	
}

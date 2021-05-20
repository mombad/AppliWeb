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
	
	public Compte checkCompte(String mail,String psw) {
		Compte c = null;
		TypedQuery <Compte>c1 = em.createQuery("select c from Compte c where c.mail = " + mail, Compte.class);
		c =  c1.getSingleResult();
		if (psw == c.getPassword()) {
			return c;
		}
		return null;
	}
	
}

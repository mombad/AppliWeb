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
		c = em.find(Compte.class, mail);
		if (psw == c.getPassword()) {
			return c;
		}
		return null;
	}
	
}

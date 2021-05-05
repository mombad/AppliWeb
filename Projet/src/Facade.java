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
	
}

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
	
	public Compte consulterCompte(String id) {
		Compte c = em.find(Compte.class, id);
		if (c == null) throw new RuntimeException("Compte Introuvable");
		return c;
	}
	
}

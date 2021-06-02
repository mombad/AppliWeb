package entities;

import javax.persistence.*;
import java.util.*;

@Entity
public class CompteEleve extends Compte {	
	
	@OneToMany(fetch = FetchType.EAGER,mappedBy="c")
	Collection<Requete> requetes;	
	

	public CompteEleve() {super();}
		
	

	public CompteEleve(String nom, String prenom, String mail, String password) {
		
		super(nom, prenom, mail, password);
		requetes = new LinkedList<Requete>();
		
		
	}
	
	public Collection<Requete> getRequetes() {
		return requetes;
	}

	public void setRequetes(Collection<Requete> requetes) {
		this.requetes = requetes;
	}
	
}

package entities;

import javax.persistence.*;
import java.util.*;

@Entity
public class CompteEleve extends Compte {	
	
	@OneToMany
	LinkedList<Requete> requetes;	
	

	public CompteEleve(String nom, String prenom, String mail, String password) {
		super(nom, prenom, mail, password);
	}

	public LinkedList<Requete> getRequetes() {
		return requetes;
	}

	public void setRequetes(LinkedList<Requete> requetes) {
		this.requetes = requetes;
	}
	
}

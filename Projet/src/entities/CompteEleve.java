package entities;

import javax.persistence.*;
import java.util.*;

@Entity
public class CompteEleve extends Compte {	
	
	//@OneToMany
	LinkedList<Requete> requetes;	
	

	public CompteEleve() {super();}
		
	

	public CompteEleve(String nom, String prenom, String mail, String password) {
		
		super(nom, prenom, mail, password);
		requetes = new LinkedList<Requete>();
		
	}

	public LinkedList<Requete> getRequetes() {
		return requetes;
	}

	public void setRequetes(LinkedList<Requete> requetes) {
		this.requetes = requetes;
	}
	
}

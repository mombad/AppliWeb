package entities;

import javax.persistence.Entity;

@Entity
public class CompteProfesseur extends Compte {
	public CompteProfesseur() {super();}
	public CompteProfesseur(String nom, String prenom, String mail, String password) {
		super(nom, prenom, mail, password);
	}

}

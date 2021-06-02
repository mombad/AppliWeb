package entities;

import javax.persistence.Entity;

@Entity
public class MessageTexte extends Message {

	String texte;

	public String getTexte() {
		return texte;
	}

	public void setTexte(String texte) {
		this.texte = texte;
	}
	
	public MessageTexte() {
		super();
	}

	public MessageTexte(Compte expediteur, Discussion discussion, String texte) {
		super(expediteur, discussion);
		this.texte = texte;
	}

}

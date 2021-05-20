package entities;

import javax.persistence.*;
import java.util.*;

@Entity
public abstract class Compte {
	
	@Id
	private String mail;
	private String nom;
	private String prenom;
	private String password;
	
	@ManyToMany(mappedBy="participants")
	Collection<Discussion> discussions;
	
	public Compte() {
		super();
	}
	
	public Compte(String nom, String prenom, String mail, String password) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.password = password;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Collection<Discussion> getDiscussions() {
		return discussions;
	}

	public void setDiscussions(Collection<Discussion> discussions) {
		this.discussions = discussions;
	}

	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
}

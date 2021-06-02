package entities;

import javax.persistence.*;
import java.util.*;

@Entity
public class Requete {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int num;
	private String sujet;
	private String msg;
	
	@ManyToOne
	private Compte c;
	
	@OneToMany(mappedBy="requete")
	Collection<FicheCours> fiches;
	public String getMessage() {
		return this.msg;
	}
	public void setMessage(String msg) {
		this.msg = msg;
	}
	public String getSujet() {
		return this.sujet;
	}
	public void setSujet(String s) {
		this.sujet = s;
	}
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Collection<FicheCours> getFiches() {
		return fiches;
	}
	
	public Compte getCompte() {
		return this.c;
	}
	
	public void setCompte(Compte c) {
		this.c = c;
	}

	public Requete() {
		super();
		
	}

	public void setFiches(Collection<FicheCours> fiches) {
		this.fiches = fiches;
	}
	
}

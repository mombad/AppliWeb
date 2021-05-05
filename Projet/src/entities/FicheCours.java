package entities;

import javax.persistence.*;

@Entity
public class FicheCours {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int num;
	
	@ManyToOne
	Requete requete;

	public Requete getRequete() {
		return requete;
	}

	public void setRequete(Requete requete) {
		this.requete = requete;
	}

	public FicheCours(Requete requete) {
		super();
		this.requete = requete;
	}
	
}

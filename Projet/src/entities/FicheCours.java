package entities;

import javax.persistence.*;

@Entity
public class FicheCours {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int num;
	private String sujet;
	private String urlFiche;
	private String urlTheme;
	
	@ManyToOne
	Requete requete;
	
	public FicheCours() {
		super();
	}

	public Requete getRequete() {
		return requete;
	}

	public void setRequete(Requete requete) {
		this.requete = requete;
	}

	public FicheCours(Requete requete, String sujet, String urlFiche, String urlTheme) {
		super();
		
		this.requete = requete;
		this.sujet = sujet;
		this.urlFiche = urlFiche;
		this.urlTheme = urlTheme;
	}
	
	public String getSujet() {
		return this.sujet;
	}
	
	public String geturlFiche(){
		return this.urlFiche;
	}
	
	public String geturlTheme() {
		return this.urlTheme;
	}
	
	
}

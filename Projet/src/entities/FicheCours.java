package entities;

import javax.persistence.*;

@Entity
public class FicheCours {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int num;
	
	@ManyToOne
	Requete requete;
	
}

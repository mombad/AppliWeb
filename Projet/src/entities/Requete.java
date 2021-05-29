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
	
	@OneToMany(mappedBy="requete")
	Collection<FicheCours> fiches;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Collection<FicheCours> getFiches() {
		return fiches;
	}

	public Requete() {
		super();
		
	}

	public void setFiches(Collection<FicheCours> fiches) {
		this.fiches = fiches;
	}
	
}

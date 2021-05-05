package entities;

import javax.persistence.*;
import java.util.*;

@Entity
public class Requete {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int num;
	
	@OneToMany(mappedBy="requete")
	LinkedList<FicheCours> fiches;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public LinkedList<FicheCours> getFiches() {
		return fiches;
	}

	public Requete() {
		super();
		this.fiches = new LinkedList<FicheCours>();
	}

	public void setFiches(LinkedList<FicheCours> fiches) {
		this.fiches = fiches;
	}
	
}

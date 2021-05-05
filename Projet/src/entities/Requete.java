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
	
}

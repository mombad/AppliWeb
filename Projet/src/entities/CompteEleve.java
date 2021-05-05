package entities;

import javax.persistence.*;
import java.util.*;

@Entity
public class CompteEleve extends Compte {	
	
	@OneToMany
	LinkedList<Requete> requetes;
	
}

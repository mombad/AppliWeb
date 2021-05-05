package entities;

import javax.persistence.*;
import java.util.*;

@Entity
public abstract class Compte {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int num;
	private String nom;
	private String prenom;
	private String mail;
	private String password;
	
	@ManyToMany(mappedBy="participants")
	LinkedList<Discussion> discussions;
}

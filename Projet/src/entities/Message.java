package entities;
import javax.persistence.*;
import java.util.*;

@Entity
public abstract class Message {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int num;
	
	@OneToOne
	Compte expediteur;
	
	@ManyToOne
	Discussion discussion;
}	

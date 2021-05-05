package entities;

import javax.persistence.*;
import java.util.*;

@Entity
public class Discussion {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int num;
	
	@ManyToMany
	LinkedList<Compte> participants;
	
	@OneToMany(mappedBy="discussion")
	Message messages;
	
}

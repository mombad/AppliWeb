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
	
	public Message(Compte expediteur, Discussion discussion) {
		super();
		this.expediteur = expediteur;
		this.discussion = discussion;
	}
	public Message() {
		super();
	}

	public Compte getExpediteur() {
		return expediteur;
	}

	public void setExpediteur(Compte expediteur) {
		this.expediteur = expediteur;
	}

	public Discussion getDiscussion() {
		return discussion;
	}

	public void setDiscussion(Discussion discussion) {
		this.discussion = discussion;
	}
}	

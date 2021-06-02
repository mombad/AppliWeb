package entities;

import javax.persistence.*;
import java.util.*;

@Entity
public class Discussion {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int num;
	private String sujet;
	
	@ManyToMany(fetch = FetchType.EAGER)
	Collection<Compte> participants;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy="discussion")
	Collection<Message> messages;
	
	
	public Discussion(Collection<Compte> participants, String sujet) {
		super();
		this.participants = participants;
		this.sujet = sujet;
	}
	public Discussion() {
		super();
	}

	public Collection<Compte> getParticipants() {
		return participants;
	}

	public void setParticipants(Collection<Compte> participants) {
		this.participants = participants;
	}

	public Collection<Message> getMessages() {
		return messages;
	}

	public void setMessages(Collection<Message> messages) {
		this.messages = messages;
	}
	
	public String getSujet() {
		return this.sujet;
	}
	
	public int getNum() {
		return this.num;
	}
	
	
	
	
}

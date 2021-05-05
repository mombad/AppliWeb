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
	LinkedList<Message> messages;
	
	
	public Discussion(LinkedList<Compte> participants) {
		super();
		this.participants = participants;
		this.messages = new LinkedList<Message>();
	}

	public LinkedList<Compte> getParticipants() {
		return participants;
	}

	public void setParticipants(LinkedList<Compte> participants) {
		this.participants = participants;
	}

	public LinkedList<Message> getMessages() {
		return messages;
	}

	public void setMessages(LinkedList<Message> messages) {
		this.messages = messages;
	}
	
	
	
	
}

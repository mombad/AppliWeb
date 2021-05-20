package entities;

import javax.persistence.*;
import java.util.*;

@Entity
public class Discussion {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int num;
	
	@ManyToMany
	Collection<Compte> participants;
	
	@OneToMany(mappedBy="discussion")
	Collection<Message> messages;
	
	
	public Discussion(Collection<Compte> participants) {
		super();
		this.participants = participants;
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
	
	
	
	
}

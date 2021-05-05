package entities;

import javax.persistence.Entity;

@Entity
public class MessageVocal extends Message {

	String path;

	public MessageVocal(Compte expediteur, Discussion discussion,String path) {
		super(expediteur, discussion);
		this.path = path;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}

package entities;

import javax.persistence.Entity;

@Entity
public class MessageImage extends Message {

	String path;

	public MessageImage(Compte expediteur, Discussion discussion, String path) {
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

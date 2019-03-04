package no.hvl.dat110.messages;

public class PublishMsg extends Message {
	
	private String message;
	
	public PublishMsg(String user, String topic) {
		super(MessageType.PUBLISH, user);
		this.message = topic;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String topic) {
		this.message = topic;
	}

	@Override
	public String toString() {
		return "PublishMsg [message=" + message + ", Message" + super.toString() + "]";
	}
}

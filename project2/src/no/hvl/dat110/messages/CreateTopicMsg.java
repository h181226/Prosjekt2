package no.hvl.dat110.messages;

public class CreateTopicMsg extends Message {
	
	// TODO: 
	// Implement objectvariables, constructor, get/set-methods, and toString method
	
	private String topic;
	
	public CreateTopicMsg(MessageType type, String user, String topic) {
		super(type, user);
		this.topic = topic;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + "CreateTopicMsg [topic=" + topic + "]";
	}
	
	
	
}

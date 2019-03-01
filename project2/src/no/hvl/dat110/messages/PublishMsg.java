package no.hvl.dat110.messages;

public class PublishMsg extends Message {
	
	private String topic;
	
	public PublishMsg(String user, String topic) {
		super(MessageType.PUBLISH, user);
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
		return "PublishMsg [topic=" + topic + ", Message" + super.toString() + "]";
	}
}

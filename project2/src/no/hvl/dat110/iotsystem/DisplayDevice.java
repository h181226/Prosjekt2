package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;
import no.hvl.dat110.messages.PublishMsg;

public class DisplayDevice {
	
	private static final int COUNT = 10;
		
	public static void main (String[] args) {
		
		System.out.println("Display starting ...");
		
		// TODO - START
		
		Client client = new Client("TemperetureDevice", Common.BROKERHOST, Common.BROKERPORT);
		
		client.connect();
		
		client.createTopic(Common.TEMPTOPIC);
		
		client.subscribe(Common.TEMPTOPIC);
		
		for(int i = 0; i < COUNT; i++) {
			PublishMsg msg = (PublishMsg) client.receive();
			System.out.println("Broker: " + msg.getMessage());
		}
		
		// TODO - END
		
		System.out.println("Display stopping ... ");
		
		throw new RuntimeException("not yet implemented");
		
	}
}

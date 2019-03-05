package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;

public class TemperatureDevice {
	
	private static final int COUNT = 10;
	
	public static void main(String[] args) {
		
		TemperatureSensor sn = new TemperatureSensor();
		
		Client client = new Client("TemperetureDevice", Common.BROKERHOST, Common.BROKERPORT);
		
		client.connect();
		
		for(int i = 0; i < COUNT; i++) {
			client.publish(Common.TEMPTOPIC, "The temperature is: " + sn.read());
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("Feil i TemperatureDevice");
			}
		}
		
		client.disconnect();
		
		System.out.println("Temperature device stopping ... ");
	}
}

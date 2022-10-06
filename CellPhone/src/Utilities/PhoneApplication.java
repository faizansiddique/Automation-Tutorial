package Utilities;

public class PhoneApplication {

	public static void main(String[] args) {
		
		
		IncomingCalls ic = new IncomingCalls("236-516-2065");
		
		OutgoingCalls oc = new OutgoingCalls("9718474007", 34);
		
		System.out.println("Incoming Calls");
		ic.displayCall();
		System.out.println("Outgoing Calls");
		oc.displayCall();
		

	}

}

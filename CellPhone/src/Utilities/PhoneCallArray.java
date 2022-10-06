package Utilities;

public class PhoneCallArray {

	public static void main(String[] args) {
		
		PhoneService [] calls = new PhoneService[8];
		
		calls[0] = new IncomingCalls("1234");
		calls[1] = new IncomingCalls("1235");
		calls[2] = new OutgoingCalls("9876", 20);
		calls[3] = new OutgoingCalls("9877", 30);
		calls[4] = new IncomingCalls("1236");
		calls[5] = new OutgoingCalls("9878", 40);
		calls[6] = new IncomingCalls("1237");
		calls[7] = new OutgoingCalls("9879", 50);
		
		for(PhoneService call:calls) {
			call.displayCall();
			System.out.println();
		}

	}

}

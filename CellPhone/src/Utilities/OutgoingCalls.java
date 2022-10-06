package Utilities;

public class OutgoingCalls extends PhoneService {

	public final double RATE = 0.04;
	public int callduration;
	
//	public OutgoingCalls(String phoneNumber) {
//		super(phoneNumber);
//	}
	public OutgoingCalls(String phoneNumber, int callDuration) {
		super(phoneNumber);
		this.callduration = callDuration;
		this.price = RATE;
	}
	public void setCallDuration(int callDuration) {
		this.callduration = callDuration;
	}
	public int getCallDuration() {
		return this.callduration;
	}

	@Override
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	@Override
	public double getPrice() {
		return this.price;
	}

	@Override
	public void displayCall() {
		System.out.print("PhoneNumber: "+getPhoneNumber()+", "+RATE+" Call Duration: "+
						getCallDuration()+", Total Price: "+
						getPrice() * getCallDuration());
		
	}

}

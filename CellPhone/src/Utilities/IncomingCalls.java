package Utilities;

public class IncomingCalls extends PhoneService {

	public final double RATE = 0.02;
	public IncomingCalls(String phoneNumber) {
		super(phoneNumber);
		this.price = RATE;
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
		System.out.print("PhoneNumber: "+getPhoneNumber()+", "+RATE+", Total Price: "+
				getPrice());
		
	}
	
	
	

}

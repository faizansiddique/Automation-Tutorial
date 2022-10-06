package Utilities;

public abstract class PhoneService {
	
	String phoneNumber;
	double price;
	
	public PhoneService(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		this.price = 0.0;
	}
	public void SetPrice(double price) {
		this.price = price;
	}
	public abstract String getPhoneNumber();
	
	public abstract double getPrice();
	
	public abstract void displayCall();

}

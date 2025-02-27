package in.sp.beans;

public class Address {
	private int houseno;
	private String city;
	private int pincode;
	
	
	
	@Override
	public String toString() {
		return " #"+houseno+" , "+city+" - "+pincode ;
	}
	
}

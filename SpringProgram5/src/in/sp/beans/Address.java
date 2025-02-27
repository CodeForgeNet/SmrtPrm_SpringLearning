package in.sp.beans;

public class Address {
	private int houseno;
	private String city;
	private int pincode;
	
//	Here setter method is neccessary. so its up to you to provide getters method.
	
	public void setHouseno(int houseno) {
		this.houseno = houseno;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
//	After running main class it gives address object , so we have to provide getter method or we can Override the toString method.
	
	@Override
	public String toString() {
		return "#"+houseno +","+city+" - "+pincode ;
	}
	
}

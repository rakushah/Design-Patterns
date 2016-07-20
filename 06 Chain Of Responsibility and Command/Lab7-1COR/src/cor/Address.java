package cor;

public class Address {
	private String streetAddress;
	private String city;
	private String state;
	private String zipcode;

	public String getStreetAddress() {
		return streetAddress;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public Address(String streetAddress, String city, String state, String zipcode) {
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	public boolean isEmpty() {
		if (streetAddress == null || state == null || city == null || zipcode == null)
			return true;
		return false;
	}
	@Override
	public String toString(){
		return "StreetAdd : "+ streetAddress+" City : "+city+" State : "+state+" ZipCode :"+zipcode; 
	}
}

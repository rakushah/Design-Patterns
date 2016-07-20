package product;

public class Customer {

	private int customerId;
	private String name;
	private String address;
	
	public Customer(int id,String name,String address){
		this.customerId=id;
		this.name=name;
		this.address=address;
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}
	
	@Override
	public String toString(){
		return "CustomerId :"+customerId+" Name :"+name+" Address :"+address;
	}
}

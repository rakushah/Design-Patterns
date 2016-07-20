package client;

import java.util.Arrays;
import java.util.List;

import director.CallDirector;
import product.Agent;
import product.Customer;

public class BuilderClient {
	public static void main(String[] args){
		Customer customer1 = new Customer(1,"RajkumarShah", "Fairfield");
		Customer customer2 = new Customer(2,"Nisha", "Texes");
		List<Customer> customers = Arrays.asList(customer1, customer2);
		
		Agent agent = new Agent(1,"Nisha k","Chicago");

		CallDirector director = new CallDirector();
		director.initRequest(agent);
		director.buildRequest(customers, "Fairfield", "RajkumarShah", "Request information here", "Response information here");
		director.saveRequest(true, false);

		director.initRequest(agent);
		director.buildRequest(customers, "Boston", "Umesh Powdel", "Request information here", "Response information here");
		director.saveRequest(true, false);

		
	}

}

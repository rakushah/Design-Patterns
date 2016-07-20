package concreteBuilder;

import java.util.List;

import builderInterface.RequestBuilder;
import product.Agent;
import product.Call;
import product.Customer;
import product.Request;

public class CallRequestBuilder implements RequestBuilder {

	private Request request;

	@Override
	public Request getRequest() {
		return request;
	}

	@Override
	public void saveRequest(boolean isAnswered, boolean needCallBack) {
		request.setAnswered(isAnswered);
		request.setNeedCallBack(needCallBack);
		request.save();
		System.out.println("Save Request successful!");
		
	}

	@Override
	public void initRequest(Agent agent) {
		Call call=new Call();
		call.callPop(agent);
		request = new Request(call);
	}

	@Override
	public void buildCustomer(int id,String name, String address) {
		Customer cust=new Customer(id, name, address);
		request.setRequester(cust);
		
	}

	@Override
	public void buildRequestContent(String requestContent) {
		request.setReqContent(requestContent);
	}

	@Override
	public void buildResponseContent(String responseContent) {
		request.setRespContent(responseContent);
		
	}

	@Override
	public boolean loadUserProfile(String address, List<Customer> customers) {
		for (Customer customer : customers) {
			if (customer.getAddress() == address) {
				request.setRequester(customer);
				System.out.println("Load Customer: " + customer.getName() + ", " + customer.getAddress());
				return true;
			}
		}
		return false;
	}

}

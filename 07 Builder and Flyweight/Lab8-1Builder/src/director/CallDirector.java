package director;

import java.util.List;

import builderInterface.RequestBuilder;
import concreteBuilder.CallRequestBuilder;
import product.Agent;
import product.Customer;
import product.Request;

public class CallDirector {
	private RequestBuilder requestBuilder = null; 
	
	public CallDirector(){
		requestBuilder=new CallRequestBuilder();
	}
	public void initRequest(Agent agent) {
		requestBuilder.initRequest(agent);
	}
	
	public void buildRequest(List<Customer> customers, String add, String name, String request, String response) {
		if (!requestBuilder.loadUserProfile(add, customers)) {
			requestBuilder.buildCustomer(1,name, add);
		}

		requestBuilder.buildRequestContent(request);
		requestBuilder.buildResponseContent(response);
	}

	public void saveRequest(boolean isAnswered, boolean needCallBack) {
		requestBuilder.saveRequest(isAnswered, needCallBack);
	}

	public Request getRequest() {
		return requestBuilder.getRequest();
	}
}

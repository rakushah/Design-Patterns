package builderInterface;

import java.util.List;

import product.Agent;
import product.Customer;
import product.Request;

public interface RequestBuilder {

	public void initRequest(Agent agent);

	public boolean loadUserProfile(String phone, List<Customer> customers);

	public void buildCustomer(int id, String name, String address);

	public void buildRequestContent(String requestContent);

	public void buildResponseContent(String responseContent);

	public Request getRequest();

	public void saveRequest(boolean isAnswered, boolean needCallBack);
}

package cor;

public class CallRecord {
	private Customer customer;
	private Agent agent;
	private RequestInformation requestInformation;
	private boolean isValid;
	private boolean isASalesLead;

	public Customer getCustomer() {
		return customer;
	}

	public Agent getAgent() {
		return agent;
	}

	public RequestInformation getRequestInformation() {
		return requestInformation;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	public void setRequestInformation(RequestInformation requestInformation) {
		this.requestInformation = requestInformation;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}

	public void setASalesLead(boolean isASalesLead) {
		this.isASalesLead = isASalesLead;
	}

	public boolean isValid() {
		return isValid;
	}

	public boolean isASalesLead() {
		return isASalesLead;
	}
	public boolean isEmpty() {
		try{
			if (this.customer.isEmpty() || this.agent.isEmpty()||this.requestInformation==null)
				return true;
			return false;
		}catch(NullPointerException e){
			return true;
		}
		
	}

	public CallRecord(Customer customer, RequestInformation requestInformation, Agent agent) {
		this.customer = customer;
		this.requestInformation = requestInformation;
		this.agent=agent;
	}
	
	@Override
	public String toString(){
		return "Customer : "+ customer +" Agent :"+agent+" IsValid : "+isValid+" isASalesLead :"+isASalesLead;
	}

}

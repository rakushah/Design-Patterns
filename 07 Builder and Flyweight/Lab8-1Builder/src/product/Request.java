package product;

public class Request {
	private String reqId;
	private Customer requester;
	private Agent agent;
	private String reqContent;
	private String respContent;
	private boolean isAnswered;
	private boolean isSaleLead;
	private boolean needCallBack;
	
	public Request(Call call){
		this.reqId=call.getRequestId();
		this.agent=call.getAgent();
	}
	
	public void setReqId(String reqId) {
		this.reqId = reqId;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	public void setRequester(Customer requester) {
		this.requester = requester;
	}

	public void setReqContent(String reqContent) {
		this.reqContent = reqContent;
	}

	public void setRespContent(String respContent) {
		this.respContent = respContent;
	}

	public void setAnswered(boolean isAnswered) {
		this.isAnswered = isAnswered;
	}

	public void setSaleLead(boolean isSaleLead) {
		this.isSaleLead = isSaleLead;
	}

	public void setNeedCallBack(boolean needCallBack) {
		this.needCallBack = needCallBack;
	}

	public String getReqId() {
		return reqId;
	}
	public Customer getRequester() {
		return requester;
	}
	public Agent getAgent() {
		return agent;
	}
	public String getReqContent() {
		return reqContent;
	}
	public String getRespContent() {
		return respContent;
	}
	public boolean isAnswered() {
		return isAnswered;
	}
	public boolean isSaleLead() {
		return isSaleLead;
	}
	public boolean isNeedCallBack() {
		return needCallBack;
	}
	public void save() {
		//save request in database
	}

	@Override
	public String toString(){
		return "RequestID :"+reqId+"\nCustomer :"+requester+"\n Agent :"+agent+"\n Request :"+reqContent
				+"\n Response :"+respContent+"\n isAnswered :"+isAnswered+"\n isSalesLead :"+isSaleLead+
				"\n NeedCallBack :"+needCallBack;
				
	}
}

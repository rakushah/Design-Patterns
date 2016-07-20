package cor;

public class Agent {
	private String agentId;
	private Address workLocation;
	
	public Agent(String agentID,Address workLocation){
		this.agentId=agentID;
		this.workLocation=workLocation;
	}

	public String getAgentId() {
		return agentId;
	}

	public Address getWorkLocation() {
		return workLocation;
	}
	
	public boolean isEmpty(){
		if(agentId.isEmpty()||workLocation.isEmpty())
			return true;
		else
			return false;
	}
	@Override
	public String toString(){
		return "AgentId :"+agentId+" WordLocation :"+workLocation;
	}
}

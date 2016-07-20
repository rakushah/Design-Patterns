package product;

public class Agent {

	private int agentId;
	private String name;
	private String address;
	
	public Agent(int agentId,String name,String address){
		this.agentId=agentId;
		this.name=name;
		this.address=address;
	}

	public int getAgentId() {
		return agentId;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}
	@Override
	public String toString(){
		return "AgentId :"+agentId+" Name :"+name+" Address :"+address;
	}
}

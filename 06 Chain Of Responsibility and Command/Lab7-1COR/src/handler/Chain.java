package handler;

import cor.CallRecord;

public interface Chain {

	public void setNextChain(Chain nextChain);
	
	public void performAction(CallRecord record);
}

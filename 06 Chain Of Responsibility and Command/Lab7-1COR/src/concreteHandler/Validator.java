package concreteHandler;

import cor.CallRecord;
import cor.RequestInformation;
import handler.Chain;

public class Validator implements Chain {
	private Chain nextChain;

	@Override
	public void setNextChain(Chain nextChain) {
		this.nextChain = nextChain;
	}

	@Override
	public void performAction(CallRecord record) {
		if (record.getRequestInformation().equals(RequestInformation.Validator)) {
			//record is valid
			if (!record.isEmpty()) {
				record.setValid(true);
				record.setRequestInformation(RequestInformation.DataWasher);
				nextChain.performAction(record);
			}else{
				//record is valid so saved in discarded request files
				record.setValid(false);
				System.out.println("Invalid Request will be saved in discarded request files. ");
			}

			
		} else {
			if (record.isValid()) {
				nextChain.performAction(record);
			} else {
				//record is valid so saved in discarded request files
				System.out.println("Invalid Request will be saved in discarded request files. ");
			}
		}
	}

}

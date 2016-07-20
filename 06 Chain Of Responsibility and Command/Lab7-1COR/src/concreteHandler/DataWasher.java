package concreteHandler;

import cor.CallRecord;
import cor.RequestInformation;
import handler.Chain;

public class DataWasher implements Chain {
	private Chain nextChain;

	@Override
	public void setNextChain(Chain nextChain) {
		this.nextChain = nextChain;
	}

	@Override
	public void performAction(CallRecord record) {
		if (record.getRequestInformation().equals(RequestInformation.DataWasher)) {
			record.setASalesLead(true);
			record.setRequestInformation(RequestInformation.Reportor);
			nextChain.performAction(record);
		} else {
			if (record.isASalesLead()) {
				nextChain.performAction(record);
			} else {
				System.out.println("Invalid Request will be saved in discarded request files. ");
			}
		}
	}

}

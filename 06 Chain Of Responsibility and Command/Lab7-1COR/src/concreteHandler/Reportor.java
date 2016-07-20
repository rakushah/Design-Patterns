package concreteHandler;

import cor.CallRecord;
import cor.RequestInformation;
import handler.Chain;

public class Reportor implements Chain {
	private Chain nextChain;

	@Override
	public void setNextChain(Chain nextChain) {
		this.nextChain = nextChain;
	}

	@Override
	public void performAction(CallRecord record) {
		if (record.getRequestInformation().equals(RequestInformation.Reportor)) {
			if (record.isASalesLead()) {
				System.out.println(record);
			}
			
		} else {

			System.out.println("Request must be first passed through Validator and DataWasher ");

		}
	}

}

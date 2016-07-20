package client;

import java.util.ArrayList;
import java.util.List;

import concreteHandler.DataWasher;
import concreteHandler.Reportor;
import concreteHandler.Validator;
import cor.Address;
import cor.Agent;
import cor.CallRecord;
import cor.Customer;
import cor.RequestInformation;
import handler.Chain;

public class Client {
	public static void main(String[] args){
		Chain validator=new Validator();
		Chain dataWasher=new DataWasher();
		Chain reportor=new Reportor();
		
		validator.setNextChain(dataWasher);
		dataWasher.setNextChain(reportor);
		
		List<CallRecord> callRecords=createCallRecords();
		
		for(CallRecord record:callRecords){
			validator.performAction(record);
		}
	}
	public static List<CallRecord> createCallRecords(){
		Address address1 = new Address("1000N 4th Street", "Fairfield", "IA", "345678");
		Address address2 = new Address("1100N 4th Street", "Fairfield", "IA", "23456");
		Address address3 = new Address("1200N 4th Street", "Fairfield", "IA", "12345");

		Agent agent1 = new Agent("1", address3);
		Agent agent2 = new Agent("2",address1);
		List<CallRecord> callRecords = new ArrayList<>();
		
		Customer customer1 = new Customer("Rajkumar", "Shah", address1, "6414513279", "rak@gmail.com");
		CallRecord callRecord1 = new CallRecord(customer1, RequestInformation.Validator,agent1);
		callRecords.add(callRecord1);
		
		Customer customer2 = new Customer("Nisha", "Bashnet", address2, "6414513117", "nisha@gmail.com");
		CallRecord callRecord2 = new CallRecord(customer2, RequestInformation.Validator,agent2);
		callRecords.add(callRecord2);
		
		Customer customer3 = new Customer("Lokesh", "Bhattrai", address3, "6414513278", "lokeshbhattrai@gmail.com");
		CallRecord callRecord3 = new CallRecord(customer3,  RequestInformation.Validator,agent2);
		callRecords.add(callRecord3);
		
		CallRecord callRecord4 = new CallRecord(null,  RequestInformation.Validator,agent2);
		callRecords.add(callRecord4);
		
		return callRecords;
	}

}

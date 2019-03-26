package com.BridgeIt.Oops.commercialDataProcessing;

import java.io.File;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class StockAccount implements StockInterface
{
	Stack stack = new Stack(100);
	LinkedList linkedlist = new LinkedList();
	StackList stacklist = new StackList();
	Queue queue = new Queue(100);
	QueueList queuelist = new QueueList();
	private Customer customer;
	private CompanyShares companyShares;
	static ObjectMapper mapper = new ObjectMapper();
	File customerfile= new File("/home/admin123/Documents/workourt/Java-Programs/src/com/BridgeIt/Oops/commercialDataProcessing/Customer.json");
	File companySharefile= new File("/home/admin123/Documents/workourt/Java-Programs/src/com/BridgeIt/Oops/commercialDataProcessing/Customer.json");
	
	 public StockAccount() {
		// TODO Auto-generated constructor stub
	}
	 public StockAccount(String filename )
	 {
		 StockUtility.addAccount(filename);
		 
	 }
	
	@Override
	public double valueOf() {

		
		return 0;
	}
	@Override
	public void buy(int amount, String symbol) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void sell(int amount, String symbol) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void save(String fileName) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void printReport() {
		// TODO Auto-generated method stub
		
	}

	
}

package com.BridgeIt.Oops.commercialDataProcessing;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.BridgeIt.util.Utility;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class StockUtility {
	static ObjectMapper objectmapper = new ObjectMapper();
	/*****************************************************
	 * perpose: This Method To add account if dosen't exits
	 * return:void
	 ******************************************************/

	public static void addAccount(String fileName) {
		fileName = "/home/admin123/Documents/workourt/Java-Programs/src/com/BridgeIt/Oops/commercialDataProcessing/" + fileName;
		try {
			List<Customer> customerList = objectmapper.readValue(new File(fileName),
					new TypeReference<List<Customer>>() {
					});
			StockAccount stockAccount = new StockAccount();
			System.out.println("Enter Customer Name ");
			String customerName = Utility.getNextLine().toUpperCase();
			if (searchCustomerIndex(customerName, customerList) == -1) {
				Customer newCustomer = new Customer(customerName);
				customerList.add(newCustomer);
				System.out.println("\nNew Customer added : " + customerName + "\n");
				stockAccount.save(fileName, customerList);
				System.out.printf("\n%-15s %-20s %-20s %-20s\n", "Cust. Name", "SHIVA(Shares)", "JOKER(Shares)",
						"RAVANA(Shares)");
				System.out.println("-----------------------------------------------------------------------------");
				System.out.println(customerList.get(searchCustomerIndex(customerName, customerList)).toString());
			} 
			else {
				System.out.println("\nCustomer already exist!");
			}

		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	/******************************************************
	 * perpose: To search by name  of CustomerName 
	 * return:int
	 ******************************************************/

	public static int searchCustomerIndex(String searchName, List<Customer> customerList)
	{
		int count = 0;
		int index = -1;
		for(int i = 0; i < customerList.size(); i++)
		{
			count = 0;
			String custName = customerList.get(i).getName();
			if(searchName.compareTo(custName) == 0)
			{
				index = i;
				break;
			}
			else
			{
				count++;
			}
		}
		if(count != 0)
		{
			System.err.println("Customer not found!");
		}
		
		return index;
	}
	
	/*****************************************************
	 * perpose: To search by symbol of comany share
	 * return:int
	 ******************************************************/
	public static int searchSharesBySymbol(String symbol, List<CompanyShares> companySharesList)
	{
		int count = 0;
		int index = -1;
		for(int i = 0; i < companySharesList.size(); i++)
		{
			count = 0;
			String companySymbol = companySharesList.get(i).getStockSymbol();
			if(symbol.compareTo(companySymbol) == 0)
			{
				index = i;
				break;
			}
			else
			{
				count++;
			}
		}
		if(count != 0)
		{
			System.out.println("Customer not found!");
		}
		
		return index;
	}
}

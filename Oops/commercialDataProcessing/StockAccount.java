package com.BridgeIt.Oops.commercialDataProcessing;

/*******************************************
 * purpose: To implement interface and abstract
 * 
 * 
 ************************************************/

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import com.BridgeIt.util.Utility;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class StockAccount implements StockInterface {

	Stack stack = new Stack(100);
	LinkedList linkedlist = new LinkedList();
	StackList stacklist = new StackList();
	Queue queue = new Queue(100);
	QueueList queuelist = new QueueList();
	private Customer customer;
	private CompanyShares companyShares;
	static ObjectMapper objectmapper = new ObjectMapper();
	File customerfile = new File(
			"/home/admin123/Documents/workourt/Java-Programs/src/com/BridgeIt/Oops/commercialDataProcessing/Customer.json");
	File companySharefile = new File(
			"/home/admin123/Documents/workourt/Java-Programs/src/com/BridgeIt/Oops/commercialDataProcessing/CompanyShares.json");

	public StockAccount() {

	}

	public StockAccount(String filename) {
		StockUtility.addAccount(filename);

	}

	@Override
	public double valueOf() {

		try {
			List<Customer> customerList = objectmapper.readValue(customerfile, new TypeReference<List<Customer>>() {
			});
			List<CompanyShares> companySharesList = objectmapper.readValue(companySharefile,
					new TypeReference<List<CompanyShares>>() {
					});
			System.out.println("Enter Customer/Person Name");
			String searchName = Utility.getStringName().toUpperCase();
			int index = StockUtility.searchCustomerIndex(searchName, customerList);
			if (index != -1) {
				Customer customer = new Customer();
				customer = customerList.get(index);
				int shivaShare = companySharesList.get(index).getPrice() * customer.getShivaShares();
				int jokerShare = companySharesList.get(index).getPrice() * customer.getJokerShares();
				int ravanShare = companySharesList.get(index).getPrice() * customer.getRavanaShares();
				int totalValue = shivaShare + jokerShare + ravanShare;
				System.out.println("Totalshare");

				System.out.print("\nTotal Value of Stock: ");

				return (double) totalValue;
			} else {
				return -1;
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		return 0;
	}

	public void list() {

		try {
			List<CompanyShares> companySharesList = objectmapper.readValue(companySharefile,
					new TypeReference<List<CompanyShares>>() {
					});
			List<Customer> customerList = objectmapper.readValue(customerfile, new TypeReference<List<Customer>>() {
			});

			String str = "";
			// List<>abcd=objM.readValue(new File(path),new TypeReference<List<setter>>()
			// {});
			for (int i = 0; i < companySharesList.size(); i++) {
				str = companySharesList.get(i).toString();
				// System.out.println(""+set);
				linkedlist.add(str);

			}

		} catch (IOException e) {
			System.out.println("" + e.getMessage());
			e.printStackTrace();
		}

	}

	@Override
	public void buy(int amount, String symbol) {
		try {
			List<CompanyShares> companySharesList = objectmapper.readValue(companySharefile,
					new TypeReference<List<CompanyShares>>() {
					});
			List<Customer> customerList = objectmapper.readValue(customerfile, new TypeReference<List<Customer>>() {
			});
			System.out.println("Enter The Person Name ");
			String searchName = Utility.getStringName().toUpperCase();
			int custIndex = StockUtility.searchCustomerIndex(searchName, customerList);
			int stockIndex = StockUtility.searchSharesBySymbol(symbol, companySharesList);
			String stackSymbol = null;
			CompanyShares companyShares = null;
			if (custIndex != -1) {

				companyShares = companySharesList.get(stockIndex);
				int noOfShares = companyShares.getNoOfShares();
				companyShares.setNoOfShares(noOfShares - amount);
				stackSymbol = companyShares.getStockSymbol();
				// ls.add(companyShares);

				// System.out.println(stockIndex);
				Customer customer = customerList.get(custIndex);
				if (stockIndex == 0) {
					int value = customer.getShivaShares();
					customer.setShivaShares(value + amount);
				}
				if (stockIndex == 1) {
					int value = customer.getJokerShares();
					customer.setJokerShares(value + amount);
				}
				if (stockIndex == 2) {
					int value = customer.getRavanaShares();
					customer.setRavanaShares(value + amount);
				} else {
					System.err.println("Stock Not Found ");
				}
			}
			System.out.println("\n----------Stock Details----------");
			System.out.printf("%-15s %-20s %-20s\n", "Company_Name", "NO._of Stocks", "Price");
			System.out.println(companySharesList.get(stockIndex).toString());
			System.out.printf("\n%-15s %-20s %-20s %-20s\n", "Cust. Name", "SHIVA(Shares)", "JOKER(Shares)",
					"RAVAN(Shares)");
			System.out.println("-------------------------------------------------------------------");
			System.out.println(customerList.get(custIndex).toString());
			System.out.println("==================In LIST==================");
			// ls.add(companyShares);
			System.out.println("Company Shares in LIST:");
			list();
			linkedlist.print();

			System.out.println("---------------------------------------------");

			stack.push(stackSymbol);
			System.out.println("Company Symbol in STACK LIST:");
			stacklist.print();
			System.out.println("-------------------------------------------");

			String str = "";
			Date currentDate = new Date();
			str = currentDate.toString();
			queue.enqueue(str);
			// System.out.println("Date in QueueList:");

			queue.push(str);
			stacklist.print();
			System.out.println("");

			// System.out.println("Queue LIST");
			// ls2.print();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void sell(int amount, String symbol) {
		try {

			List<CompanyShares> companySharesList = objectmapper.readValue(companySharefile,
					new TypeReference<List<CompanyShares>>() {
					});
			List<Customer> customerList = objectmapper.readValue(customerfile, new TypeReference<List<Customer>>() {
			});

			int stockIndex = StockUtility.searchSharesBySymbol(symbol, companySharesList);
			System.out.println("Enter the person name");
			String searchName = Utility.getNextLine().toUpperCase();
			int custIndex = StockUtility.searchCustomerIndex(searchName, customerList);
			String stackSymbol = "";
			CompanyShares companyShares = null;
			if (custIndex != -1) {
				companyShares = companySharesList.get(stockIndex);
				int noOfShares = companyShares.getNoOfShares();
				companyShares.setNoOfShares(noOfShares + amount);

				System.out.println("");
				stackSymbol = companyShares.getStockSymbol();
				// ls.add(companyShares);

				// System.out.println(stockIndex);
				Customer customer = customerList.get(custIndex);
				if (stockIndex == 0) {
					int value = customer.getShivaShares();
					customer.setShivaShares(value - amount);
				}
				if (stockIndex == 1) {
					int value = customer.getJokerShares();
					customer.setJokerShares(value - amount);
				}
				if (stockIndex == 2) {
					int value = customer.getRavanaShares();
					customer.setRavanaShares(value - amount);
				}
			} else {
				System.err.println("stock not found!");
			}

			objectmapper.writerWithDefaultPrettyPrinter().writeValue(companySharefile, companySharesList);
			objectmapper.writerWithDefaultPrettyPrinter().writeValue(customerfile, customerList);

			System.out.println("\n----------Stock Details----------");
			System.out.printf("%-15s %-20s %-20s\n", "Company Name", "NO. of Stocks", "Price");
			System.out.println("---------------------------------------------------------------------");
			System.out.println(companySharesList.get(stockIndex).toString());

			System.out.println("\n----------Customer Details----------");
			System.out.printf("\n%-15s %-20s %-20s %-20s\n", "Cust. Name", "Shiva(Shares)", "Joker(Shares)",
					"Ravana(Shares)");
			System.out.println("----------------------------------------------------------------------");
			System.out.println(customerList.get(custIndex).toString());
			System.out.println("==================In LIST==================");

			System.out.println("Company Shares in LIST:");
			list();
			linkedlist.print();

			System.out.println("---------------------------------------------");
			stack.push(stackSymbol);
			System.out.println("Company Symbol in STACK LIST:");
			stacklist.print();
			System.out.println("-------------------------------------------");

			String str = "";
			Date currentDate = new Date();
			str = currentDate.toString();
			queue.enqueue(str);
			// System.out.println("Date in QueueList:");

			queue.push(str);

			stacklist.print();
			System.out.println("");

			// System.out.println(""+str);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void save(String fileName, List<Customer> customerList) {
		try {
			objectmapper.writerWithDefaultPrettyPrinter().writeValue(new File(fileName), customerList);
		} catch (IOException e) {
			// e.printStackTrace();
		}
	}

	@Override
	public void printReport() {
		try {
			List<CompanyShares> companySharesList = objectmapper.readValue(companySharefile,
					new TypeReference<List<CompanyShares>>() {
					});
			List<Customer> customerList = objectmapper.readValue(customerfile, new TypeReference<List<Customer>>() {
			});
			System.out.println("\n----------Stock Details----------");
			System.out.printf("%-15s %-20s %-20s\n", "Company-Name", "NO.of Stocks", "Price");
			System.out.println("-----------------------------------------------------------------");
			for (int i = 0; i < companySharesList.size(); i++) {

				System.out.println(companySharesList.get(i).toString());
			}

			System.out.println("\n----------Customer Details----------");
			System.out.printf("\n%-15s %-20s %-20s %-20s\n", "Cust. Name", "SHIVA(Shares)", "JOKER(Shares)",
					"RAVANA(Shares)");
			System.out.println("----------------------------------------------------------------------");
			for (int i = 0; i < customerList.size(); i++) {
				System.out.println(customerList.get(i).toString());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public CompanyShares getCompanyShares() {
		return companyShares;
	}

	public void setCompanyShares(CompanyShares companyShares) {
		this.companyShares = companyShares;
	}
}

package com.BridgeIt.Oops;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;

public class StockReport 
{
	private List<Stock> stacks;
	public List<Stock> getStocks()
	{
		return stacks;
	}
	public void setStocks(List<Stock> stacks)
	{
		this.stacks=stacks;
	}
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		Scanner scanner1 = new Scanner(System.in);
		Scanner scanner2= new Scanner(System.in);
		System.out.println("Enter N Number of Stocks.. ");
		int n_NumberOf_stock=scanner.nextInt();
		ObjectMapper mapper = new ObjectMapper();
		List<Stock> stocks = new ArrayList();
		try {
		for (int i =0; i<n_NumberOf_stock;i++)
		{
			System.out.println("Enter  User-Name ");
			String name = scanner1.nextLine();
			System.out.println("Enter Company Name ");
			String company=scanner1.nextLine();
			System.out.println("Enter Company Symbol ");
			String symbol=scanner1.nextLine();
			System.out.println("Enter Number of Shares");
			int shares=scanner2.nextInt();
			System.out.println("Enter Price ");
			int price=scanner2.nextInt();
			int totalPrice=price*shares;
			System.out.println("The total price is:" + totalPrice);
			System.out.println("Done");
			System.out.println();

			Stock s = new Stock();
			s.setName(name);
			s.setCompany(company);
			s.setSymbol(symbol);
			s.setShares(shares);
			s.setPrice(price);
			s.setTotalprice(totalPrice);
			stocks.add(s);
		}
		
			mapper.writeValue(new File("/home/admin123/Documents/work/stock.json"), stocks);
			StockReport sockreport = new StockReport();
			 sockreport .setStocks(stocks);

			for (Stock s :  sockreport .getStocks()) {
				System.out.println("User Name:" + s.getName() + "\nCompany Name:" + s.getCompany() + "\nCompany Symbol:"
						+ s.getSymbol() + "\nShares:" + s.getShares() + "\nPrice:" + s.getPrice() + "\nTotal Price:"
						+ s.getTotalprice() + "\n");

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

package com.BridgeIt.Oops.commercialDataProcessing;

public interface StockInterface 
{
	public double valueOf();
	public void buy(int amount,String symbol);
	public void sell(int amount, String symbol);
	public void save(String fileName);
	public void printReport();

}

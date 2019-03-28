package com.BridgeIt.Oops.commercialDataProcessing;

public class Customer
{
	private String name ;
	private int shivaShares;
	private int jokerShares;
	private int ravanaShares;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("%-15s %-20d %-20d %-20d\n", name, shivaShares, jokerShares, ravanaShares));
		
		return sb.toString();
	}
	public Customer(String name)
	{
		this.name =name;
	}
		// for name 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	// for share
	public int getShivaShares() {
		return shivaShares;
	}

	public void setShivaShares(int shiva) {
		this.shivaShares = shiva;
	}

	public int getJokerShares() {
		return jokerShares;
	}

	public void setJokerShares(int jokerShares) {
		this.jokerShares = jokerShares;
	}

	public int getRavanaShares() {
		return ravanaShares;
	}

	public void setRavanaShares(int ravanaShares) {
		this.ravanaShares = ravanaShares;
	}
	
}

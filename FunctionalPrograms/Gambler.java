package com.BridgeIt.FunctionalPrograms;
/******************************************************************************************
 * 	@purpose      :  To find the wheather the person win or draw in gambler game 
 *  
 *  @author       :NK.CHANNAVEERA
 *  @version      : 1.0

 ******************************************************************************************/



import com.BridgeIt.util.Utility;

public class Gambler 
{
	public static void main(String[] args)
	{
		try
		{
			int bets, wins;
		System.out.println("Enter Stack value");
		int stake=Utility.getnumber();
		System.out.println("Enter goal value");
		int goal=Utility.getnumber();
		System.out.println("Enter times value");
		int times=Utility.getnumber();

		int result[] = Utility.playGame(stake, goal, times);
		bets = result[0];
		wins = result[1];
		System.out.println("Total no. of bets made  = " + bets);
		System.out.println("Total no. of wins = " + wins);
		double winPercentage = (wins * 100.0) / times;
		System.out.println("Win % = " + winPercentage);	
		System.out.println("Loss % = " + (100 - winPercentage));
		}
		catch (Exception e)
		{
			System.out.println(e);
			System.out.println("integer value ");
			// TODO: handle exception
		}
	
	}

}

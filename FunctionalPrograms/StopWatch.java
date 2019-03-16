package com.BridgeIt.FunctionalPrograms;

import com.BridgeIt.util.Utility;

public class StopWatch 
{
	static long startTime;
	static long stopTime;

		public void start()
		{
			startTime=System.currentTimeMillis();
		}
		public void stop() 
		{
			stopTime =System.currentTimeMillis();
		}
		public static void main(String[] args) 
		{
			StopWatch stopwatch =new StopWatch();
			System.out.println("enter 0 to start");
			try 
			{
			int j =Utility.getnumber();
			if (j==0) 
			{
				stopwatch.start();
				System.out.println(stopwatch.startTime);
			}
			System.out.println("enter 1 to stop");
			int i =Utility.getnumber();
			if (i==1)
			{
				stopwatch.stop();
				System.out.println(stopwatch.stopTime);
			}
			System.out.println("seconds= "+((stopwatch.stopTime)-(stopwatch.startTime))/1000);
			}
			catch (Exception e) 
			{
				System.out.println(e);
				// TODO: handle exception
			}
		
		}
}


		
		
	
	



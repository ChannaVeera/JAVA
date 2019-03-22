package com.BridgeIt.FunctionalPrograms;

import java.io.PrintWriter;

import com.BridgeIt.util.Utility;

public class Array2D 
{
	public static void main(String[] args)
	{
		try 
		{
			PrintWriter pw = new PrintWriter(System.out);
			System.out.println("enter 1.integer array");
			System.out.println("enter 2.double array");
			System.out.println("enter 3.boolean array");
			int choice = Utility.getnumber();
			switch (choice)
			{
			case 1:
				System.out.println("enter rows of array");
				int rows = Utility. getnumber();
				System.out.println("enter coloums of array");
				int coloums = Utility.getnumber();
				
				int arr[][] = new int[rows][coloums];
				System.out.println("enter your array");
				for (int i=0;i<arr.length;i++)
				{
					for (int j=0;j<arr.length;j++)
					{
						arr[i][j] = Utility.getnumber();
					}
				}
				for (int i=0;i<arr.length;i++)
				{
					for (int j=0;j<arr.length;j++)
					{
						pw.print(arr[i][j]+" ");
					}
					pw.println();
				}
				pw.flush();
				break;
				
				
			case 2:
				System.out.println("enter rows of array");
				int rowd = Utility.getnumber();
				System.out.println("enter coloums of array");
				int coloumd = Utility.getnumber();
				
				double arrd[][] = new double[rowd][coloumd];
				System.out.println("enter your array");
				for (int i=0;i<arrd.length;i++)
				{
					for (int j=0;j<arrd.length;j++)
					{
						arrd[i][j] = Utility.getDouble();
					}
				}
				for (int i=0;i<arrd.length;i++)
				{
					for (int j=0;j<arrd.length;j++)
					{
						pw.print(arrd[i][j]+" ");
					}
					pw.println();
				}
				pw.flush();
				break;
				
			case 3:
				System.out.println("enter rows of array");
				int rowb = Utility.getnumber();
				System.out.println("enter coloums of array");
				int coloumb = Utility.getnumber();
				
				boolean arrb[][] = new boolean[rowb][coloumb];
				System.out.println("enter your array");
				for (int i=0;i<arrb.length;i++)
				{
					for (int j=0;j<arrb.length;j++)
					{
						arrb[i][j] = Utility.scanBoolean();
					}
				}
				for (int i=0;i<arrb.length;i++)
				{
					for (int j=0;j<arrb.length;j++)
					{
						pw.print(arrb[i][j]+" ");
					}
					pw.println();
				}
				pw.flush();
				break;
			}
			
	}
		catch (Exception e) 
		{
			System.err.println(e);	// TODO: handle exception
		}
	}

}

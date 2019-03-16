package com.BridgeIt.AlgorithmPrograms;

import com.BridgeIt.util.Utility;


	public  class MergeSort 
	{
		public static void sort(String arr[],int st,int mid,int en )
		{
			int ls = mid-st+1;
			int rs = en-mid;
			String leftArr[] = new String[ls];
			String rightArr[] = new String[rs];
			// to get the values in left side of array
			for (int i=0;i<ls;i++)
			{
				leftArr[i] = arr[st+i]; 
			}
			//to get the values in right side of array
			for (int j=0;j<rs;j++)
			{
				rightArr[j] = arr[mid+1+j];
			}
			
			int i = 0,j=0;
			int k = 0;
			// used to store after merging
			while(i<ls&&j<rs)
			{
				if (leftArr[i].compareToIgnoreCase(rightArr[j])<0)
				{
					arr[k] = leftArr[i];
					i++;
				}
				else
				{
					arr[k] = rightArr[j];
					j++;
				}
				k++;
				
			}
			
			while(i<ls)
			{
				arr[k] = leftArr[i];
				i++;
				k++;
			}
			while(j<rs)
			{
				arr[k] = rightArr[j];
				j++;
				k++;
			}
		
		}
		
			
		public static void main(String[] args) 
		
		{
			try
			{
			System.out.println(" enter the size of array");
			int size = Utility.getnumber();
			String arr[] = new String [size];
			int st = 0;
			int en = arr.length;
			insertWord(arr);
			Utility.displayString(arr);
			divide(arr, st, en);
			Utility.displayString(arr);
			}
			catch (Exception e) 
			{
				System.out.println(e);// TODO: handle exception
			}
		}

////***************
		//to pass run time values
			public static void insertWord(String arr[]) 
			{

					System.out.println("enter your word  array");
					for (int i = 0; i < arr.length; i++) 
					{
						arr[i] = Utility.getStringName();
					}
			}		
			//recursion method to divide into two sub parts
			
			public static void divide(String arr[],int st,int en)
			{
				if (st<en)
				{
					int mid = st+(en-st)/2;
					divide(arr,st,mid);// dividing from start 
					divide(arr,mid+1,en);// dividing from middle
					sort(arr, st, mid, en);// final mearging
				}
	
			}

}
		
		

	
	



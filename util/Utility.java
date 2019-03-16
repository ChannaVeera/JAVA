package com.BridgeIt.util;


	import java.io.BufferedReader;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.InputStreamReader;
	import java.util.*;

	import com.BridgeIt.AlgorithmPrograms.PrimeNumber;



	@SuppressWarnings("unused")
	public class Utility 
	{
		/*
		 *pass the during run time
		 */
		
	//*****************************************************************\\
		public static Scanner scanner=new Scanner(System.in);
		public static Random random= new Random();
			public static String getStringName()
			{
				String name=scanner.next();
				return name;
			}
			public static int getnumber()
			{
				int number=scanner.nextInt();
				return number;
			}
			public static int getrandom()
			{
				int ranvalue= random.nextInt(10000);
				
				return ranvalue ;
				
			}
			public static double  getranDouble()
			{
				double pointvalue=random.nextDouble();
				return pointvalue;
			}
		
			public static double getDouble()
			{
				double value=scanner.nextDouble();
				return value;
			}
			public static String getNextLine()
			{
				String s1= scanner.nextLine();
				return s1;
			}
			
			
			
	//****************************************************************\\     
			/*harmonic value printing 
			 * logic is 1/1+1/2+1/3.....1/n.
			 * 
			 */
			public static void harmonic(int n) 
			{ 
				{
					
					float sum=0;
					for(int i=0;i<=n;i++)
					{
						sum=sum+(float)1/i;
					}
					System.out.println("for N harmonic number is"+sum);
					}
			}
	//**************************************************************
			/*
			 * 
			 */
			public static void flip(int numberOfFlips )
			{

				float head=0;
				float tail=0;
				try 
				{
					
					for(int i =0;i<=numberOfFlips;i++)
			
					{
						if(Math.random()>=0.5)// using random() method to get values randomly
						{
							head++; // to count how many times heads
						}
						else
						{
							tail++;// to count how many times tails
				
						}
					}
					System.out.println("percent of heads"+(head/numberOfFlips)*100+"%");
					System.out.println("percent of tails"+(tail/numberOfFlips*100)+"%");
					System.out.println(head);
					System.out.println(tail);
				}
				catch (Exception e) 
				{
					// 
					System.out.println(e);
					System.out.println("enter valid integer value");
				}

		
			}
	//****************************************************************************
			/*power 
			 * 
			 */
			public static void power(int power)
			{
				System.out.println("enter int value to caluclate");
				
				
			
					
					int value=0;
					if (power==0)
					{
						System.out.println(1);
					}
					for(int i=1;i<=power;i++)
					{
						value=(int)Math.pow(2, power);// inbuilt class Math  and inbuilt method pow();
						/* it is a double type convertion we explicitly converting it into interger value
						 * 
						 */
			
					}
					System.out.println("power of 2 for  "+power+"  is  "+value);
			}
				
			
	//************************************************************************************
		/*
		 * PrimeFactor
		 * 
		 */
			public static void primeFactors(int n) 
			{ 
			    // Print the number of 2s that divide n 
			    while (n%2==0) 
			    { 
			        System.out.print(2 + " "); 
			        n /= 2; 
			    } 

			    // n must be odd at this point.  So we can 
			    // skip one element (Note i = i +2) 
			    for (int i = 3; i <= Math.sqrt(n); i+= 2) 
			    { 
			        // While i divides n, print i and divide n 
			        while (n%i == 0) 
			        { 
			            System.out.print(i + " "); 
			            n /= i; 
			        } 
			    } 

			    // This condition is to handle the case when
			    // n is a prime number greater than 2 
			    if (n > 2) 
			        System.out.print(n); 
			} 

	//*********************************************************************************************
			/*
			 * 
			 * 
			 */
			public static void gamblerpro(int stack, int goal,int times)
			{
				int win=0;
				int bet=0;
				int loose=0;
				int cash = 0;
				for (int i=1;i<=times;i++)
					/*
					 * time is users intresr to play how may times 
					 */
				
				{
					 cash=stack;
					while (cash>0&&cash<=goal)//cash must grater then zero to bet in game 
						/*
						 * 
						 */
					{
						if(Math.random()<1)
						{
							cash++;
						}
						else 
						{
							cash--;
						}
						
					}
					if(cash>=goal)
					{
						win++;
					}
					else
					{
						loose++;
					}
					
				}
				System.out.println(cash);
				System.out.println(win+" wins of "+times);
				System.out.println(loose+"looses of "+times);
				System.out.println(" percentage of wins is "+100.0*win/times);
				System.out.println(" average bets percentage is "+ 1.0*bet/times);
				
				
			}
	//********************************************************************************************
			/*
			 * 
			 */
			
			public static void coupenNUm(int n )
			{
				ArrayList<Integer> arraylist = new ArrayList<Integer>();
				/*
				 * ArrayList is used to store the values,,& it is dynamic in size
				 * y not array it fixed in size 
				 */
				int count=0;// to count coupons present in it
				for(int i=0;i<=n;i++)// n is used to store how coupons user required 
				{
					
					int coup =(int)Utility.getrandom();
					count++;
					if(!arraylist.contains(coup))
					{
						arraylist.add(coup);
						/*if coupon dose not contain in list append the value in  
	 					* ArrayList...
	 					*/

					}
					else
					{
						i--;//to run loop again 
						
					}

				}
				
			     for(int k:arraylist)
		         System.out.println(k);	 
			     System.out.println("total of all distict number is"+count);
			     

				
				
			}
	//***************************************************************************
			/*
			 * 
			 * 
			 */
			public static void yeear(String year)
			{

				try //coz throw excption after entering alpabits
				{
					int checkleap=Integer.parseInt(year);
					//checking given number is leap or not 
				
					if(year.length()==4)
					{
							if(checkleap%4==0)
							{
								System.out.println(checkleap+"  is a leapyear");
							}
							else 						{
								System.out.println(checkleap+"is not leapyear");
							}
							
							
					}

					else
					{
						System.out.println("please enter valid 4-digit year");
				}
				}
			
					catch (Exception e) 
					{
						System.out.println(e);
						System.out.println("do not enter aplabits");
					}
			}

	//*****************************************************************************************\\
			/*
			 * 
			 * 
			 */
			public static void array2D(int row,int column)
			{
				   String arr[][] =new String[row][column];
			       System.out.println("enter the elements");
			       int j=0;
			       for(int i=0;i<row;i++)
			    	 //to count row
			       {
			    	   		for(j=0;j<column;j++)
							//to count coloumn 
							{
			    	   			arr[i][j]=Utility.getStringName();
							}
			       }
			       			for(int i=0;i<row;i++)
			       			{
			       				for( j=0;j<column;j++) 
			       				{
			       					System.out.print(arr[i][j]+" ");
			       				}
			       				
			       				System.out.println();
			       			}
			}
	//************************************************************************************************\\
			/*
			 * 
			 * 
			 */
			public static void sumOf(int n)
			{
				int[] arr = new int[n];
				int count=0;
				
						int length=n;
						for(int i=0 ; i< arr.length;i++)
						{
							for (int j=i+1;j<arr.length;j++)
							{
								for (int k =j+1; k <arr.length;k++)
								{
									if(arr[i]+arr[j]+arr[k]==0)
									{
										count++;
										System.out.println(arr[i]+"+"+arr[j]+"+"+arr[k]+"="+"0");
									}
								}
							}
						}
						System.out.println(""+count);
			}
	//**************************************************************************\\
			/*
			 * 
			 * 
			 */
			public static double dist(double a, double b)
			{
				double distance =Math.sqrt(((Math.pow(a, 2))+(Math.pow(b, 2))));
				return distance;
			}
	//*****************************************************************************************\\
			/*
			 * 
			 * 
			 */
			public static void swap(char[] ch,int i,int j)
			{ 
				//temp varible is to store values of char[i]
				char temp= ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
				
			}//swap is used to intern change elements given by user 
			public static void perumetation(char[]ch,int currentindex)
			//recercive function wash held here 
			{
				if(currentindex==ch.length-1)
				{
					System.out.println(String.valueOf(ch));
				}
				for(int i=currentindex;i<ch.length;i++)
				{
					swap(ch, currentindex, i);
					
					perumetation(ch, currentindex+1);
					swap(ch, currentindex, i);
				}
				
					
			}
	///*************************************************************************************\\\
			/*
			 * 
			 * 
			 */
			public static void quadratic(int a,int b,int c)
			{
				double delta = (b*b - 4*a*c);
				//caluclating delta value
			double	Root1ofx = (-b + Math.sqrt(delta))/(2*a);
			double	Root2ofx = (-b - Math.sqrt(delta))/(2*a);
				
					System.out.println(" first root of equation is "+ Root1ofx);
					System.out.println(" second root of equation is "+ Root2ofx);
				
			}
	//***************************************************************************\\
			/*
			 * 
			 * 
			 */
			public static double windchil(double temp, double windspeed)
			{
				double wind=35.74+0.6215+(0.4275*temp-35.75)*Math.pow(windspeed,0.16);
				return wind;
			}	
			public static void displayString(String a[])

			{

				for (int i1 = 0; i1 < a.length; i1++)

				{
					System.out.print(a[i1] + " ");
				}

				System.out.println();
				}
	//**********************************************************************************************\\
			/*
			 * com.BridgeIt.FunctionalPrograms
			 * Ends 
			 * 
			 */
			
	//&&&&&&&&&&************&&&&&&&&&&&&************&&&&&&&&&&***********&\\
			
			/*Starts
			 * BridgeIT.AlgorithmPrograms
			 * 
			 * 
			 * 
			 * 
			 * 
			 */
			public static char[] covertionOfStringToCharacterArray(String s1) 
			{
					char[] c1 = s1.toCharArray();
					
					return c1;
			}
			public static Boolean anagramlogic(String s1,String s2)
			
			{
					int s1Lenght=s1.length();
				// takes lenght 
					int s2Lenght=s1.length();
				if (s1Lenght==s2Lenght)
				{
					char[] char1= Utility.covertionOfStringToCharacterArray(s1);
					//converting String Char[] using inbuilt method
					char[] char2 =Utility.covertionOfStringToCharacterArray(s2);
					Arrays.sort(char1);
					Arrays.sort(char2);
					String s3 =new String(char1);
					//creating object to Store the value of sorted []
					String s4= new String(char2);
					if (s3.contains(s4))
					{
						System.out.println("Given char squence is Anagram");
						return true;
					}
					else
					{
						System.out.println("Given char squence is NotAnagram");
						
					}
		
				}
				return false;
				
			}
	//*****************************************************************************\\
			/*
			 * 
			 * 
			 */
			public static ArrayList<  String> PrimeNUmber(int range)
			{
				int i = 0;

				// creating a string type array list to store prime numbers
				ArrayList<String> al = new ArrayList<String>();
			
				// loop to repeate range times
				for (i = 1; i <= range; i++)
				{
					

						if (i % 2 == 0) 
						{
							al.add(i + "");
							System.out.println("values ar"+i);
						}
						
						
						
				}
				
				
					

						// adding prime numbers to arraylist
						return al;

				}
				
				
	//*******************************************************************************\\
			/*
			 * Sorting Techs
			 */
			
				
		public static void binarySearch()
		{
			System.out.println("enter number of elements to enter");
			int n = Utility.getnumber();
			System.out.println("enter array elements ");
			int[] array = new int[n];
			for (int i = 0; i < n; i++) 
			{
				//adding values
				array[i] = Utility.getnumber();
			}
			//
			int firstIndex = 0;
			int lastIndex = n-1;
			int middle = 0;
			System.out.println("enter search element");
			int search = Utility.getnumber();
			while(firstIndex<=lastIndex)
			{
				//it starts from searching from middle
				middle = (firstIndex+lastIndex)/2;
				
				if(array[middle] == search)
				{
					System.out.println(search +"is found at "+(middle+1)+"position");
					break;
				}
				else if (search>array[middle]) 
				{
					// if the value is not present at Middle 
					/*first value shiftd toword middle
					 *and starts counting 
					 * 
					 */
					firstIndex = middle+1;
				}
				else 
					{
						lastIndex = middle-1;
					}
			}
			System.out.println(search+" search element is founds at "+(middle+1));
			
		}
	//*********************************************************************\\
		
		
		public static void Binarysearchofstring()
		{
			System.out.println("enter string");
			 String first  = Utility.getNextLine();
			 // taking in put from user 
			 String [] sort1=first.split("");
			 // by using split method we split the values
			 Arrays.sort(sort1);
			 for(String k:sort1)
				
			 System.out.println(k);
			 System.out.println("enter  string to sort");
			 String search= Utility.getStringName();
			 int firstindex=0;
			 int lastindex=sort1.length-1;
			 long starttime=System.nanoTime();
			 // time to check 
			 long stoptime=0;
			 while(firstindex<=lastindex)
			 {
				 int mid=(firstindex+lastindex)/2;
				 if(search.compareTo(sort1[mid])==0)
						 {
					       stoptime=System.nanoTime();
					       System.out.println("search element found at"+(mid+1));
					       break;
						 }
				 if(search.compareTo(sort1[mid])>0)
						 {
					       firstindex=mid+1;
					       
						 }
				 else
				 {
					 lastindex=mid-1;
				 }
			 }
				 System.out.println(" time taken for searcing of string "+(stoptime-starttime));
				 
		}
	//**********************************************************************\\
			
			public static void insertionSort()
			{
				System.out.println("enter number of elements");
				int n = Utility.getnumber();
				int[] array = new int[n];
				System.out.println("array elements");
				for (int i = 0; i < array.length; i++) 
				{
					 array[i] = Utility.getnumber();
					
				}
				long startTime = System.nanoTime();
				long StopTime = 0;
				for(int j=1;j<=array.length-1;j++)
				{
				   int value = array[j];
				   // value which is present in that  index is stored 
				   int index = j;
				   //index value is stored
				   
				   while(index>0 && array[index-1]>value)
				   {
					   /*checking the value and index of array
					    * 
					    */
					   
					   array[index] = array[index-1];
					   index--;
				   }
				   array[index]=value;
				   //assign the value to array index
				}
				StopTime = System.nanoTime();
				for (int i = 0; i < array.length; i++) 
				{
					 System.out.println(array[i]); 
					
				}
				System.out.println("time taken for insertion sort of integer "+(StopTime-startTime));	
			}
	//***************************************************************************************************\\
			public static void insertionString()
			{
				System.out.println("enter string ");
				String enteredString = Utility.getNextLine();
				String[] arrayString = enteredString.split("");
				Arrays.sort(arrayString);
				long startTime = System.nanoTime();
				long StopTime = 0;
				for(int i = 1;i<=arrayString.length-1;i++)
				{
					String first = arrayString[i];
					int index = i;
					while((index>0) && (arrayString[index-1].compareTo(arrayString[index])>0))
					{
						arrayString[index] = arrayString[index-1];
						index-=1;
					}
					arrayString[index] = first;
				}
				StopTime = System.nanoTime();
				for(int j=0 ; j<= arrayString.length-1 ;j++)
				{
					System.out.print("  "+arrayString[j]);
				}
			
				System.out.println("time taken for insertion sort of String "+(StopTime-startTime));
			}
			
			
			//*****************************************************************************************\\
		
			
			public static void bubbleSortOfInteger() 
			{
				System.out.println("enter number of intergers");
				int n = Utility.getnumber();
				int[] array = new int[n];
				System.out.println("enter integers");
				for(int i=0 ;i<=array.length-1; i++)
				{
					array[i] = Utility.getnumber();
					
				}
				long startTime = System.nanoTime();
				long StopTime = 0;
				for(int j=0;j<=array.length-1;j++)
				{
					// loop to to run inner one 
					for(int k=0;k<=array.length-2;k++)
					{
						if(array[k]>array[k+1])
						{
							//swaping 
							int temp = array[k];
							array[k] = array[k+1];
							array[k+1] = temp;
						}
					}
				}
				StopTime = System.nanoTime();
				for(int index = 0;index<=array.length-1;index++)
				{
					System.out.println(array[index]);
				}
				System.out.println("time taken for bubble sort of integer "+(StopTime-startTime));
				
			}
			//***********************************************************************************\\
			public static void bubbleSortOfString()
			{
				System.out.println("enter string");
				String EnteredString = Utility.getNextLine();
				String[] array = EnteredString.split(" ");
				long startTime = System.nanoTime();
				long StopTime = 0;
						for(int j=0;j<=array.length-1;j++)
						{
							for(int k=0;k<=array.length-2;k++)
							{
								if(array[k].compareTo(array[k+1])>0)
								{
									String temp = array[k];
									array[k] = array[k+1];
									array[k+1] = temp;
								}
							}
						}
						StopTime = System.nanoTime();
						for(int index = 0;index<=array.length-1;index++)
						{
							System.out.println(array[index]);
						}	
						System.out.println("time taken for bubble sort of String "+(StopTime-startTime));
			}
	//***************************************************************************************************************\\
		public static void binaryStirng()
		{
			System.out.println("enter string");
			 String first  = Utility.getNextLine();
			 String [] sort1=first.split("");
			 Arrays.sort(sort1);
			 for(String k:sort1)
			 System.out.println(k);
			 System.out.println("enter  string to sort");
			 String search= Utility.getStringName();
			 int firstindex=0;
			 int lastindex=sort1.length-1;
			 long starttime=System.nanoTime();
			 long stoptime=0;
			 while(firstindex<=lastindex)
			 {
				 int mid=(firstindex+lastindex)/2;
				 if(search.compareTo(sort1[mid])==0)
						 {
					       stoptime=System.nanoTime();
					       System.out.println("search element found at"+(mid+1));
					       break;
						 }
				 if(search.compareTo(sort1[mid])>0)
						 {
					       firstindex=mid+1;
						 }
				 else
				 {
					 lastindex=mid-1;
				 }
			 }
			 stoptime=System.nanoTime();
			 System.out.println("Time Taken to sort"+(stoptime-starttime));
			//****************************************************************************************************\\
				 //System.out.println(" time taken for searcing of string "+(stoptime-starttime));
	    
		}
			public static boolean binarySearch(String arr[], String userSearch) {
				int count = 0;
				int firstIndex= 0;
				int endIndex = arr.length;
				while (firstIndex < endIndex) {
					int mid = firstIndex + (endIndex - firstIndex) / 2;
					if (arr[mid].equalsIgnoreCase(userSearch))// condition to check if strings are equal are not
					{
						count++;
					}

					if (arr[mid].compareToIgnoreCase(userSearch) > 1)// comparing the strings to trim array
					{
						firstIndex = mid + 1;
					} else {
						endIndex = mid - 1;
					}

				}

				if (count > 0)
				{
					return true;
				} 
				else 
				{
					return false;
				}
			}
			///**************************************************************************************************\\
		
			// public static boolean binarySearch(String arr[], String userSearch) is to search the element extercted from file 
			
			public static boolean binarysearchFile(String s1) throws Exception
			{
				String line;
				String path="/home/admin123/Documents/channa.txt";
				ArrayList<String > arraylist =new ArrayList<String>();     //to store values
				FileInputStream fileinput =new FileInputStream(path);   // to get the value from text file
				InputStreamReader inputStream =new InputStreamReader(fileinput); // to read  byte to char stream
				BufferedReader bufferReader =new BufferedReader(inputStream);  // to read char using buffer class
			
				while((line =bufferReader.readLine())!=null) 
					// data stored in line 
				{ 
					String word[]=line.split(" ");
					for (int i = 0; i < word.length; i++) {
						arraylist.add(word[i]);// adding to arraylist
		}
					
				}
				
				int size=arraylist.size();
				String list[] =new String [size];
				list=arraylist.toArray(list);// converting list to Array
				Arrays.sort(list);
				bufferReader.close();
				if(Utility.binarySearch(list, s1)== true)
				{
					return true;
				}
				else
				return false;
				
				
			}
			////////////////////////////////////////////////////////////////////////////
			/*
			 * 
			 */
			public static ArrayList<String>  primeAnagram()
			{
				ArrayList<String> arraylist =new ArrayList<>();
				ArrayList<String> arrayList = new ArrayList<>();
				arraylist.addAll(PrimeNUmber(1000));
				int size =arraylist.size();
				String[] arr = new String[size];
				arr = arraylist.toArray(arr);
				for(int i=0 ;i<arr.length;i++)
				{
					for(int j =0 ;j<arr.length;j++)
					{
						if(anagramlogic(arr[i], arr[j])== true)
						{
							arrayList.add(arr[i]);
						}
					}
				}
				return arrayList;
			}
			/////*
		
			public static ArrayList<Integer> palindrome() 
			{

			ArrayList<String> list = new ArrayList<String>();
			ArrayList<Integer> listp = new ArrayList<Integer>();

			// calling method to store all prime numbers
			list.addAll(Utility.PrimeNUmber(1000));

			int size = list.size();
			String[] arr = new String[size];

			// converting arraylist to string array
			arr = list.toArray(arr);

			int iarr[] = new int[arr.length];

			// converting string array to interger array
			for (int i = 0; i < arr.length; i++) {
				iarr[i] = Integer.parseInt(arr[i]);
			}

			// loop to find prime palindrome numbers
			for (int i = 0; i < iarr.length; i++) {
				int r = 0;
				int sum = 0;
				int temp1 = iarr[i];

				while (iarr[i] > 0) {
					r = iarr[i] % 10;
					sum = (sum * 10) + r;
					iarr[i] = iarr[i] / 10;
				}

				if (temp1 == sum) {
					listp.add(temp1);
					System.out.println(sum+"yes palandrom");

				}//else
					//System.out.println(sum+"no not a palandrom");

			}
			return listp; // return list of prime palindrome
		}

			///::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
			
				public static int getDay(int month,int year)
				{
					final int day=1;
					/*standard formulas to find the day falls on the date */
					int y = year - (14 - month) / 12;
					int x = y + y / 4 - y / 100 + y / 400;
					int m = month + 12 * ((14 - month) / 12) - 2;
					int d = (day + x + 31 * m / 12) % 7;
					switch (d) {
					case 0:System.out.println("Mon");			
						break;
					case 1: System.out.println("Tus");
						break;
					case 2: System.out.println("Wed");
						break;
					case 3:System.out.println("Ts");
						break;
					case 4: System.out.println("Fri");
						break;
					case 5: System.out.println("Sat");
						break;
					case 6:System.out.println("Sun");

					default:System.out.println("No Week found");
						break;
					}
					return d;// returning d value
				}
				///******************************************************||
				/*
				 * 
				 */
				public static void temp(int i)
				{
					switch(i)
					{
					case 1 : System.out.println("enter to show fahrinhear");
							 double fahrin_d=Utility.getDouble();
							 double celsiusToFahrenheit =(fahrin_d*9/5)+32;
							 System.out.println(celsiusToFahrenheit);
							 break;
					case 2 : System.out.println("Enter to show dgree");
						     double degree_d=Utility.getDouble();
						     double fahrenheitToCelsius=(degree_d-32)*(5/9);
							 System.out.println(fahrenheitToCelsius);
							 break;
					default: System.out.println("Enter valid Number(rance of (1-2))");

					}
				}
	//*****************************************************************************************************************\\
				public static double monthlyPayment(double P, double Y, double R) {
					double payment = 0;
					double n = (12 * Y);
					double r = R / (12 * 100);
					payment = (P * r) / (1 - Math.pow(1 + r, -n)); // standard formula to find monthly payment
					return payment;
			}
	//********************************************************************************************************************\\
		public static void vendingMachine(int n) {
					int notes = 0;
					int money[] = { 1000, 500, 100, 50, 10, 5, 2, 1 };

					for (int i = 0; i < money.length; i++) {
						if (n / money[i] > 0) {

							System.out.println(money[i] + " notes are " + n / money[i]);
							notes = notes + n / money[i];
							n = n % money[i];
						}

					}
					System.out.println("total number of notes returned by vendor machine is = " + notes);
			}
	//*************************************************************************************************************************\\
		public static double squarertnon(double c)
		{
			double t=c;
			double epsilon =1e-15;
			while(Math.abs((t-c/t))>epsilon*t)
			{
				t=((c/t+t)/2);
			}
			System.out.println(""+t);
			return t;
		}
	//**************************************************************************************************************************\\

		public static void guess (int[] arry,int last,int rare)
		{
			int mid;
			char ans;
			if (last==rare)
			{
				System.out.println("Your number is :"+arry[last]);
				return;
			}
			else
			{
						mid = (last + rare)/2;
						System.out.println("is your number Equal  or Smaller  Compred to :"+arry[mid]);
						System.out.println("Enter smaller 'y/n'");
						System.out.println("Enter Equal s:");
						ans =Utility.getStringName().toLowerCase().charAt(0);
						if (ans=='y')
							guess(arry, last, mid-1);
						else if (ans =='n')
							guess(arry, mid+1, rare);
						else if(ans=='s')
							System.out.println("your number is:"+arry[mid]);
						else
							System.out.println("Not in a range");
			}
		}
		
		
		
		
		
		
		
		
		
		
	}
			
			
			
			
			
			
			
			
			
			
			
			
			
			


			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

		



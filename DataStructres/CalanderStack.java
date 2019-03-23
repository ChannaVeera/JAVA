package com.BridgeIt.DataStructres;
/****************************************************************************************************
 * 	@purpose      :  To print calender of given month and year using StackUsing likedlist
 * 
 *  @author       :  NK.CHANNAVEERA
 *  @version      : 1.0
 *  @since        : 15-01-2019
 **************************************************************************************************/

import com.BridgeIt.DSUtlity.StackUsing_LinkedList;
import com.BridgeIt.util.Utility;

public class CalanderStack {
	static int arr[][] = new int[6][7];

	public static void main(String[] args) {

		StackUsing_LinkedList Stack = new StackUsing_LinkedList();
		StackUsing_LinkedList Stack1 = new StackUsing_LinkedList();
		int dayinmonth = 0;

		int month = Integer.parseInt(args[0]);
		int year = Integer.parseInt(args[1]);

		int days = Utility.getDay(month, 1, year);

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			dayinmonth = 31;

		} else if (month == 4 || month == 6 || month == 9 || month == 12) {
			dayinmonth = 30;
		} else if (month == 2) {
			if (isLeapyear(year) == true) {
				dayinmonth = 28;
			} else {
				dayinmonth = 29;
			}
		}
		int count = 1;
		for (int i = 0; i < 6; i++) {
			for (int j = days; j < 7; j++) {
				if (count <= dayinmonth) {
					arr[i][j] = count;
					// System.out.println(arr[i][j]);
					Stack.push(arr[i][j]);
					count++;

				} else {
					break;
				}

				// System.out.println(arr[i][j]);
			}
			days = 0;

		}

		for (int i = 1; i <= dayinmonth; i++) {
			Stack1.push(Stack.pop());
		}
		System.out.println("sun\tMon\tTue\twed\tThu\tFri\tSat");
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				if (arr[i][j] == 0) {
					System.out.print("\t");
				} else if (arr[i][j] > 9) {
					int val = (int) Stack1.pop();
					System.out.print(+val + "\t");
				} else {
					int val = (int) Stack1.pop();
					System.out.print(+val + "\t");
				}
			}
			System.out.println();
		}

	}

	/**
	 * Method for finding leap year
	 * 
	 * @param year:- Leap year
	 * @return:-boolean condition
	 */
	public static boolean isLeapyear(int year) {
		if ((year % 4 == 0) && (year % 100 != 0))
			return true;
		if (year % 400 == 0)
			return true;
		return true;
	}

}

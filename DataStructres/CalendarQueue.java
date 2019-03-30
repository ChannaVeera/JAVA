package com.BridgeIt.DataStructres;
/****************************************************************************************************
 * 	@purpose      :  To print calender of given month and year using QUEUE
 * 
 *  @author       :  NK.CHANNAVEERA
 *  @version      : 1.0
 *  @since        : 15-01-2019
 **************************************************************************************************/

import com.BridgeIt.DSUtlity.Queue;
import com.BridgeIt.util.Utility;

public class CalendarQueue {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		Queue queue = new Queue(100);

		String[] months = { "", "January", "February", "March", "April", "May", " June", "July", "August", "September",
				"October", "November", "December" };
		int[] date = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		int d = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int year = Integer.parseInt(args[2]);

		if (month == 2 && year(year)) {
			date[month] = 29;
		}

		int day = Utility.getDay(month, 1, year);
		int arr[][] = new int[6][7];
		int x = 1;

		for (int i = 0; i < 6; i++) {
			for (int j = day; j < 7; j++) {
				if (x <= date[month]) {
					arr[i][j] = x;
					x++;

				}
			}
			day = 0;
		}
		System.out.println("  " + months[month] + " " + d + " " + year);
		System.out.println("  Su  Mon Tue Wed Thu Fri Sat");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 7; j++) {

				if (arr[i][j] != 0) {
					System.out.printf("%4d", arr[i][j]);

					queue.enQueue(arr[i][j]);
				} else
					System.out.printf("    ");
			}
			System.out.println();
		}

	}

	public static boolean year(int year) {
		if (year % 4 == 0) {
			return true;
		} else {
			return false;
		}
	}

}

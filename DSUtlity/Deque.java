package com.BridgeIt.DSUtlity;

/****************************************************************************************************
 * @purpose : To hold common method of deque
 * 
 * @author : NK.CHANNAVEERA
 * @version : 1.0
 * @since : 19-03-2019
 **************************************************************************************************/

public class Deque<T> {
	int size;
	int front;
	int rear;
	T ch[];
	int chSize;

	/**
	 * @param int : It takes integer value as command line arguments
	 * @purpose : constractor to intilize the size of array
	 */
	public Deque(int chSize) {
		this.chSize = chSize;
	}

	/**
	 * @param char : It takes character value as command line arguments
	 * @purpose : To add a character element to object at front
	 * @return : void
	 */

	public void addFront(T data) {
		ch[front] = data;
		front++;
		size++;
	}

	/**
	 * @param char : It takes character value as command line arguments
	 * @purpose : To add a character element to object at rear
	 * @return : void
	 */
	public void addRear(T data) {
		if (rear == 0) {
			rear = chSize;
		}
		System.out.println(data);
		ch[rear] = data;
		rear++;
		size++;
	}

	/**
	 * @purpose : To get a character element from object at front position
	 * @return : char
	 */
	public T getFront() {
		T fr = ch[front];
		front++;
		return fr;
	}

	/**
	 * @purpose : To get a character element from object at rear position
	 * @return : char
	 */
	public T getrear() {
		rear = size - 1;
		T outPut = ch[rear];
		rear--;
		return outPut;
	}

	/**
	 * @purpose : To get size of object
	 * @return : int
	 */
	public int size() {
		return size;
	}

	/**
	 * @purpose : To display elements in object
	 * @return : void
	 */
	public void show() {
		// for loop to print elements in object
		for (int i = 0; i < size; i++) {
			System.out.println(ch[i]);
		}
	}
}

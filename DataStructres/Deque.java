package com.BridgeIt.DataStructres;

public class Deque<T> 
{
	int size;
	int front;
	int rear;
	char ch[];
	int chSize;
	public Deque(int chSize) 
	{
		this.chSize=chSize;
	}
	public void addFront(char data)
	{
		ch[front]=data;
		front++;
		size++;
	}
	public void addRear(char data)
	{
		if(rear==0)
		{
			rear=chSize;
		}
		ch[rear-1]=data;
		rear++;
		size++;
	}
	public char getFront()
	{
		char fr=ch[front];
		front++;
		return fr;
	}
	public char getrear()
	{
		rear=size-1;
		char outPut=ch[rear];
		rear--;
		return outPut;
	}
	public int size()
	{
		return size;
	}

}

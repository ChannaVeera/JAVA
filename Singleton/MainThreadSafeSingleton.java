package com.BridgeIt.Singleton;

public class MainThreadSafeSingleton {

	public static void main(String[] args) {
		ThreadSafeSingleton ts=ThreadSafeSingleton.getInstance();
		System.out.println(""+ts.hashCode());
		ThreadSafeSingleton ts1=ThreadSafeSingleton.getInstanceUsingDoubleLocking();
		System.out.println(""+ts1.hashCode());
	}

}

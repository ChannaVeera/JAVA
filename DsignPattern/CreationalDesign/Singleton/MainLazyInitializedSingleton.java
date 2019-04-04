package com.BridgeIt.DsignPattern.CreationalDesign.Singleton;

public class MainLazyInitializedSingleton {

	public static void main(String[] args) {
		LazyInitializedSingleton lis=LazyInitializedSingleton.getInstance();
		System.out.println(""+lis.hashCode());
		LazyInitializedSingleton lis1=LazyInitializedSingleton.getInstance();
		System.out.println(""+lis1.hashCode());
	}

}

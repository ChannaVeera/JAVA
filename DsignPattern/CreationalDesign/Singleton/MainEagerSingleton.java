package com.BridgeIt.DsignPattern.CreationalDesign.Singleton;

public class MainEagerSingleton {

	public static void main(String[] args) {

		{
			EagerInitializedSingleton es = EagerInitializedSingleton.getInstance();
			EagerInitializedSingleton es1 = EagerInitializedSingleton.getInstance();
			System.out.println("" + es.hashCode());
			System.out.println("" + es1.hashCode());

		}

	}
}

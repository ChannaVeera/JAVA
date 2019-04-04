package com.BridgeIt.DsignPattern.CreationalDesign.Singleton;

public class MainStaticBlockSingleton {

	public static void main(String[] args) {
		
		StaticBlockSingleton sbs=StaticBlockSingleton.getInstance();
		System.out.println(""+sbs.hashCode());
		StaticBlockSingleton sbs1=StaticBlockSingleton.getInstance();
		System.out.println(""+sbs1.hashCode());
	}

}

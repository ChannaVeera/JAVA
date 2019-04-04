package com.BridgeIt.DsignPattern.CreationalDesign.Singleton;

public class MainEnum {
	

	public static void main(String[] args) {
		EnumSingleton en=EnumSingleton.INSTANCE;
		System.out.println(""+en.hashCode());
		EnumSingleton en1=EnumSingleton.INSTANCE;
		System.out.println(""+en1.hashCode());

	}
	

}

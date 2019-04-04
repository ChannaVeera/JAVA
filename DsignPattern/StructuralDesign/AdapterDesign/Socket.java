package com.BridgeIt.DsignPattern.StructuralDesign.AdapterDesign;

public class Socket {

	public Volt getVolt(){
		return new Volt(120);
	}
}
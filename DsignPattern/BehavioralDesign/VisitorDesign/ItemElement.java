package com.BridgeIt.DsignPattern.BehavioralDesign.VisitorDesign;

public interface ItemElement {

	public int accept(ShoppingCartVisitor visitor);
}

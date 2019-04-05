package com.BridgeIt.DsignPattern.BehavioralDesign.VisitorDesign;

public interface ShoppingCartVisitor {

	int visit(Book book);
	int visit(Fruit fruit);
}

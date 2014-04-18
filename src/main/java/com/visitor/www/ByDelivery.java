package com.visitor.www;

public class ByDelivery implements Visitor {
	private String name;
	private final String method = "By Delivery";

	@Override
	public void visit(Food f) {
		name = f.order();
	}

	public String toString() {
		return name + " " + method;
	}
}

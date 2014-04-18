package com.visitor.www;

public class ByPickup implements Visitor {
	private String name;
	private final String method = "By Pick Up";

	@Override
	public void visit(Food f) {
		name = f.order();

	}

	public String toString() {
		return name + " " + method;
	}
}

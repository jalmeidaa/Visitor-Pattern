package com.visitor.www;

public class ByEatin implements Visitor {
	private String name;
	private final String method = "By Eat In";

	@Override
	public void visit(Food f) {
		name = f.order();

	}

	public String toString(){
		return name + " " + method;
	}
}

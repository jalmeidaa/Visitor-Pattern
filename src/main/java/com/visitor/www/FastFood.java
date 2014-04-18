package com.visitor.www;

public class FastFood implements Food {
	final String name = "FastFood";

	@Override
	public String order() {

		return name;
	}

}

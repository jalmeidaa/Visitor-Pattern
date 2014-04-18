package com.visitor.www;

public class StreetFood implements Food {
	final String name = "StreetFood";

	@Override
	public String order() {
		return name;
	}

}

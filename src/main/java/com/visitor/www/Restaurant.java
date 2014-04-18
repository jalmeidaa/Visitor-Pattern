package com.visitor.www;

public class Restaurant implements Food {

	final String name = "Restaurant";

	@Override
	public String order() {

		return name;
	}

}

package com.visitor.www;

public class DineIn {
	public Food getDineIn() {
		switch ((int) (Math.random() * 3)) {
		case 0:
			return new Restaurant();
		case 1:
			return new FastFood();
		case 2:
			return new StreetFood();
		default:
			return null;

		}
	}

	public Visitor howto() {
		switch ((int) (Math.random() * 3)) {
		case 0:
			return new ByPickup();
		case 1:
			return new ByEatin();
		case 2:
			return new ByDelivery();
		default:
			return null;
		}
	}

}

package com.visitor.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.visitor.www.DineIn;
import com.visitor.www.FastFood;
import com.visitor.www.Food;
import com.visitor.www.Restaurant;
import com.visitor.www.StreetFood;
import com.visitor.www.Visitor;

public class Test {

	public static void main(String[] args) {
		List<Food> foodList = new ArrayList<Food>();
		foodList.add(new Restaurant());
		foodList.add(new FastFood());
		foodList.add(new StreetFood());

		Iterator<Food> it = foodList.iterator();
		System.out.println("How many places for eating food? ");
		while (it.hasNext()) {
			System.out.println(((Food) it.next()).order());

		}
		DineIn d = new DineIn();
		Food fd = d.getDineIn();
		Visitor v = d.howto();
		v.visit(fd);
		System.out.println("\nWhich place for Dinning?");
		System.out.println(v);
	}

}

package com.hust.grid.leesf.decorator;

public class Main {
	public static void main(String[] args) {
		Food food = new Rice(3);
		food = new Chicken(food, 1);
		food = new Fish(food, 1);
		food = new Cabbage(food, 1);
		food = new PaperBowl(food, 1);
		food = new PlasticBag(food, 1);
		System.out.println("description is " + food.getDescription());
		System.out.println("total price is " + food.price());		
	}
}

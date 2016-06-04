package com.hust.grid.leesf.decorator;

public class Chicken extends Course {
	public Chicken(Food food, int number) {
		this.food = food;
		this.number = number;
	}
	
	@Override
	public String getDescription() {
		return food.getDescription() + ", " + this.number + " Chicken";
	} 
	
	@Override
	public double price() {
		return number * 5 + food.price();
	} 
}

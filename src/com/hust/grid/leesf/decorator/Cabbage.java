package com.hust.grid.leesf.decorator;

public class Cabbage extends Course {
	public Cabbage(Food food, int number) {
		this.food = food;
		this.number = number;
	}
	
	@Override
	public String getDescription() {
		return food.getDescription() + ", " + this.number + " Cabbage";
	} 
	
	@Override
	public double price() {
		return number * 5 + food.price();
	} 
}

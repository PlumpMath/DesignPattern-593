package com.hust.grid.leesf.decorator;

public class Fish extends Course {
	public Fish(Food food, int number) {
		this.food = food;
		this.number = number;
	}
	
	@Override
	public String getDescription() {
		return food.getDescription() + ", " + this.number + " Fish";
	} 
	
	@Override
	public double price() {
		return number * 5 + food.price();
	} 
}

package com.hust.grid.leesf.decorator;

public class Potato extends Course {
	public Potato(Food food, int number) {
		this.food = food;
		this.number = number;
	}
	
	@Override
	public String getDescription() {
		return description + ", " + this.number + " Potato";
	} 
	
	@Override
	public double price() {
		return number * 5 + food.price();
	} 
}

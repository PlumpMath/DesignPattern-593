package com.hust.grid.leesf.decorator;

public class PlasticBag extends Adds {
	public PlasticBag(Food food, int number) {
		this.food = food;
		this.number = number;
	}
	
	@Override
	public String getDescription() {
		return food.getDescription() + ", " + this.number + " PlasticBag";
	} 
	
	@Override
	public double price() {
		return number * 0.2 + food.price();
	} 
}

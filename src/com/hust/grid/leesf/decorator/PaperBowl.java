package com.hust.grid.leesf.decorator;

public class PaperBowl extends Adds {
	public PaperBowl(Food food, int number) {
		this.food = food;
		this.number = number;
	}
	
	@Override
	public String getDescription() {
		return food.getDescription() + ", " + this.number + " PaperBowl";
	} 
	
	@Override
	public double price() {
		return number * 0.3 + food.price();
	} 
}

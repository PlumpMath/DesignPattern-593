package com.hust.grid.leesf.decorator;

public abstract class Food {
	protected String description = "Unknown food";
	protected int number;
	
	public abstract double price();
	public String getDescription() {
		return description;
	}
}

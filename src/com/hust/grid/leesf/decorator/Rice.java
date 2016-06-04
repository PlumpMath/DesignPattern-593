package com.hust.grid.leesf.decorator;

public class Rice extends Food {	
	
	public Rice(int number) {
		this.number = number;
		description = this.number + " Rice";
	}
	
	@Override
	public String getDescription() {
		return description;
	}
	
	@Override
	public double price() {
		return number * 0.2;
	}
}

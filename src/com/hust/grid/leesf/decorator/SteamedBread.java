package com.hust.grid.leesf.decorator;

public class SteamedBread extends Food {
	
	public SteamedBread(int number) {
		this.number = number;
		description = this.number + " SteamedBread";
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

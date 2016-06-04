package com.hust.grid.leesf.decorator;

public class Noodle extends Food {	
	
	public Noodle(int number) {
		this.number = number;
		this.description = this.number + " Noodle";
	}
	
	@Override
	public String getDescription() {
		return description;
	}
	
	@Override
	public double price() {
		return number * 3.0;
	}
}

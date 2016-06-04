package com.hust.grid.leesf.decorator;

public abstract class Course extends Food {
	protected Food food;
	
	@Override
	public abstract String getDescription(); 
}

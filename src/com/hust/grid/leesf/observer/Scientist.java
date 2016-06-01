package com.hust.grid.leesf.observer;

public class Scientist implements Observer {
	private String name;
	public Scientist(String name) {
		this.name = name;
	}
	@Override
	public void update(String message) {
		System.out.println("I am " + name + ", received updated message from subject is [" + message + "]");
	}
}

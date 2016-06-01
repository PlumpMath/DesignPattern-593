package com.hust.grid.leesf.observer;

public class Coder implements Observer {
	private String name;
	public Coder(String name) {
		this.name = name;
	}
	@Override
	public void update(String message) {
		System.out.println("I am " + name + ", received updated message from subject is [" + message + "]");
	}
}

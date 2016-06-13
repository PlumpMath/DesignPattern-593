package com.hust.grid.leesf.command;

public abstract class Receiver {
	protected String name;
	public Receiver(String name) {
		this.name = name;
	}
	
	public void on() {
		System.out.println(this.name + " is on");
	}
	
	public void off() {
		System.out.println(this.name + " is off");
	}
}

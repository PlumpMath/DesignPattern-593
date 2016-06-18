package com.hust.grid.leesf.facade;

public class Facade {
	private Light light;
	private TV tv;

	public Facade(Light light, TV tv) {
		this.light = light;
		this.tv = tv;
	}
	
	public void on() {
		this.light.on();
		this.tv.on();
	}
	
	public void off() {
		this.light.off();
		this.tv.off();
	}
}

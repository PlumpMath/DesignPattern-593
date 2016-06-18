package com.hust.grid.leesf.facade;

public class Main {
	public static void main(String[] args) {
		Light light = new Light();
		TV tv = new TV();
		Facade facade = new Facade(light, tv);
		facade.off();
	}
}

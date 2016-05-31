package com.hust.grid.leesf.strategy;

public class Main {
	public static void main(String[] args) {
		Duck duck = new MallardDuck();
		FlyBehavior flyBehavior = new FlyWithWings();
		duck.setFlyBehavior(flyBehavior);
		QuackBehavior quackBehavior = new Quack();
		duck.setQuackBehavior(quackBehavior);
		duck.performQuack();
		duck.performFly();
		duck.swim();
		duck.display();
		System.out.println("------------------");	
		
		duck = new ModelDuck();
		flyBehavior = new FlyRocketPower();
		quackBehavior = new MuteQuack();
		duck.setFlyBehavior(flyBehavior);
		duck.setQuackBehavior(quackBehavior);
		duck.performQuack();
		duck.performFly();
		duck.swim();
		duck.display();
		System.out.println("------------------");	
		
	}
}

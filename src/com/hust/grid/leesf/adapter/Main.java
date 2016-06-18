package com.hust.grid.leesf.adapter;

public class Main {
	public static void main(String[] args) {
		FriedSteak friedSteak = new FriedSteak();
		friedSteak.taste();
		
		PorkChop porkChop = new PorkChop();
		PorkChopAdapter porkChopAdapter = new PorkChopAdapter(porkChop);
		porkChopAdapter.taste();
	}
}

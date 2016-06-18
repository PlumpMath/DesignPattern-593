package com.hust.grid.leesf.adapter;

public class PorkChopAdapter implements Steak {
	private PorkChop porkChop;
	
	public PorkChopAdapter(PorkChop porkChop) {
		this.porkChop = porkChop;
	}
	
	public void taste() {
		porkChop.taste();
	}
}

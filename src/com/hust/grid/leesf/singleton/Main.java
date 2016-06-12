package com.hust.grid.leesf.singleton;

public class Main {
	public static void main(String[] args) {	
		for (int i = 0; i < 5; i++) {
			new MyThread().start();
		}
	}
	
	static class MyThread extends Thread {
		public void run() {
			Cache cache = Cache.getInstance();
			System.out.println(cache);
		}
	}
}

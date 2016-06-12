package com.hust.grid.leesf.singleton;

public class Cache {
	private volatile static Cache cache;

	private Cache() {
	}

	public static Cache getInstance() {
		if (cache == null) {
			synchronized (Cache.class) {
				if (cache == null) {
					cache = new Cache();				
				}
			}
		}
		return cache;
	}
}

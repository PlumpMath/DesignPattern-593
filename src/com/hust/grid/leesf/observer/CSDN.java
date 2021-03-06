package com.hust.grid.leesf.observer;

import java.util.ArrayList;
import java.util.List;

public class CSDN implements Subject {
	private List<Observer> observers;
	private String message;
	
	public CSDN() {
		observers = new ArrayList<Observer>();
	}
	
	@Override 
	public void registerObserver(Observer observer) {
		observers.add(observer);
	} 
	
	@Override
	public void removeObserver(Observer observer) {
		int index = observers.indexOf(observer);
		if (index >= 0) {
			observers.remove(index);
		}
	}
	
	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(message);
		}
	}
	
	/**
	 * 模拟CSDN的文章更新了
	 * @param message
	 */
	public void setMessage(String message) {
		this.message = message;
		// 有更新
		messageChanged();
	}
	
	private void messageChanged() {
		// 通知观察者
		notifyObservers();
	}	
}

package com.hust.grid.leesf.command;

public class LightOnCommand implements Command {
	private Receiver light;
	
	public LightOnCommand(Receiver receiver) {
		this.light = receiver;
	}
	
	@Override
	public void execute() {
		light.on();
	}

	@Override
	public void undo() {
		light.off();
	}

}

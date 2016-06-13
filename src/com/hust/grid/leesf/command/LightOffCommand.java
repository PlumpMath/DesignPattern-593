package com.hust.grid.leesf.command;

public class LightOffCommand implements Command {
	private Receiver light;
	
	public LightOffCommand(Receiver receiver) {
		light = receiver;
	}
	
	@Override
	public void execute() {
		light.off();
	}

	@Override
	public void undo() {
		light.on();
	}
	
}

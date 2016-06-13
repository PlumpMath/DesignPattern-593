package com.hust.grid.leesf.command;

public class CeilingFanOffCommand implements Command {
	private Receiver ceilingFan;
	
	public CeilingFanOffCommand(Receiver receiver) {
		ceilingFan = receiver;
	}
	
	@Override
	public void execute() {
		ceilingFan.off();
	}

	@Override
	public void undo() {
		ceilingFan.on();
	}
}

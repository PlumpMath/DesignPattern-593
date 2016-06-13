package com.hust.grid.leesf.command;

public class CeilingFanOnCommand implements Command {
	private Receiver ceilingFan;
	
	public CeilingFanOnCommand(Receiver receiver) {
		ceilingFan = receiver;
	}
	
	@Override
	public void execute() {
		ceilingFan.on();
	}

	@Override
	public void undo() {
		ceilingFan.off();
	}
}

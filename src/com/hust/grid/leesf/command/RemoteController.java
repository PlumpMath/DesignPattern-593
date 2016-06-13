package com.hust.grid.leesf.command;

public class RemoteController {
	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;
	
	public RemoteController(int slotSize) {
		onCommands = new Command[slotSize];
		offCommands = new Command[slotSize];
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonWasPushed(int slot) {
		undoCommand = onCommands[slot];
		onCommands[slot].execute();
	}
	
	public void offButtonWasPushed(int slot) {
		undoCommand = offCommands[slot];
		offCommands[slot].execute();
	}
	
	public void undoButtonWasPushed() {
		undoCommand.undo();
	}
}

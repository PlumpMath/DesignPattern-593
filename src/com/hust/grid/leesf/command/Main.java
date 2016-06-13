package com.hust.grid.leesf.command;

public class Main {
	public static void main(String[] args) {
		// 遥控器
		RemoteController remoteController = new RemoteController(4);

		Light livingRoomLight = new Light("LivingRoomLight");
		Light kitchenLight = new Light("KitchenLight");
		CeilingFan ceilingFan = new CeilingFan("CeilingFan");
		
		LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);
		
		LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenLight);
		LightOnCommand kitchenLightOffCommand = new LightOnCommand(kitchenLight);
		
		CeilingFanOnCommand ceilingFanOnCommand = new CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
		
		Command[] partyOn = {livingRoomLightOnCommand, kitchenLightOnCommand, ceilingFanOnCommand};
		Command[] partyOff = {livingRoomLightOffCommand, kitchenLightOffCommand, ceilingFanOffCommand};
		MacroCommand macroOnCommand = new MacroCommand(partyOn);
		MacroCommand macroOffCommand = new MacroCommand(partyOff);
		
		remoteController.setCommand(0, livingRoomLightOnCommand, livingRoomLightOffCommand);
		remoteController.setCommand(1, kitchenLightOnCommand, kitchenLightOffCommand);
		remoteController.setCommand(2, ceilingFanOnCommand, ceilingFanOffCommand);
		remoteController.setCommand(3, macroOnCommand, macroOffCommand);
		
		// 模拟遥控按下按钮
		remoteController.onButtonWasPushed(3);
		// 撤销操作
		remoteController.undoButtonWasPushed();
	}
}

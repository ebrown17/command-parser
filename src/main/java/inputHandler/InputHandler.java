package inputHandler;

import java.util.Map;
import java.util.Scanner;

import state.State;

import command.Command;
import command.CommandList;

public class InputHandler {
	
	//private ConnectionState connectionState;
	private Scanner input;
	
	CommandList commandList = CommandList.INSTANCE;
	private Map<String,Command> commands = commandList.getCommandList();
	private State connectionState = State.INSTANCE;
	
	public InputHandler(Scanner input){		
		this.input=input;
		
		
	}

	
	public void getInput(){
		
		if(connectionState.isConnected()){
			processConnected();
		}
		else {
			processUnconnected();
		}
	}
	
	private void processUnconnected(){
		System.out.println("Connect to sign or type help for list of options, or exit to quit");
		String inputString=input.nextLine().toUpperCase();
		
		if(commandList.checkCommandList(inputString)){
			commandList.getCommandList().get(inputString).doCommand();		
		} else {
			commands.get("HELP").doCommand();
		}
		
	}
	
	private void processConnected(){
		System.out.println("Enter command or type help for list of commands or exit to quit");
		String inputString=input.nextLine().toUpperCase();
		
		if(commandList.checkCommandList(inputString)){
			commandList.getCommandList().get(inputString).doCommand();		
		} else {
			commands.get("HELP").doCommand();
		}
	}
	
	

	
	

	
}

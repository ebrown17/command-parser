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
		processInput();
	}
	
	private void processInput(){
		
		System.out.println(connectionState.getStateText());
		
		if(input.hasNext()){
			String inputString=input.nextLine().toUpperCase();
			
			if(commandList.checkCommandList(inputString)){
				commandList.getCommandList().get(inputString).doCommand();		
			} else {
				commands.get("HELP").doCommand();
			}
		} else {
			commands.get("EXIT").doCommand();
		}
	}
	
	
	
}

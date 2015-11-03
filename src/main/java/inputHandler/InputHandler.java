package inputHandler;

import java.util.Scanner;

import state.State;

import command.Command;
import command.CommandList;

public class InputHandler {	
	
	private Scanner input;	
	private CommandList commandList = CommandList.INSTANCE;
	private State connectionState = State.INSTANCE;
	private Command currentCommand;
	
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
			currentCommand = commandList.processCommand(inputString);
			currentCommand.execute();			
		} else {
			input.close();
		}
	}
}

package inputHandler;

import java.util.Map;
import java.util.Scanner;

import state.State;

import command.Command;
import command.CommandList;

public class InputHandler {
	
	//private ConnectionState connectionState;
	private Scanner input;
	private Map<String,Command> commands = CommandList.INSTANCE.getCommandList();
	private State connectionState = State.INSTANCE;
	
	public InputHandler(Scanner input){		
		this.input=input;
		
		
	}

	
	public void getInput(){
		
		if(!connectionState.isConnected()){
			
			processUnconnected();
		}
		else {
			processConnected();
		}
	}
	
	private void processUnconnected(){
		System.out.println("Connect to sign or type help for list of options, or exit to quit");
		String inputString=input.nextLine();
		
		if(inputString.equals("exit")){
			commands.get(inputString.toUpperCase()).doCommand();
			
		}
		if(inputString.equals("help")){			
			commands.get(inputString.toUpperCase()).doCommand();			
			
		}
		if(inputString.equals("connect")){
			commands.get(inputString.toUpperCase()).doCommand();
			
			connectionState.connected();
		}
	}
	
	private void processConnected(){
		System.out.println("Enter command or type help for list of commands or exit to quit");
		String inputString=input.nextLine();
		
		if(inputString.equals("exit")){
			commands.get(inputString.toUpperCase()).doCommand();
		}
		if(inputString.equals("disconnect")){
			// need to add disconnect command
			connectionState.disconnected();
		}
	}
	
	

	
	

	
}

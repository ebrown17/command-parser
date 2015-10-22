package command;

import java.util.HashMap;
import java.util.Map;

import command.commands.ConnectCommand;
import command.commands.DisconnectCommand;
import command.commands.ExitCommand;
import command.commands.HelpCommand;
import state.State;

public enum CommandList {
	
	INSTANCE;
	
	private CommandList(){
		buildConnectedCommandList();
		buildDisconnectedCommandList();
	}
	
	private final Map<String,Command> connectedCommands = new HashMap<String,Command>();
	private final Map<String,Command> disconnectedCommands = new HashMap<String,Command>();
	
	private State connectionState = State.INSTANCE;
	
	public void buildConnectedCommandList(){		
		connectedCommands.put("EXIT", new ExitCommand());
		connectedCommands.put("HELP", new HelpCommand());
		connectedCommands.put("DISCONNECT", new DisconnectCommand());		
	}
	
	public void buildDisconnectedCommandList(){		
		disconnectedCommands.put("EXIT", new ExitCommand());
		disconnectedCommands.put("CONNECT", new ConnectCommand());
		disconnectedCommands.put("HELP", new HelpCommand());		
	}
	
	public boolean checkCommandList(String command){
		
		if(connectionState.isConnected()){
			return connectedCommands.containsKey(command) ? true : false;
		}
		
		return disconnectedCommands.containsKey(command) ? true : false;
		
	}
	
	public Map<String,Command> getCommandList() {
		if(connectionState.isConnected()){
			return connectedCommands;
		}
		return disconnectedCommands;
	}
	
	

}

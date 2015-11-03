package command;

import java.util.LinkedHashMap;
import java.util.Map;

import state.State;

import command.commands.ConnectCommand;
import command.commands.DisconnectCommand;
import command.commands.ExitCommand;
import command.commands.HelpCommand;
import command.commands.ListAllCommand;
import command.commands.LoadAllCommand;
import command.commands.LoadCommand;
import command.commands.RemoveAllCommand;
import command.commands.RemoveCommand;
import command.commands.VerifyFilesCommand;

public enum CommandList {
	
	INSTANCE;
	
	private CommandList(){
		buildConnectedCommandList();
		buildDisconnectedCommandList();
	}
	
	private final Map<String,Command> connectedCommands = new LinkedHashMap<String,Command>();
	private final Map<String,Command> disconnectedCommands = new LinkedHashMap<String,Command>();
	
	private State connectionState = State.INSTANCE;
	
	public void buildConnectedCommandList(){		
		connectedCommands.put("LIST_ALL", new ListAllCommand());
		connectedCommands.put("LOAD", new LoadCommand());
		connectedCommands.put("LOAD_ALL", new LoadAllCommand());
		connectedCommands.put("REMOVE", new RemoveCommand());
		connectedCommands.put("REMOVE_ALL", new RemoveAllCommand());
		connectedCommands.put("VERIFY_FILES", new VerifyFilesCommand());
		connectedCommands.put("DISCONNECT", new DisconnectCommand());
		connectedCommands.put("HELP", new HelpCommand());
		connectedCommands.put("EXIT", new ExitCommand());
	}
	
	public void buildDisconnectedCommandList(){		
		disconnectedCommands.put("CONNECT", new ConnectCommand());
		disconnectedCommands.put("HELP", new HelpCommand());
		disconnectedCommands.put("EXIT", new ExitCommand());
	}
		
	public Command processCommand(String command){
		
		if(connectionState.isConnected()){
			return connectedCommands.containsKey(command) ? connectedCommands.get(command) : connectedCommands.get("HELP");
		}
		
		return disconnectedCommands.containsKey(command) ? disconnectedCommands.get(command) : disconnectedCommands.get("HELP");
		
	}	
	
	public Map<String,Command> commandList(){
		
		if(connectionState.isConnected()){
			return connectedCommands;
		}
		return disconnectedCommands;
	}

}

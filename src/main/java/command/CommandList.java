package command;

import java.util.HashMap;
import java.util.Map;

import command.commands.ConnectCommand;
import command.commands.ExitCommand;
import command.commands.HelpCommand;

public enum CommandList {
	
	INSTANCE;
	
	private CommandList(){
		buildCommandList();
	}
	
	private final Map<String,Command> commands = new HashMap<String,Command>();
	
	
	public void buildCommandList(){		
		commands.put("EXIT", new ExitCommand());
		commands.put("CONNECT", new ConnectCommand());
		commands.put("HELP", new HelpCommand());		
		
	}
	
	
	public Map<String,Command> getCommandList() {
		return commands;
	}
	
	

}

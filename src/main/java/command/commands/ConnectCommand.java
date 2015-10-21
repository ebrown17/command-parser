package command.commands;

import command.Command;
import command.CommandAction;

public class ConnectCommand extends Command {

	public ConnectCommand(){
		commandAction = new Connect();
	}
	
	
	private class Connect implements CommandAction {

		@Override
		public void executeCommand() {
			// add connection logic
			System.out.println("CONNECTING");
			
		}
		
	}
	
}

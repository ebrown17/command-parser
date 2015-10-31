package command.commands;

import command.Command;
import command.CommandAction;
import state.State;

public class ConnectCommand extends Command {

	private State connectionState = State.INSTANCE;
	
	public ConnectCommand(){
		commandAction = new Connect();
	}
	
	
	private class Connect implements CommandAction {

		@Override
		public void executeCommand() {
			// add connection logic
			System.out.println("CONNECTING");
			connectionState.connect();
		}
		
	}
	
}

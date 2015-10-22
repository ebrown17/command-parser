package command.commands;

import command.Command;
import command.CommandAction;
import state.State;


public class DisconnectCommand extends Command {

	private State connectionState = State.INSTANCE;
	
	public DisconnectCommand(){
		commandAction = new Disconnect();
	}
	
	
	private class Disconnect implements CommandAction {

		@Override
		public void executeCommand() {
			// add connection logic
			System.out.println("DISCONNECTING");
			connectionState.disconnected();
		}
		
	}
}

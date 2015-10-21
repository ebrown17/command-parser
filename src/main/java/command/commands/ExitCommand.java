package command.commands;

import command.Command;
import command.CommandAction;

public class ExitCommand extends Command {

	public ExitCommand(){
		commandAction = new Exit();
	}
	
	private class Exit implements CommandAction {

		@Override
		public void executeCommand() {
			//add proper program exitting close connection / null strings
			System.out.println("Closing program...");
			System.exit(0);
			
		}
		
	}
}

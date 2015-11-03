package command.commands;

import command.Command;
import command.CommandAction;

public class RemoveCommand extends Command {
	
	public RemoveCommand(){
		commandAction = new Remove();
	}
	
	private class Remove implements CommandAction {

		@Override
		public void executeCommand() {
			System.out.println("Removing file.... ");
			
		}
		
	}

}

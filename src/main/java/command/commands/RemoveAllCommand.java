package command.commands;

import command.Command;
import command.CommandAction;

public class RemoveAllCommand  extends Command {
	
	public RemoveAllCommand(){
		commandAction = new RemoveAll();
	}
	
	private class RemoveAll implements CommandAction {

		@Override
		public void executeCommand() {
			System.out.println("Removing all files.... ");
			
		}
		
	}

}

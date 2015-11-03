package command.commands;

import command.Command;
import command.CommandAction;


public class ListAllCommand extends Command {
	
	public ListAllCommand(){
		commandAction = new ListAll();
	}
	
	private class ListAll implements CommandAction {

		@Override
		public void executeCommand() {
			System.out.println("Listing all files.... ");
			
		}
		
	}

}
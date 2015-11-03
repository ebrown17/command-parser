package command.commands;

import command.Command;
import command.CommandAction;

public class LoadAllCommand extends Command {
	
	public LoadAllCommand(){
		commandAction = new LoadAll();
	}
	
	private class LoadAll implements CommandAction {

		@Override
		public void executeCommand() {
			System.out.println("Loading all files.... ");
			
		}
		
	}

}

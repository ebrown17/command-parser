package command.commands;

import command.Command;
import command.CommandAction;

public class LoadCommand extends Command {
	
	public LoadCommand(){
		commandAction = new Load();
	}
	
	private class Load implements CommandAction {

		@Override
		public void executeCommand() {
			System.out.println("Loading a file... ");
			
		}
		
	}

}

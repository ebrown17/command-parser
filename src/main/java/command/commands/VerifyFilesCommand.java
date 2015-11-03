package command.commands;

import command.Command;
import command.CommandAction;

public class VerifyFilesCommand extends Command {
	
	public VerifyFilesCommand(){
		commandAction = new VerifyFiles();
	}
	
	private class VerifyFiles implements CommandAction {

		@Override
		public void executeCommand() {
			System.out.println("Verifying all files.... ");
			
		}
		
	}

}

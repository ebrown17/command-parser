package command.commands;

import command.Command;
import command.CommandAction;
import command.CommandList;

public class HelpCommand extends Command{	

	
	public HelpCommand(){
		commandAction = new Help();
	}
	
	
	private class Help implements CommandAction {		
		
		@Override
		public void executeCommand() {		
			
			System.out.println("Command list: ");
			for(String s : CommandList.INSTANCE.getCommandList().keySet()){
				System.out.println(s);
			}
			
		}
		
	}

}

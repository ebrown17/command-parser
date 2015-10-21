package command;

public abstract class Command {

	protected CommandAction commandAction;
		
	public Command(){
		
	}	
	
	public void doCommand(){
		commandAction.executeCommand();
	}
}

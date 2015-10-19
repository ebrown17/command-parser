package inputHandler;

import java.util.Scanner;

import connection.ConnectionState;

public class InputHandler {
	
	private ConnectionState connectionState;
	private Scanner input;
	
	
	public InputHandler(Scanner input, ConnectionState connectionState){		
		this.input=input;
		this.connectionState=connectionState;
		
	}

	
	public void getInput(){
		
		if(!connectionState.isConnected()){
			
			processUnconnected();
		}
		else {
			processConnected();
		}
	}
	
	private void processUnconnected(){
		System.out.println("Connect to sign or type help for list of options, or exit to quit");
		String inputString=input.nextLine();
		
		if(inputString.equals("exit")){
			System.exit(0);
		}
		if(inputString.equals("connect")){
			connectionState.setConnected(true);
		}
	}
	
	private void processConnected(){
		System.out.println("Enter command or type help for list of commands or exit to quit");
		String inputString=input.nextLine();
		
		if(inputString.equals("exit")){
			System.exit(0);
		}
		if(inputString.equals("disconnect")){
			connectionState.setConnected(false);
		}
	}
	
	

	
	

	
}

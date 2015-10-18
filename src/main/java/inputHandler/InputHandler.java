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
		String inputString=input.nextLine();
		if(!connectionState.isConnected()){
			processUnconnected(inputString);
		}
		else {
			processConnected(inputString);
		}
	}
	
	private void processUnconnected(String inputString){
		if(inputString.equals("exit")){
			System.exit(0);
		}
		if(inputString.equals("connect")){
			connectionState.setConnected(true);
		}
	}
	
	private void processConnected(String inputString){
		if(inputString.equals("exit")){
			System.exit(0);
		}
		if(inputString.equals("disconnect")){
			connectionState.setConnected(false);
		}
	}
	
	

	
	

	
}

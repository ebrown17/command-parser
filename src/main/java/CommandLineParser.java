import java.util.Scanner;

import connection.ConnectionState;
import inputHandler.InputHandler;
import inputHandler.Parser;

public class CommandLineParser {


	private static InputHandler inputHandler;
	private static Scanner input;
	private static Parser inputParser;
	private static ConnectionState connectionState;
	
	public static void main(String [] args){
		
		input= new Scanner(System.in);
		connectionState = new ConnectionState();
		inputHandler = new InputHandler(input,connectionState);		
		
		while(true){
			
			if(!connectionState.isConnected()){				
				System.out.println("connect to sign or type help for list of options, or exit to quit");
				inputHandler.getInput();
				
			}
			else {
				System.out.println("Enter command or type help for list of commands or exit to quit");
				inputHandler.getInput();
				
			}
			
		}
		
	}

}	

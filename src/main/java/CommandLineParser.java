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
							
			inputHandler.getInput();				
						
		}
		
	}

}	

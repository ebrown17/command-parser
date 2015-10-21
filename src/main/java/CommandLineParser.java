import inputHandler.InputHandler;

import java.util.Scanner;

public class CommandLineParser {


	private static InputHandler inputHandler;
	private static Scanner input;	
	
	public static void main(String [] args){
		
		input= new Scanner(System.in);		
		inputHandler = new InputHandler(input);			
		
		while(true){							
			inputHandler.getInput();						
		}
		
	}

}	

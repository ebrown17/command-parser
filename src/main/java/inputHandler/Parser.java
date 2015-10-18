package inputHandler;



public class Parser {
	
	
	public Parser(){
		
	}
	
	public  void processInput(String inputString, boolean connectionState){		
		
		if(!connectionState){
			processUnconnected(inputString,connectionState);
		}
		else {
			processConnected(inputString,connectionState);
		}
		
	}
	
	private void processUnconnected(String inputString, boolean connectionState){
		if(inputString.equals("exit")){
			System.exit(0);
		}
		if(inputString.equals("connect")){
			connectionState=true;
		}
	}
	
	private void processConnected(String inputString, boolean connectionState){
		if(inputString.equals("exit")){
			System.exit(0);
		}
		if(inputString.equals("connect")){
			connectionState=false;
		}
	}
	

}

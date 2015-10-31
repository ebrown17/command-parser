package state;

public enum State {
	
	INSTANCE;
	
	private enum States {
		
		DISCONNECTED("Connect to sign or type help for list of options, or exit to quit"),
		CONNECTED("Enter command or type help for list of commands or exit to quit");
		
		final private String statesText;
		
		States(String statesText){
			this.statesText=statesText;
		}
		
		private String getStatesText(){
			return statesText;
		}
		
	}
	
	private States state;
	
	private State(){
		this.state = States.DISCONNECTED;
		
	}
			
	private void setState(States state){
		this.state=state;
	}
	
		
	public boolean isConnected(){
		
		return state == States.CONNECTED ? true : false;
	}
	
	public void connect(){
		setState(States.CONNECTED);		
	}
	
	public void disconnect(){
		setState(States.DISCONNECTED);
	}
	
	public String getStateText(){
		return state.getStatesText();
	}
	

}

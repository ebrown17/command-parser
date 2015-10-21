package state;

public enum State {
	
	INSTANCE;
	
	public enum States {
		DEFAULT,
		CONNECTED,
		DISCONNECTED;		
	}
	
	private States state;
	
	private State(){
		this.state = States.DEFAULT;
	}
			
	private void setState(States state){
		this.state=state;
	}
	
		
	public boolean isConnected(){
		
		return state == States.CONNECTED ? true : false;
	}
	
	public void connected(){
		setState(States.CONNECTED);		
	}
	
	public void disconnected(){
		setState(States.DISCONNECTED);
	}
	

}

package co.edureka;

interface State {
	void showState();
}

class InitialState implements State{
	public void showState(){
		System.out.println("==Initial State==");
	}
}

class FinalState implements State{
	public void showState(){
		System.out.println("==Final State==");
	}
}

class Context{
	
	State state; // Context HAS-A State
	
	void changeState(State s){
		state = s;
	}
	
	State getState(){
		return state;
	}
	
}

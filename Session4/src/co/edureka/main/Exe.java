package co.edureka.main;

import co.edureka.one.One; // public class can be imported
//import co.edureka.one.Two; // default class cannot be imported

// Inheritance across the package
class Child extends One{
	
	void show(){
		//pvtShow(); err not inherited
		//defShow(); err not inherited
		
		protShow(); // protected method is inherited outside the package, but behaves like private
	}
}

public class Exe {

	public static void main(String[] args) {
		
		//One o = new One();
		// o.pvtShow(); err
		// o.defShow(); err
		// o.protShow(); err
		//o.pubShow();
		
		Child ch = new Child();
		//ch.pvtShow(); //err
		//ch.defShow(); //err
		//ch.protShow(); //err
		ch.pubShow();
		ch.show();
		
	}

}

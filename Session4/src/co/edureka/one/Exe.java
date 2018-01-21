package co.edureka.one;

public class Exe {

	public static void main(String[] args) {
		
		One o = new One();
		Two t = new Two();
		
		// o.pvtShow(); err
		o.defShow();
		o.protShow();
		o.pubShow();
		
		System.out.println("---------");
		
		// t.pvtShow(); err
		t.defShow();
		t.protShow();
		t.pubShow();
		
	

	}

}

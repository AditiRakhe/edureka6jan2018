
public class WrapperDemo {

	public static void main(String[] args) {
		
		// Primitives
		int i = 10;
		char ch = 'A';
		float f = 2.2f;
		
		/*
		// Explicit Statements
		// Wrap primitives into objects | BOXING
		Integer iRef = new Integer(i);
		Character cRef = new Character(ch);
		Float fRef = new Float(f);
		
		// UnWrap primitives from Objects | UNBOXING
		int j = iRef.intValue();
		char d = cRef.charValue();
		float g = fRef.floatValue();
		*/
		
		// Implicit Statements
		// Wrap primitives into objects | AUTO-BOXING
		Integer iRef = i; // Integer iRef = new Integer(i);
		Character cRef = ch;
		Float fRef = f;
		
		// UnWrap primitives from Objects | AUTO-UNBOXING
		int j = iRef; // int j = iRef.intValue();
		char d = cRef;
		float g = fRef;
		
		System.out.println(j+" - "+d+" - "+g);
		

	}

}

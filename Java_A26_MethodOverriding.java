

class A{
	
	public int a;
	
	public int vinay() {
		return 4;
	}
	
	public void meth2() {
		System.out.println("I,m a meth 2 class A...");
	}
	
	public void meth3() {
		System.out.println("I,m a meth 3 class A...");
	}
}

class B extends A{

	
	public void meth2() {
		System.out.println("I,m a meth 2 class B...");
	} 
	
	public void meth3() {
		System.out.println("I,m a meth 3 class B...");
	}
}


public class Java_A26_MethodOverriding {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		A a = new A();
		a.meth2();
		a.meth3();
		
		B b = new B();
		b.meth2();
		b.meth3();
		 
	}
}

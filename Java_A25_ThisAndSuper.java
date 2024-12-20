
class ekClass{
	int a;
	
	
	public int getA() {
		return a;
	}

	public ekClass(int v){
		this.a = v;		
	}
	
	public int returnOne() {
		return 1;
	}	
}

class doClass extends ekClass{
	doClass(int c){
		super(c);
		System.out.println("I,m a Constructor...");
	}
}



public class Java_A25_ThisAndSuper {
	
	public static void main(String[] args) {
		
		ekClass e = new ekClass(5);
		doClass d = new doClass(6);
		
		System.out.println(e.getA());
	}
}

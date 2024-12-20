
class varargs{
	
	int result;
	varargs(int x,int ...arr){
		this.result = x;
		for(int a: arr) {
			result += a;
			
			
		}
	}
	
	public int print() {
		return result;
	}
}

public class Java_A18_VariableArgument_VarArgs {
	
//	static int sum(int a, int b) {
//		return a + b;
//	}
//	
//	static int sum(int a, int b, int c) {
//		return a + b + c;
//	}
//	
//	static int sum(int a, int b, int c, int d) {
//		return a + b + c + d;
//	}
	
	static int sum(int x,int ...arr) {
		int result = x;
		for(int a: arr) {
			result += a;
		}
		
		return result;
	}
	
	static int sum1(int y,int ...arr) {
		int result = y;
		for(int a: arr) {
			result += a;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Varargs tutorial...");
		System.out.println("The sum of Nothing is " + sum(1));
		System.out.println("The sum of 4 and 5 is " + sum(4,5));
		System.out.println("The sum of 4, 3 and 5 is " + sum(4,3,5));
		System.out.println("The sum of 2, 4, 3 and 5 is " + sum(2,4,3,5));
		System.out.println("The sum of 2, 4, 3 and 5 is " + sum(2,4,3,5,6));
		
		System.out.println("Try... " + sum1(4,6,7,5));
		
		varargs vr = new varargs(55, 66, 77, 88);
		
		System.out.println(vr.print());
	}
}

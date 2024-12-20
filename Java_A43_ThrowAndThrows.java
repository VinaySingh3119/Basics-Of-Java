
class NegativeRadius extends Exception{
	public String toString() {
		return "Rardius cannot be negative";
	}
	
	public String getMessage() {
		return "Radius cannot be negative";
	}
}

public class Java_A43_ThrowAndThrows {
	
	public static double area(int r) throws NegativeRadius{
		if(r<0) {
			throw new NegativeRadius();
		}
		double result = Math.PI * Math.pow(r, 2);
		return result;
	}
	
	public static int devide(int a, int b) throws ArithmeticException{		
		int result = a/b;
		return result;
	}
	
	public static void main(String[] args) {
		
		
		try {
//			int c = devide(5,0);
//			System.out.println(c);
			
			double d = area(4);
			System.out.println(d);
		}
		catch(Exception e){
			System.out.println("This is Exception:");
		}
	}
}

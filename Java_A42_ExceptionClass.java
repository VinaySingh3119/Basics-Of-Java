
import java.util.Scanner;



class MyException extends Exception{
	
	public String toString() {
		return super.toString() + " I,m toString()";
	}
	
	public String getMessage() {
		return super.getMessage() + " I,m getMessage";
	}
	
}

public class Java_A42_ExceptionClass {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the input:");
		int a = sc.nextInt();
		
		if(a<9) {
			try {
				throw new MyException();
			}
			catch(Exception e){
				System.out.println(e.getMessage());
				System.out.println(e.toString());
				e.printStackTrace();
				System.out.println(e);
			}
		}
		
		
	}
}

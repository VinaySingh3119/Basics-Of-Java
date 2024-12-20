
public class Java_A17_Methods_2 {
	
	static void foo() {
		System.out.println("Good morning Bro!");
	}
	
	static void foo(int a) {
		System.out.println("Good morning " + a + " Bro!");
	}
	
	static void foo(int a, int b) {
		System.out.println("Good morning " + a + " Bro!");
		System.out.println("Good morning " + b + " Bro!");
	}
	
	static int change(int a) {
		a = 65;
		return a;
	}
	
	static void change2(int []arr) {
		arr[0] = 98;
	}
	
	static void tellJoke() {
		System.out.println("I invented a new word\n" + 
				"Plagirams!");
	}
	
	public static void main(String[] args) {
//		tellJoke();
		
//		Case 1 -> Changing the intiger 
		
//		int x = 45;
//		int y = change(x);
//		System.out.println("The value of x after running change is - " + y);
		
//		Case 2 -> Changing the Array 
		 
		 
//		int [] marks = {52, 73, 72, 89, 98, 94};
//		
//		change2(marks);
//		System.out.println("The marks of arr[0] after running change2 is: " + marks[0]);
		foo();
		foo(3000);
		foo(3000,4000);
		// Argument are actual
	}
}

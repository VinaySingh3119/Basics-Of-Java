
import java.util.Scanner;

public class Java_A41_TryCatchException {
	public static void main(String[] args) {
		
//		Try, Catch
		
//		int a = 6000;
//		int b = 0;
//		
//		
//		try {
//			int c = a/b;
//			System.out.println("The result is " + c);
//		}
//		catch(Exception e) {
//			System.out.println("We failed to devide: Reason.");
//			System.out.println(e);
//		}
		
//		Handling Specific Exception in Java
		
		Scanner sc = new Scanner(System.in);
		
		int marks[] = new int[5];
		marks [0] = 7;
		marks [1] = 6;
		marks [2] = 8;
		
		System.out.println("Enter the array index:");
		int ind = sc.nextInt();
		
		System.out.println("Enter the number to devide the value with");
		int num = sc.nextInt();
		
		try {
			System.out.println("The value of array index entered is: " + marks[ind]);
			System.out.println("The value at array-value/number is: " + marks[ind]/num);
		}
		catch(ArithmeticException e){
			System.out.println("ArithmeticException occured:");
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException occured:");
			System.out.println(e);
		}
		catch(Exception e){
			System.out.println("Some other Exception");
			System.out.println(e);
		}
		
		
//		Nasted Try, Catch
		
//		int marks[] = new int[3];
//		marks[0] = 6;
//		marks[1] = 5;
//		marks[2] = 8;
//		
//		boolean flag = true;
//		
//		while(flag) {
//			System.out.println("Enter the index of array:");
//			int ind = sc.nextInt();
//			
//			try {
//				System.out.println("Hello, Welcome:");
//				try {
//					System.out.println(marks[ind]);
//					flag = false;
//				}
//				catch(ArrayIndexOutOfBoundsException e){
//					System.out.println("Sorry this index does not exist");
//					System.out.println("Exception level 2:");
//				}
//			}
//			catch(Exception e) {
//				System.out.println("Exception level 1:");
//			}
//			
//		}
		
		System.out.println("Thanks for using this program:");
		
	}
}


import java.util.Scanner;

public class Java_9_Relation_And_Logic_Operator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("For logicial And...");
//		boolean a = true;
//		boolean b = true;
//		boolean c = false;
//		
//		if (a&&b&&c) {
//			System.out.println("Yes");
//		}
//		else {
//			System.out.println("No");
//		}
		
		

//		System.out.println("For logicial Or...");
		boolean a = true;
		boolean b = true;
		
	
		if (a||b) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
//		System.out.println("For Logical NOT...");
//		System.out.print("NOT(A) is ");
//		System.out.println(!a);
//		System.out.print("NOT(B) is ");
//		System.out.println(!b);
		
		System.out.println("Enter your age ");
		int age = sc.nextInt();
		
		if (age>56) {
			System.out.println("You are experienced ");
		}
		else if(age>46) {
			System.out.println("You are semi-experienced ");
		}
		else if(age>36) {
			System.out.println("You are semi-semi-experienced ");
		}
		else {
			System.out.println("You are not experience  ");
		}
}

	
}

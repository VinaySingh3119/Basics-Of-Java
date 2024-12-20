
import java.util.Scanner;

public class Java_A10_Switch_Case_Statements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Enter your age ");
//		int age = sc.nextInt();
		
//		char var = 'v';
//		switch(var) {
//		case 'v':
//		{
//			System.out.println("You are going to adult ");
//		}
//		break;
//		case 'k':
//		{
//			System.out.println("You are going to Job  ");
//		}
//		break;
//		case 'j':
//		{
//			System.out.println("You are going to retired  ");
//		}
//		break;
//		default:
//		{
//			System.out.println("Enjoy your life");
//		}
//		}
//		
//		System.out.println("Thanks for using my Java Programm");
//	}
		System.out.println("Enter your name ");
		String var = sc.next();
		
//		switch(var) {
//		case "Vinay":
//		{
//			System.out.println("You are going to adult ");
//		}
//		break;
//		case "Shubham":
//		{
//			System.out.println("You are going to Job  ");
//		}
//		break;
//		case "Shobhit":
//		{
//			System.out.println("You are going to retired  ");
//		}
//		break;
//		default:
//		{
//			System.out.println("Enjoy your life");
//		}
//		}
		
//		System.out.println("Thanks for using my Java Programm");
		
		switch(var) {
		case "Vinay" -> {System.out.println("You are going to become an adult ");
						System.out.println("You are going to become an adult ");    
						System.out.println("You are going to become an adult ");
		}
		case "Shubham" -> System.out.println("You are going to join a job ");
		case "Shobhit" -> System.out.println("You are going to get retired ");
		default -> System.out.println("Enjoy your life ");
		}
	}

}

import java.util.Scanner;

public class Java_8_If_else_Statement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your age! ");
		int age = sc.nextInt();
		
		if (age>18) {
			System.out.println("Yes boy you can derive! ");
		}
		else if(age>=18) {
			System.out.println("Now you can derive!");
		}
		else {
			System.out.println("You are not elegible to derive!");
		}
		
	}

}

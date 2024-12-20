

import java.util.Scanner;

public class Java_A40_Error {
	public static void main(String[] args) {
		
/*   	Example of Syntax Error
 * 		int a = 5 --> Throw an Error because no Semicolon
 * 		System.out.println(a+b); --> Throw an Error because b variable not decleare 
 */
		
/* 		Example of Logical Error
 * 		Write a program to print all prime number between 1 to 10
 * 		
 * 		System.out.println("2"); 
 * 
 * 		for(int i = 1; i<5; i++){ --> This is example of syntax error because this print incorrect prime number
 * 		System.out.println(2*i+1);
 * 		}
 */
		
		
//		System.out.println("This is the correct program to print a prime between number 1 to 10:");
//		int count;
//		for(int i = 1; i <= 10; i++) {
//			count = 0;
//			for(int j = 1; j <= i; j++) {
//				if(i%j==0) {
//					count++;
//				}
//			}
//			if(count==2) {
//				System.out.println(i);
//			}
//		}
		
		
/*		Example of Runtime Error
 * 
 *		int k;
 *		
 *		Scanner sc = new Scanner(System.in);
 *		System.out.println("Enter the Integer number:");
 *		k = sc.nextInt();
 *		
 *		System.out.println("Integer part of 1000 devide by k " + 1000/k); -->Throw an error if user take 0 input
 */
		
	}
}


import java.util.Scanner;

public class Java_A19_Recursion{
	
	static int Recu(int n) {
		int z;
		if(n <= 1) {
			return 1;
		}
		
		else {
			return z = n * Recu(n - 1);
		}
	}
	
	static int Febo(int f) {
		int a;
		
		if(f < 1) {
			return 1;
		}

		
		else {
			return a = Febo(f - 1) + Febo(f - 2);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter the fibonnaci number ...");
			
			int n = sc.nextInt();

			
//			for (int i = 0; i < n; i++) {
//				if (i < 1) {
//					System.out.print("0 ");
//				}
//				else {
//					System.out.print(Febo(i-2) + " ");
//				}
//				
//			}
//			System.out.println("");
			
			System.out.println(Febo(n - 3));
			
		}
		
	}
	
}

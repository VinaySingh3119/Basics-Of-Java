
public class Java_A12_BreakAndContinue {

	public static void main(String[] args) {
//		Break and continue using for loops
		
//		for (int i = 0; i < 5; i++) {
//			System.out.println(i);
//			System.out.println("Java is great...");
//			
//			if(i==2) {
//				System.out.println("Ending the loop");
//				break;
//			}
//		}
		
//		Break and continue using while loops
		
//		int i = 0;
//		while (i<5) {
//			System.out.println(i);
//			System.out.println("Java is great...");
//			i++;
//			
//			if(i==3) {
//				System.out.println("Ending the loop...");
//				break;
//			}
//		}
//		System.out.println("Loops ends here...");
		
		for (int i = 0;i < 5;i++) {
			
			if(i==2) {
				System.out.println("Ending the loop...");
				continue;
			}
			
			System.out.println(i);
			System.out.println("Java is great...");
		}
		
	}

}
